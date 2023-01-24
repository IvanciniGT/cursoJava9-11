# JAVA

"Lenguaje" de programación:

- Paradigma:
    - Imperativo                                    √   Ordenes que se ejecutan secuencialmente: if, for, while, switch
    - Procedural                                    √   Capacidad para definir e invocar funciones, procedimientos, métodos
    - Funcional                                     √   Capacidad de referenciar desde una variable a una función (+1.8)
    - Orientado a objetos... ya no tanto !          √   Capacidad para definir mis propios tipos avanzados de datos
- Compilados vs Interpretados (> Multiplataforma)
    - Compilados puros: C, C++, C#
    - Interpretados puros: Python, JS
    - Compilado + Interpretado : JAVA
        .java(JAVA) - Compilación(javac) ->  .class (BYTE-CODE) - Interprete (JVM java) -> binario ejecutable
- Tipado Estático vs dinámico: 
    - Tipado estático: C, C++, C#, JAVA
    - Tipado dinámico: JS, Python
    - Inferencia de Tipos

# Variable en JAVA... y aplicada a tipos complejos.

√ Referencia a una ubicacióbnde memoria donde tenemos un valor almacenado(de un determinado tipo)
x Valor que cambia 

texto = "hola"
String texto = "hola";
    x Le asigno a la variable el valor "hola"
    √ Apuntamos la variable texto al objeto "hola"

Cosas que hace? 3
1º -> "hola"        --> Colocar el String("Hola") en algún sitio de la memoria RAM. NPI de donde
2º -> String texto  --> Crear una variable, que llamamo "texto" y que puede apuntar a un objeto de tipo String
3º -> =             --> Que la variable apunte a ese objeto que hemos puesto en la RAM

texto = "adios"
texto = "adios";
1º -> "adios"       --> Colocar el String("Adios") en algún sitio de la memoria RAM. NPI de donde
2º -> texto =       --> Que la variable ahora apunte al String("adios") que está en la RAM.

# Qué tal uso de la RAM hace JAVA? PENOSO ! JAVA genera intencionalmente BASURA ! Garbage < Garbage Collector!

Las aplicaciones montadas en JAVA hacen un desastre con la memoria RAM.... usan memoria RAM a kilos !
Pero esto no es malo! => Esto es un feature ! Criterio de diseño !
Esto permite que los desarrollos en JAVA sean más rápidos y más sencillos que por ejemplo en C !

# Tipado Estático vs dinámico:

- Tipado estático: Obligatoriedad de asignar un tipo a una variable o una constante, que no es modificable a posteriori.
    - Inferencia de tipos: El compilador determina el tipo por mi... pero sigue habiendo un tipo estático!
- Tipado dinámico: No se asigna un tipo a una variable o una constante, sino que la variable o la contante en cada momento puede referenciar a un objeto de un tipo distinto.

# Codigo JAVA: Tipado estático
int texto = "hola"; // ERROR
String texto = 18;  // ERROR
int numero = 18;    // OK
numero = "hola";    // ERROR

    "hola" es un String, pero no porque al principio de la frase pone String, sino por la sintaxis.
    18 es un int

# Codigo PYTHON: Tipado dinámico
> numero = 17         // OK
> numero = "hola"     // OK

¿Qué es mejor: tipado dinámico o estático?  SIEMPRE TIPADO ESTATICO . Me da más control > Compilación !
¿Qué es más cómodo? Depende del tamaño del proyecto:
    - Pequeño: DINAMICO (script)
    - Grande:  ESTATICO

API: saluda(tipo, nombre, intensidad): Me toca meterme a ver el código para saber lo que tengo que pasar. LOCURA !!!!
Incluso en lenguajes con tipado dinámico, se han acabado implementando reglas en la sintaxis que permitan especificar tipos:
> numero:int = 17 # En python ese int, no sirve para NADA . No da error si paso un String
> numero:int ="hola" # ES OK !!!! Para dar una pista al tio que viene detrás de mi
> var numero =17;
> numero = "hola" // Es OK De hecho en JS se han inventado un sobrelenguaje llamado TypeScript para poder trabajar con 

tipos de datos... con un proceso que se han inventado llamado TRANSPILACION !

Ahora... son cómodos los lenguajes de tipado dinámico... o almenos hay algo cómodo en ellos:
En Java es horrible tener que escribir:
> Cuadrado d = new Cuadrado(5); // HORRIBLE !!!!!

Hoy en día podemos escribir en Java:
> var d = new Cuadrado(5); 

Esta linea sería equivalente, la misma que si hubiera escrito la de arriba. Para contentar a los de JS y Python
Aquí ocurre lo que llamamo INFERENCIA DE TIPOS ! Es decir, la variable d sigue teniendo un tipo, no es como en JS o Python. Simplemente no lo tengo que escribir. El compilador lo calcula por mi, en base al dato que se suministra.

PERO OJO: Aqui no tenemos tipado Dinámico
> d = "hola" // OSTION !!!!!
> var resultado=miObjeto.calculaInforme(datos);         // MUY MALA PRACTICA

