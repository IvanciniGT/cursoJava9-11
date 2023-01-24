import java.util.function.Function; //JAVA 1.8
import java.util.*;
public class App {
    
    public static void main(String[] args){
        System.out.println(App.doblar(5));
        System.out.println(App.mitad(5));
        // Programación funcional:
        // Capacidad de referenciar desde una variable a una función.
        // en el momento que puedo hacer esto,:
        // 1º Puedo pasar funciones como argumento a otras funciones
        // 2º Puedo devolver una función como resultado de otra función
        
        imprimir(App.doblar(5));
        // ESTOS DOS BLOQUES TIENEN EL MISMO COMPORTAMIENTO
        double resultado = App.mitad(5);
        imprimir(resultado);
        // ESTA LINA SIGUIENTE SE COMPORTA DIFERENTE
        // Quien va a llamar a la función doblar? Desde dónde?
        // 27, dentro de la función: imprimir2
        // Desde JAVA 1.8, hay un operador nuevo ::
        // Este operador permite referenciar una función
        imprimir2(App::doblar, 5);
        
        int numero = 7;
        if(numero>0){
            numero=-numero;
        }
        int numero2 = numero< 0 ? numero : -numero;
        
        // Funciones lambda? 
        // Función que recibe un numero y devuelve el número * 2
        // (numero)                         ->        numero * 2
        
        imprimir2( (num) -> num*4          ,9);
                   //----------//           //
                   //Arg funcion.           // numero
        
        //List<String> textos = new ArrayList<>();
        var textos = new ArrayList<String>(); // JAVA 10
        textos.add(new String("Texto1"));
        textos.add(new String("Texto2"));
        textos.add(new String("Texto3"));
        
        // Quiero un bucle para sacar esos valores por pantalla:
        for (int indice = 0; indice < textos.size(); indice++){
            System.out.println(textos.get(indice));
        }
        // Desde JAVA 1.5: ITERABLE
        for (String texto : textos) {
            System.out.println(texto);
        }
        // Desde JAVA 1.8: Programación funcional
        // En todas las colecciones desde java 1,.8 teneis la función stream()
        // que os permite aplicar este tipo de funciones:
        // forEach, map, filter, sort, flatmap
        textos.stream().forEach(System.out::println); // Mucho más eficiente!
        
        textos.stream().map( (txt) -> txt.toUpperCase() )
                       .map( (txt) -> txt.substring(5) )
                       .filter( (txt) -> txt.contains("1") )
                       .forEach( System.out::println );
        
        // Abre tantos hilos como CPUs tenga la máquina para procesar esto
        textos.parallelStream().map( (txt) -> txt.toUpperCase() )
                       .map( (txt) -> txt.substring(5) )
                       .filter( (txt) -> txt.contains("1") )
                       .forEach( System.out::println );
                       
        var numeroA=10; // El compilador asigna el tipo int a numeroA +Java10
        //var texto; // Esto da error. El compilador no sabe el tipo. No puede inferirlo
        //var texto=null;
        //texto="hola";
    }
    
    public static void imprimir(double numero) {
        System.out.println(numero);
    }
    
    public static void imprimir2(Function<Double, Double> funcion, double numero) {
        System.out.println(funcion.apply(numero));
    }
    
    public static double doblar(double numero){
        return numero * 2;
    }
    public static double mitad(double numero){
        return numero / 2;
    }
    // Función static en JAVA: 
    // Función que va a asociada a la clase 
    // y no a instancias de la misma.
}