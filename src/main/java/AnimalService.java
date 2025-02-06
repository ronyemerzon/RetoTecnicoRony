import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalService {

    private List<Animal> listaAnimales;

    public AnimalService(){
        listaAnimales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal){
        listaAnimales.add(animal);
    }

    public List<Animal> getListaAnimales(){
        return listaAnimales;
    }

    public void agruparAnimales(List<Animal> animales){
        Map<TipoAnimal, List<Animal>> agrupados = animales.stream().collect(Collectors.groupingBy(Animal::getTipoAnimal));

        agrupados.forEach((tipo, lista) -> {
            System.out.println("\nAnimales de tipo " + tipo.getNombre() + ":");
            lista.forEach(animal -> System.out.println("- " + animal.getNombre()));
        });
    }
}
