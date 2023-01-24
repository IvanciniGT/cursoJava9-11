package com.curso.paquetea;

public interface Interfaz {
    
    String dameTexto(); // Ya no hay que ponerle public. Es por defecto. 
                        // De hecho, los analizadores de código lloran antes esto.
    
    public static String dameOtroTexto(){  // Esto es Java 1.8
        return dameOtroTexto2();
    }
    
    private static String dameOtroTexto2(){  // Esto es Java 1.8
        return "Hola desde el Interfaz";
    }
    
    /* 
    Hace referencia a que esta función tienen un valor por defecto en la interfaz, 
    que a nivel de las clases que implementen la interfaz puede estar sobreescrito.
    Esto antes necesitaba hacerlo desde una clase Abstracta
    */
    default String despedida(){
        return "Adios!";
    }
    // Para que sirven los metodos default en las interfaces...
    // Si quiero cambiar la interfaz para ampliar su funcionalidad y añadirle un método nuevo.
    // Y se lo pongo, las 800 personas que hayan implementado mi interfaz me van a correr a gorrazos!
    // Facilito la incorporación de funcionalidad a una interfaz. Sin que nadie a priori 
    // tenga que hacer cambios en su código (las clases que implementan esta interfaz)
    
}

// Las interfaces no son instanciables ! Sigue habiendo una diferencia enorme con las clases