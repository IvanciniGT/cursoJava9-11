import java.util.*;

public class Colecciones {
    
    public static void main(String[] args){
        
        // Java 9. Métodos .of en colecciones
        List<String> miLista = List.of("item1", "item2", "item3");  // comodo
        Set<String>  miSet   = Set.of("item1", "item2", "item3");  // comodo
        Map<String,String> miMap = Map.of("item1", "valor1", "item2", "valor2", "item3", "valor3");  // comodo
        
        // Java 10. Métodos CopyOf
        List<String> miLista2 = List.copyOf(miLista);
        Set<String>  miSet2   = Set.copyOf(miSet);
        Map<String,String> miMap2 = Map.copyOf(miMap);
        
        // Todas las colecciones resultantes de estos métodos SON INMUTABLES !
        miLista.stream().forEach( texto -> System.out.println(texto) );
        miLista.stream().forEach( (texto) -> System.out.println(texto) );
        miLista.stream().forEach( (String texto) -> System.out.println(texto) );
        miMap2.entrySet().stream().forEach( (Map.Entry<String,String> me) -> System.out.println("Clave: "+ me.getKey()+" Value: "+ me.getValue()) );
        miMap2.entrySet().stream().forEach( me -> System.out.println("Clave: "+ me.getKey()+" Value: "+ me.getValue()) );
        var numero = 17;
        //Error de compilación: miMap2.entrySet().stream().forEach( (@NonNull me) -> System.out.println("Clave: "+ me.getKey()+" Value: "+ me.getValue()) );
        // Si compila... pero es insufrible miMap2.entrySet().stream().forEach( (@NonNull Map.Entry<String,String> me) -> System.out.println("Clave: "+ me.getKey()+" Value: "+ me.getValue()) );
        // GUAY ! La palabra var me permite poner anotaciones antes, sin necesidad de dar el tipo completo !
        // miMap2.entrySet().stream().forEach( (@NonNull var me) -> System.out.println("Clave: "+ me.getKey() +" Value: "+ me.getValue()) );

        // Para compilar esto usualmente haríamos:  javac Colecciones.java -> Colecciones.class
        // Para ejecutar esto, después de compilar: java  Colecciones
        
        // Cambio nuevo Java11
        // Podemos ejecutar directamente un fichero .java con : java Colecciones.java
    }
    
}