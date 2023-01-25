module diccionario {
    exports com.curso.diccionario;
    provides com.curso.diccionario.ProveedorDeDiccionarios with com.curso.diccionario.impl.ProveedorDeDiccionariosImpl;
}