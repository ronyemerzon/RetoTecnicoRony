public class Gato extends Animal{

    public Gato(String nombre, String onomatopeya){
        super(nombre, TipoAnimal.TERRESTRE, onomatopeya);
    }

    @Override
    public String getOnomatopeya() {
        return getOmonatopeyaAnimal();
    }

    @Override
    public TipoAnimal getTipoAnimal() {
        return getTipo();
    }
}
