javac -d compiled \
    --module-source-path src \
    src/mimodulo/com/curso/paquetea/Clase.java \
    src/mimodulo/module-info.java  \
    src/aplicacion/es/curso/app/App.java \
    src/aplicacion/module-info.java 

java --module-path compilado -m aplicacion/es.curso.app.App