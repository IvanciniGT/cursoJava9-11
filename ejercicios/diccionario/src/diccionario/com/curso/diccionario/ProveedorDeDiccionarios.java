package com.curso.diccionario;
import java.util.*;

public interface ProveedorDeDiccionarios {
    
    Optional<Diccionario> getDiccionario(String idioma);
    
}