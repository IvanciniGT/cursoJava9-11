package com.curso.diccionario.impl;

import com.curso.diccionario.*;
import java.util.*;

public class ProveedorDeDiccionariosImpl implements ProveedorDeDiccionarios {
    
    private static final DiccionarioEspanol de=new DiccionarioEspanol();
    
    public ProveedorDeDiccionariosImpl(){}
    
    public Optional<Diccionario> getDiccionario(String idioma){
        if (idioma.equalsIgnoreCase("es"))
            return Optional.of(de);
        return Optional.empty();
    }
    
}