package com.curso.diccionario;

public interface Diccionario {
    
    boolean existe(String termino);
    
    Optional<List<String>> getDefiniciones(String termino); // Java 1.8
        // MALAS PRACTICAS
        // null? NO... ya que :
            // Primero, que me han dicho que iba a ecibir según el API, la definición: Una Lista
            //      He recibido una lista? NO ---> NullPointerException
            //      Ya lo puedo documentar.... y quién lee una documentación? SOMOS POCOS !
        // Lista vacia? NO... Ya que:
            // El que llama a la función y recibe una lista, que piensa? Que todo esta bien
                // Me tego que meter en comprobaciones adicionales arbitrarias: longitud de la lista es > 0
            // tiene un coste... aunque no muy grande
        // Una exception ? NO.... Ya que: 
            // primero: conceptualmente no tiene sentido
            // segundo: Es un proceso muy caro
            
        // Al poner un optional TODO QUEDA EXPLICITADO : GENIAL: MUY BUENA PRACTICA !

    List<String> getSugerencias(String termino); 
        // Ante cualquier termino, yo voy a calcular unas sugerencias.
        // Las encontraré o no! No pasa nada. aña : año ama ala acá
    
    String getIdioma();
    
}