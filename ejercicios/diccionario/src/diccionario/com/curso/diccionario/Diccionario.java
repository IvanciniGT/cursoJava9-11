package com.curso.diccionario;

public interface Diccionario {
    
    boolean existe(String termino);
    
    Optional<List<String>> getDefiniciones(String termino); // Java 1.8
    
    List<String> getSugerencias(String termino);
    
    String getIdioma();
    
}