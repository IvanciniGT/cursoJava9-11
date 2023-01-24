# pfuncional.App

Cúantos hilos tengo en ejecución? 1 - Main

Ese hilo genera un stack de llamadas.
Asociado a cada hilo tenemos un stack de llamadas.

# Hilo?  Thread

Un Ejecutor de código
Asociado a un proceso de SO podemos abrir múltiples hilos,
que vayan recorriendo mi código y ejecutándolo.

HILO MAIN:
    App.main    3
        12 -> VALOR_DEVUELTO = App.doblar 20
        12 -> imprimir( VALOR_DEVUELTO )
            App.imprimir -> System.out
        13 -> VALOR_DEVUELTO = App.mitad 23
        13 -> imprimir( VALOR_DEVUELTO )
            App.imprimir -> System.out

Desde dónde se ejecuta la función doblar() ? 4 y 12
    Lineas que están dentro de la función App.main


# Función lambda

Función ANONIMA definida como una EXPRESION 
(no como un STATEMENT)

STATEMENET es una linea del código que no devuelve nada...
Solo se ejecuta.

Una expresión es una linea de código o un trozo de código que devuelve algo.

# Mapeo en programación funcional

Parto de un conjunto de n elementos

A cada uno le aplico una función de transformación

El resultado de esa función lo meto dentro de una nueva colección
que tendrá también n elementos.


# modulos

paquetea
        Clase
        Interfaz
        ClaseA

Eso lo quiero compartir con otros miembros del equipo.

paqueteb
        Clase
        Interfaz    -   Definir un  API !
                                    Contrato
    que implementaciones hay de la Interfaz?  ClaseA
        Puedo crear una variable/objeto de tipo Interfaz? NO
        Tienen que crear una instancia de ClaseA
        Interfaz miObjeto = new ClaseA();
        