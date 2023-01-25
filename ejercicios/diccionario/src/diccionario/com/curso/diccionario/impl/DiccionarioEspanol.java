package com.curso.diccionario.impl;
import java.util.*;
import java.util.stream.*;

public class DiccionarioEspanol extends AbstractDiccionario {
    
    public static final int PUNTUACION_MAXIMA=2;
    
    public DiccionarioEspanol(){
        super("ES");
    }
    
    public List<String> getSugerencias(String original){
        
        // 1º termino -> minusculas
        // 2º Para cada termino que tengo en el mapa de terminos (claves)
        //      Calcular la distancia al termino buscado según  //computeLevenshteinDistance    
        //      --> barato? caro! Muuuchos terminos... Me puede interesa usar toda mi potencia de calculo
        // 3º Eliminar todos los términos que difieran en más de UN VALOR QUE YO PREDEFINA. 2 o 3
        // 4º Devolveré las mejores ! Ordeno por las de menor distancia --> COMO EL CULO !
        // 5º Filtra y quedarme con las 5 mejores? 
        // Y esas ya las devuelvo
        String terminoEnMinusculas = original.toLowerCase();
        // protected final Map<String, List<String>> terminos;

        return this.terminos.keySet().parallelStream()                                                              // Una colección con los terminos
                // a cada termino, le calculo su distancia
                .map( (termino) -> new TerminoPuntuado(termino, LevenshteinDistance.computeLevenshteinDistance(termino,terminoEnMinusculas ) ) )
                                                                                                                    // Una colección de TerminosPuntuado
                // Quito los que estén a más de 2 
                .filter( (terminoPuntuado) -> terminoPuntuado.puntuacion <= DiccionarioEspanol.PUNTUACION_MAXIMA )  // Una colección de TerminosPuntuado
                // Ordeno pòr las puntuaciones
                .sorted( Comparator.comparing( (terminoPuntuado) -> terminoPuntuado.puntuacion ) )                  // Una colección de TerminosPuntuado
                // Me quedo con 5
                .limit(5)
                .map( (terminoPuntuado) -> terminoPuntuado.termino )                                                // Una colección de terminos
                // Convertirla en lista
                .collect(Collectors.toList()); // Acabado
    }

    private static class TerminoPuntuado{
        public String termino;
        public int    puntuacion;
        public TerminoPuntuado(String termino, int puntuacion){
            this.termino=termino;
            this.puntuacion=puntuacion;
        }
    }
}