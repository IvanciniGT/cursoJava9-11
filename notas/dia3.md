# Ensamblado de un proyecto JAVA

Escribimos un montón de ficheros .java
                                 .xml
                                 .properties
                                 .montones de cosas

Qué hay que hacer para mandar aquello a quién sea? 
    Qué mandamos? Cual es el entregable de una app JAVA?
        jar - Libreria | Ejecutable desde linea de comandos (JVM)
                Apps web. que lleva embedido el propio servidor de aplicaciones. Springboot
        war - Aplicación WEB para su ejecución en un Servidor de aplicaciones
                TIENDEN A SU DESAPARICION !
        ear - Conjunto de war + EJB para su ejecución en un Servidor de aplciaciones de clase empresarial
                TIENDEN A SU DESAPARICION !

ANTES ESTO ES LO QUE HACIAMOS !

1º Descargar todas las dependencias de mi proyecto... Pocas decenas a algunos cientos de ficheros .jar
    Las dependencias tienen más dependencias y además versiones!
2º Configurar una magnifica variable de entorno que usamos en JAVA: CLASS_PATH
3º Compilar los ficheros .java -> -d habré dejado los ficheros .class en un sitio distinto de los .java
4º Copiar todos los archivos de recursos a sus ubicaciones
4.1- Compilo las pruebas unitarias y dejar (los ficheros .class ) en otra carpeta
4.2- Copiar los archivos de recursos de las pruebas unitarias a su ubucación
4.3- Ejecutaremos las pruebas unitarias
5º Empaqueto : jar (zip)

JAVA -> maven 90% | gradle
KOTLIN -> gradle
SCALA  -> sbt

# De que se encarga MAVEN

De todas esas tareas de arriba.

Un proyecto gestionado con maven puede pasar por distintas fases.
Sobre un proeycto, puedo pedir a maven que ejecute comandos:

- compile           Compila el codigo fuente
- test-compile      Compila el codigo fuente de las pruebas unitarias
- test              Ejecuta las pruebas unitarias
- package           Empaqueta el proyecto
- install           Copia el artefacto (jar, war) a una carpeta (mi carpeta .m2) para que otros proyectos
                    que tenga en mi maquina puedan usarlo.       
- clean             Borra la carpeta target

Maven impone uns estructura de carpetas al trabajar:
...\proyecto\
             src\
                 main\
                      java\         Codigo fuente de mi app 
                      resources\    Los archivos de recursos de mi app  
                      webapp\       Los archivos de una app web: JSP WEB-INF web.xml
                 test\
                      java\         Código fuente de mis pruebas unitarias
                      resources\    Los archivos de recursos de ims pruebas unitarias
             pom.xml                Configuración maven del proyecto:
                                        Coordenadas del proyecto (identificador)
                                        Propiedades (versión de java....)
                                        Dependencias
                                        Plugins
------------------------------------------------------------------------------------------------------
             target\
                    classes\             Los ficheros .class de mi app
                    test-classes\        Los ficheros .class de mis pruebas unitarias
                    surefire-reports\    Los informes de resultado de ims pruebas unitarias
                    proyecto\            Mis ficheros .clss del proyecto + recursos del proyecto
                        V Se empaqueta
                    proyecto-1.2.3.jar
                    
Cuando queremos crear un proyecto con maven podemo hacerlo:
    - A manita.
    - Desde un arquetipo = plantilla
    
# Nuestro app diccionario con modulos a MAVEN

## Modulo diccionario
.
├── appdiccionario
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               ├── com
│               │   └── curso
│               │       └── app
│               │           └── App.java
│               └── module-info.java
├── diccionario
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   ├── com
│           │   │   └── curso
│           │   │       └── diccionario
│           │   │           ├── Diccionario.java
│           │   │           ├── ProveedorDeDiccionarios.java
│           │   │           └── impl
│           │   │               ├── AbstractDiccionario.java
│           │   │               ├── DiccionarioEspanol.java
│           │   │               ├── LevenshteinDistance.java
│           │   │               └── ProveedorDeDiccionariosImpl.java
│           │   └── module-info.java
│           └── resources
│               └── diccionario.ES.properties
└── pom.xml