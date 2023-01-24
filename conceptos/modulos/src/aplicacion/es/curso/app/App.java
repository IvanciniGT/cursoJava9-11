package es.curso.app;
import com.curso.paquetea.Interfaz;
import com.curso.paquetea.Clase;

import java.util.ServiceLoader; // Disponible desde Java 1.9

public class App {
    
    public static void main(String[] args){
        
        Clase cl1=new Clase();
        System.out.println(cl1.getNumber());
        System.out.println(cl1.getText());
        
        Iterable<Interfaz> miObjetoLoader = ServiceLoader.load(Interfaz.class);
        Interfaz miObjeto = miObjetoLoader.iterator().next();
        System.out.println(miObjeto.dameTexto());
    }
    
}