public abstract class Animal implements SonidoAnimal {

    private String nombre;
    private TipoAnimal tipo;
    private String onomatopeya;

    public Animal(String nombre, TipoAnimal tipo, String onomatopeya){
        this.nombre = nombre;
        this.tipo = tipo;
        this.onomatopeya = onomatopeya;
    }

    @Override
    public abstract String getOnomatopeya();
    @Override
    public abstract TipoAnimal getTipoAnimal();

    public String getNombre() {
        return nombre;
    }

    public TipoAnimal getTipo(){
        return tipo;
    }

    public String getOmonatopeyaAnimal(){
        return onomatopeya;
    }

    public void DameDatos(){
        System.out.println("El animal " + nombre + " es de tipo " + tipo + " y su onomatopeya es: " + onomatopeya);
    }


}
