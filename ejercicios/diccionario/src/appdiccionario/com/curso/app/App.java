package com.curso.app;

import com.curso.diccionario.*;
import java.util.*;

public class App {
    
    public static void main(String[] args){
        String termino=args[0];
                                                        // Inyeccion de dependencias
        Iterable<ProveedorDeDiccionarios> proveedores = ServiceLoader.load(ProveedorDeDiccionarios.class);
                                                                            // Inversion de dependencias
                                                                            // El empleo de Una Interfaz para acceder a una funcionaldiad
        ProveedorDeDiccionarios provDict = proveedores.iterator().next();
        // Lo suyo sería validar que el optional tiene algo. provDict.getDiccionario("es").isPresent()
        Diccionario dict = provDict.getDiccionario("es").get(); // Lanza exception
        
        System.out.println(termino);
        System.out.println(dict.existe(termino));
        if(dict.existe(termino)){
            System.out.println(dict.getDefiniciones(termino).get());
        }else{
            System.out.println(dict.getSugerencias(termino));
        }
    }
    
}