enum TipoAnimal {

    TERRESTRE("Terrestre", "Se desplaza por tierra."),
    VOLADOR("Volador", "Se desplaza por los aires, puede volar."),
    ACUATICO("Acuatico", "Su hábitad es el mar, puede nadar.");

    final String nombre;
    final String descripcion;

    TipoAnimal(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return descripcion;
    }

}
