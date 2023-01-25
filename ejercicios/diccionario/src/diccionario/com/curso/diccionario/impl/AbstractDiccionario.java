package com.curso.diccionario.impl;

import com.curso.diccionario.*;
import java.util.stream.*;
import java.util.*;
import java.net.*;
import java.io.*;

public abstract class AbstractDiccionario implements Diccionario {
    
    protected final Map<String, List<String>> terminos;
    private final String idioma;
    
    public AbstractDiccionario(String idioma){
        this.idioma = idioma;
        this.terminos = cargarTerminos();
    }

    public boolean existe(String termino){
        return terminos.containsKey(termino.toLowerCase());
    }
    
    public Optional<List<String>> getDefiniciones(String termino){
        return Optional.ofNullable(terminos.get(termino.toLowerCase()));
    }
    
    public String getIdioma(){
        return this.idioma;
    }
    
    // Cargar la lista de términos desde un fichero
    private Map<String, List<String>> cargarTerminos() {
        
        Properties terminosLeidos = new Properties();
        
        String nombreFicheroConLosTerminos = "diccionario."+getIdioma()+".properties";
        URL urlFicheroConLosTerminos = Objects.requireNonNull(getClass().getClassLoader().getResource(nombreFicheroConLosTerminos)); // Java 1.7
                                        // Me lanza un nullpointerException CONTROLADO POR MI, donde se lanza... no por ahí abajo
                                        // Que luego me vuelvo loco haciendo debuging
                                        // MUY BUENA PRACTICA !
        // ^^^ GENIAL... se carga a nivel de MODULO !
        String ficheroConLosTerminos = urlFicheroConLosTerminos.getFile();
        
        try( FileReader fileReader=new FileReader(ficheroConLosTerminos) ) { // Debia implementar: Closeable
            terminosLeidos.load(fileReader);
        } catch(IOException e) {
            throw new RuntimeException(e); //OJO 
        }
        //manzana=Fruto del manzano
        //Melón=Fruto del melonero|Persona con pocos conocimientos

        // Streams                                      //Set<Map.Entry<String,String>>
        Map<String, List<String>> terminos = terminosLeidos.entrySet().stream()
            .collect( Collectors.toMap(
                                            (me) ->   me.getKey().toString().toLowerCase(),
                                            (me) ->   List.of(me.getValue().toString().split("|"))
                                      ) );
                                      
        terminosLeidos.entrySet().stream()
            .forEach( 
                                            (me) ->   System.out.println(me.getValue().toString().split(" ")[0])
                                      );
                                      
        
        // key.toLowerCase()
        //value.split("|")-> Array textos -> List
        return terminos;
    }
    
}