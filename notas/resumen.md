Cambios en versiones de JAVA

JAVA 5              Iterable            for( Object elemento : elemento ){}
    
                                            public void generarInforme(Object datos, String titulo){}
                                            Es necesario pasar un valor de titulo que no sea nulo?
                                            Puedo pasar como titulo null ?      NPI -> Documentación
                                            
                    Anotaciones !       Las anotaciones se pueden usar en metodos y clases
                                        @override
                    
JAVA 8              Optional            Explicitar la devolución que antes se hacía de "null"
                                        Antes eso solo quedaba en la documentación, pero no el API
                                        
                                        public String dameEmail()   Qué devuelve? PreJava8 NPI
                                                                                    String 
                                                                                    null    >>> Documentación
                                            ------------------------------------------------------------------------------------
                                        public Optional<String> dameEmail()     Qué devuelve? Post Java8
                                                                                    Lo tengo muy claro
                                                                                        Optional relleno con un String
                                                                                        O un optional vacio
                                        public String dameEmail()               Qué devuelve a partir de Java 1.8?
                                                                                    Siempre un String . No hay opción de null
                                                                                        ^ El SonarQube revisa el código
                                                                                            Y si ve que la función puede devolver null  
                                                                                            SmellCode!!!!
                                                                                        ^ Si Eclipse o IntelliJ ven que la función puede devolver null
                                                                                            Ya me avisan para que ponga el Optional
                                        
                    java.util.functions
                    Operador ::         Referenciar funciones
                    () -> {}            Crear funciones anónimas como expresiones
                    Cambios collections
                        .stream()               Aplicar programación funcional desde JAVA a colecciones
                        .parallelStream()       .map().reduce()
                            .map()              Metodos de Map
                            .flatMap()
                            .filter()
                            .sorted()
                                
                            .collect()          Metodos de REDUCE
                            .reduce()
                            .forEach()
                    Métodos default en Interfaces
                    Métodos estáticos en Interfaces

    
                    Posibilidad de meter anotaciones al definir una variable entro de una función
                    @Texto              -> Dar instrucciones al Compilador en base a un código que escribo en JAVA
                        Lombok              @NonNull

                                            public void generarInforme(@NonNull Object datos, String titulo){}

                                            Esto quita toda duda al respecto de la función!
                                            Esto hoy en dia es una MUY BUENA PRACTICA <<< SONARQUBE lo ven con buenos ojos !
                                            Y mis compañeros más !


JAVA 9              modulos             Proyecto jigsaw
                    module-info.java
                        javac --module-source-path ...
                        java --module-path ....
                                        Va en paralelo con los cambios realizados en Maven y git (modulos)
                    ServiceLoader       Evita Factories
                    Crear métodos privados en Interfaces
                    JSHELL                      Hoy en día (desde la versión 9), puedo ejecutar código sin 
                                                necesidad de montar ni una clase en JAVA
                                                .jsh -> scripts (Intentar atraer a Js, Python, bash)
                                                     -> pruebas manuales (OBSOLETAS)
                                                     -> pruebas de concepto al desarrollar código
                    Métodos .of a las Colecciones
    
JAVA 10             Uso de la palabra var       Permite Inferir el tipo de una variable. HAY QUE USAR CON CUIDADO !
                    Métodos .copyOf a las Colecciones
                    Optional .orElseThrow()         Lanza un NoSuchElementException() en automático

JAVA 11             Función bastante útil en String nueva:
                        isBlank()
                        lines() -> Equivalente a la función stream() en Collections
                            lo que sería un split() -> Array
                                            lines() -> Stream Al que aplicar programación funcional.
                    Podemos ejecutar directamente un fichero .java sin necesidad de compilarlo previamente
                    Posibilidad de definir en las funciones lambda las variables de entrada con la palabra var
                    Files.readString(RUTA);
                    Files.saveString(RUTA);
                    
                    java.net.http
                        API HTTP client
                                        requests -> Servicios WEB
                        API Websockets
        
                            protocolo alternativo de comunicación a http
                            
                            Protocolo http: 
                                cliente: HttpRequest --- > servidor
                                         < ---HttpResponse
                            
                            Protocolo ws: 
                                cliente:                  :servidor
                                        ----------------- >
                                        < -----------------
                        Esos nuevos APIs funcionan mediante un patron builder:
                        
                        HttpRequest miRequest = HttpRequest().newBuilder()
                                                             .uri("http://miempresa:8080/apiv/v1/usuarios")
                                                             .POST()
                                                             .header("clave","valor")
                                                             .build();
                    