Sé lo que contiene (el tipo de datos) resultado? NO... tengo que andar mirando docu, o la función a la que llamo.

> var numero = 11; // EN JAVA sigue siendo tipado ESTATICO no es DINAMICO ! CAGADA ! EN JAVA , por qué ?

# Versiones de JAVA

- versión 1.0  >>>> Sun microsystems: (Hardware: sparc < solaris (UNIX®))
- 1.6       2006
<----- Cuando JAVA cae en manos de Oracle
- 1.7       2011 ¿Tiene sentido un aumento de versión en 5 años? NO, NINGUNO !!!! Por qué?
- 1.8       2014        Soporte a programación funcional !
- 9         2017  <<< La comunidad se echó encima! Desde aquí salen versiones de JAVA cada 6 meses
- 10        2018
- 11        2018    ****** Hace la friolera de 5 añazos
- 12        2019
- 13        2019
- 14        2020
- 15        2020
- 16        2021
- 17        2021
- 18        2022
- 19        2022
-           1023

Hoy en día JRE (la máquina virtual de JAVA) es un estándar, del cuál hay un montón de implementanciones:
- Temurin (ECLIPSE)
- Correto (amazon)
- OpenJDK

# Cuánto se usa JAVA a día de HOY? 

Bastante poco ! > Java ha quedado como un lenguaje de NICHO: Para montar el Backend de apps web.
                                                                            -------
Antes, con JAVA haciamos :
- Aplicaciones WEB
- Aplicaciones de escritorio? SIII Swing                x
- Aplicaciones para teléfonos móviles? Android          x       Kotlin

Mucho por detrás de lenguajes como JS o Python

La gente de JAVA se han ido hacia:
- C#
- Kotlin
- JS

En paralelo, en últimos años se han incorporado al mundo de la programación muchos perfiles que antes no programaban:
- Analisis de datos -> python                                   \
- Testers           -> python                                    >  Scripts
- SysAdmin          -> python, terraform (HCL), Ansible         /

# Tipos de software:

- Sistema operativo
- Driver
- Aplicación
- Servicio
- Script        Programa bien sencillo, que ejecuta una serie de tareas con más o MENOS orquestación
- Comando

# Productos comprados por Oracle....

- JAVA: Cobramos por JAVA VM:   \
    - Usuario: 25$ al año        > Google:
    - Empresa: 50$ por core     /
- OpenOffice -> StarOffice
    -> LibreOffice
- MySQL
    -> MariaDB
- Hudson
    -> Jenkins

# Hoy en día:

Herramientas como: Weblogic, Websphere, JBoss  (serv de apps de clase empresarial) están condenadas a su extinción!
De hecho la gente de IBM: Websphere -> Liberty (serv de apps de clase web)

Hoy en día la mayor parte de instalaciones en grandes corporaciones para BackEnd JAVA corren en Tomcat (serv de apps de clase web)

# J2EE -> JEE

Colección de Estandares: Java® Enterprise Edition -> Jakarta Enterprise Edition

Oracle lo donó hace mucho tiempo a una fundación para que lo gestione. 

Aqui se habla de tipos de servidores de aplciaciones:
- JSP           ***
- JFC           *** Están obsoletas !
- servlets
- JDBC
- JMS
- ...

# Metodologías de desarrollo de software

Metodologías de desarrollo en cascada: Waterfall -> Totalmente OBSOLETO !

Metodologías ágiles: SCRUM, Xtreme Programming,  ...
    Manifiesto agil para el desarrollo de software: agilemanifesto.org

Equipos de trabajo autoorganizados (sin un jefe de proyecto), que deben implementar funciones / requerimientos más simples.

> "El software funcionando es la medida principal de progreso"
                    V
                Probado

En metodologías tradicionales, para determinar el vance de un proyecto: El JEFE DE PROYECTO !
- Opción 1: Preguntar al desarrollador: T1, T2, T3 (pte) 66%
- Opciones más creativas: Número de lineas de código escritas en una semana !

Hoy en día, el grado de avance del proyecto me lo dan los TESTERS y las pruebas de software


# Arquitecturas de diseño de una app

Hoy en día no se montan aplciaciones MONOLITICAS -> Weblogic, Websphere BEAN

Hoy en día SI se usan SOLO : Arquitecturas orientadas a servicios y especialmente a MICROSERVICIOS ! < NICHO JAVA !

Esto ha dado lugar al cambio más grande que se incorpora en JAVA 9 (de hecho el más grande de entro los incorporado entre java 9-11): MODULO EN JAVA !


Problemas de implementar apps monolíticas?
- Demasiado grandes y complejas de mantener
- Si quiero una nueva funcionalidad de un componente? A desplegar todo de nuevo
- Si quiero escalar un componente? NO PUEDO !


# Aplicaciones WEB en el mundo JAVA

ClientePC
   |
