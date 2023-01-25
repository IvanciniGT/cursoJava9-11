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


# SONARQUBE ! ES UN ESTANDAR A DIA DE HOY

En TODO proyecto de software de cualquier empresa del mundo se usa sonarqube

# DEVOPS:

Cultura / Filosofía / Conjunto de prácticas en pro de la AUTOMATIZACION !

Integración continua: Es cuando he autoamtizado el trabajo de compilar, empaquetar 
instalar en un entorno de INTEGRACION y someter el sistema a pruebas AUTOMATICAMENTE

Entrega continua: Automatizo la puesta en la mano de mi cliente de la última versión de mi 
                  software extraida desde un SCM
Despliegue continuo: Automatizo la instalación en producción al golpe de commit!

Dentro de las pruebas que se hacen a un sistema: PRUEBAS DE CALIDAD DE CODIGO
No me vale ya con que tu sistema funcione. O has escrito un codigo decente o te lo tiro a la cara !
Y por supuesto. NO PASA A PRODUCCION ! SONARQUBE!

# METODOLOGIAS AGILES ! SCRUM

Entrega del producto de forma incremental al cliente en su entornos de producción.

R1....R100

HOY 24 enero: Empieza el proyecto

Iteración : SPRINT1: 15 de febrero : PASO A PRODUCCION
                R1, R2
                                    10% < pruebo
    
            SPRINT2: 28 de Febrero : PASA A PRODUCCION
                R5, R7 npi         
                                    +5% de la funcionaldiad
                                    15% < pruebo
    
            SPRINT3: 15 de Marzo : PASA A PRODUCCION
            
            Paso a producción cada 15 días!
                Cada 15 días hay que hacer PRUEBAS DE PRODUCCION !
                Cada 15 días hay que hacer INSTALACION EN PRODUCCION !
                