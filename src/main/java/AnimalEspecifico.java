public class AnimalEspecifico extends Animal{

    public AnimalEspecifico(String nombre, TipoAnimal tipo, String onomatopeya){
        super(nombre, tipo, onomatopeya);
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
