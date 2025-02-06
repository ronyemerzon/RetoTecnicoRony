import org.springframework.stereotype.Component;

@Component
public class AnimalFactory {

    public static Animal crearAnimal(String nombre, String tipo, String onomatopeya){
        TipoAnimal tipoAnimal;

        try {
            tipoAnimal = TipoAnimal.valueOf(tipo);
        }catch(IllegalArgumentException e){
            throw new IllegalArgumentException("El tipo de animal no es correcto");
        }

        return new AnimalEspecifico(nombre, tipoAnimal, onomatopeya);
    }


}