Navegador
   URL --------------------------------> Servidor de Apps JAVA
                                            URL -> petición a un programa JAVA (JSP, JFC, Servlet)
        < ------------------------------- HTML (xml, json)
        
        
ClientePC
   |
Navegador
   URL --------------------------------> Servidor de Apps JAVA
                                            URL -> petición a un programa JAVA (JSP, JFC, Servlet)
        < ------------------------------- HTML (xml, json)
                                            
                                            
                                            URL -> petición a un programa JAVA
        < ------------------------------- JSON (BACKEND)
                                            Servicios / Microservicios WEB
                                                Springboot
    HTML (donde se compone el HTML?)
    En el navegador del cliente (JS) FrontEnd (ReactJS, angularJS-capaCaida, VueJs, ....) WebComponents 
                                                                                    (estandar del W3C=HTML,CSS, XML)
                                                LitElement
    Hoy en día los navegadores dan de forma nativa la capadidad de trabajar con Web components:
        <usuario id="19273462"/>
    Y esa funcionalidad la exportan con un API disponible para el lenguaje de programación: JS
    
    Cuando antes quería guardar un dato en un navegador, que usaba? COOKIE
    
App nativa KOTLIN
   |
Cliente2Movil

App nativa  SWIFT.UI
    |
Cliente3AppleTV


# NodeJS

Javascript -> ECMAScript

Node es el quivalente a la JVM de JAVA.
Me permite ejecutar código JS fuera de un navegador.

# CAGADAS DE JAVA

## Setter y getter

Encapsulación.

En python, C# se ha resuelto la encapsulación de forma mucho, infinitimente más elegante que en JAVA !


KOTLIN una sintaxis alternativa a JAVA para generar BYTE CODE que se ejecuta también en una JVM
SCALA  una sintaxis alternativa a JAVA para generar BYTE CODE que se ejecuta también en una JVM
Un programa JAVA De 80 lineas lo podeis escribir en SCALA en 2 lineas de código.!
SCALA tiene una curva de aprendizaje de flipar. Lo primero necesito saber de JAVA !

# CAGADA 2: Modificadores de privacidad

public:                             Cualquiera puede acceder a esa función/dato
private:                            Solo se puede acceder a una función/dato desde dentro de la clase
protected:                          Solo pueden usarse dentro del paquete o por clases que heredan
friendly (cuando no pongo nada):    Solo se pueden usar en el paquete
private protected:                  Se quitó de JAVA 1.2

Son suficientes?                    ME FALTAN POR UN TUBO !!!!!

Sobre todo tal y como montamos apps hoy en día!
Si estuviera montando una app MONOLITICA estaría más o menos bien.
Pero esa no es la forma en la que hoy en día montamos apps.
Y además, hoy en día trabajamos con metodologías ágiles, con equipos pequeños, haciendo desarrollos pequeños.
Y no quiero sistemas fuertemente ligados entre si.

App: repuestosPerez! Sitio Web

Paquete que voy a montar en JAVA:
    com.respuestosperez.web.usuarios                    -> JAR. Su propio repo en GIT 
                                    Usuario
    com.respuestosperez.web.repuestos                   -> JAR. Su propio repo en GIT 
                                     Repuesto
    com.respuestosperez.web.carritodelacompra           -> JAR.
                                            model
                                                public CarritoCompra.java
                                            controller
                                                CarritoController.java
                                                    public dameEstadoCarrito(usuario)
                                                    public añadirRepuesto(usuario, repuesto)
                                                        // Hace unas comprobaciones y 
                                                        // persistirRepuesto(usuario, repuesto)
                                            persistence
                                                mongoDB
                                                    public persistirRepuesto(usuario, repuesto)
                                                sql
                                                    public persistirRepuesto(usuario, repuesto)
    
    Desde fuera del paquete carrito de la compra, a qué deberia poder acceder? 
        No a todas....  a las funciones del controlador: dameEstadoCarrito y añadirRepuesto
                        a la clase CarritoCompra
        Y a los métodos de persistencia? NO DEBERIA... NI DE COÑA !
            Pero... al haberlos definido como publicos, de hecho se puede! y necesito que sean publicos !

Se os ocurre cómo resolver esto? Si creo un proyecto distinto estoy igual!    

# Sabeis que en JAVA aunque tenga definido un dato / función como privado puedo acceder a él? 

Reflections! Atacar a cualquier objeto a través de la RAM !

TODO ESTO HA MOTIVADO EL MAYOR CAMBIO FUNCIONAL INTRODUCIDO EN JAVA 9: Modulos 
~ Capacidad de trabajar con submodulos en GIT
~ Capacidad de trabajar con submodulos en MAVEN

Modulo          -> jar              ----> jigsaw
    Paquete
        Clases


CVS -> subversion -> git (mercurial)
 ^
 Personita que usaba CVS y le dió muchos problemas a la hora de trabajar. 
 Y decidió montar su propio sistema de control de versión para poder acabar su proyecto.
 Linus Torvalds                                                                Linux.   -> git