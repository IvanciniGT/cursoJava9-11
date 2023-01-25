# Diccionario

Esta aplciacion consta de 2 modulos:
- diccionario: Es una libreria que debe permitir:
    - Es obtener un diccionario para un idioma. El diccionario:
        - Identificar si un término existe en el diccionario
        - Solicitar su definición en caso de que exista
        - Solicitar sugerencias si el término no existe
- appdiccionario: Esta es una aplciación usable desde linea de comandos, que debe permitirme
                  buscar términos y si no existen mostrar sugerencias


javac -d compiled \
    --module-source-path src \
    src/appdiccionario/com/curso/app/App.java \
    src/appdiccionario/module-info.java  \
    src/diccionario/com/curso/diccionario/*.java \
    src/diccionario/com/curso/diccionario/impl/*.java \
    src/diccionario/module-info.java 

java --module-path compiled -m appdiccionario/com.curso.app.App manzano