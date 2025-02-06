public class AnimalFactory extends Animal {

    public AnimalFactory(String nombre, String tipo, String onomatopella){
        super(nombre, TipoAnimal.valueOf(tipo), onomatopella);
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
