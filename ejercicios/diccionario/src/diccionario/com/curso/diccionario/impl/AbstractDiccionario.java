package com.curso.diccionario.impl;

import java.util.*;
import java.net.*;
import java.io.*;

public abstract class AbstractDiccionario implements Diccionario {
    
    private final Map<String, List<String>> terminos;
    private final String idioma;
    
    public AbstractDiccionario(String idioma){
        this.idioma = idioma;
        this.terminos = cargarTerminos();
    }

    public boolean existe(String termino){
        
    }
    
    public Optional<List<String>> getDefiniciones(String termino){
        
    }
    
    public String getIdioma(){
        return this.idioma;
    }
    
    // Cargar la lista de términos desde un fichero
    private Map<String, List<String>> cargarTerminos() {
        //manzana=Fruto del manzano
        //melón=Fruto del melonero|Persona con pocos conocimientos
        
        Properties terminosLeidos = new Properties();
        
        String nombreFicheroConLosTerminos = "terminos/diccionario."+getIdioma()+".properties";
        URL urlFicheroConLosTerminos = Objects.requireNonNull(getClass().getClassLoader().getResource(nombreFicheroConLosTerminos)); // Java 1.7
                                        // Me lanza un nullpointerException CONTROLADO POR MI, donde se lanza... no por ahí abajo
                                        // Que luego me vuelvo loco haciendo debuging
                                        // MUY BUENA PRACTICA !
        // ^^^ GENIAL... se carga a nivel de MODULO !
        String ficheroConLosTerminos = urlFicheroConLosTerminos.getFile();
        
        try( FileReader fileReader=new FileReader(ficheroConLosTerminos) ) {
            properties.load(fileReader);
        } catch(IOException e) {
            throw new RuntimeException(e); //OJO 
        }
        
        // Streams 
        //properties. ----> map
    }
    
}