import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AnimalServiceTest {

    private AnimalService animalService;

    @BeforeEach
    void setUp() {
        animalService = new AnimalService();
    }

    @Test
    void testAgregarAnimal() {

        Animal perro = new AnimalEspecifico("Perro", TipoAnimal.TERRESTRE, "guau guau");

        animalService.agregarAnimal(perro);

        List<Animal> animales = animalService.getListaAnimales();
        assertEquals(1, animales.size(), "Debe haber un animal en la lista.");
        assertEquals("Perro", animales.get(0).getNombre(), "El nombre del animal debe ser 'Perro'.");
    }

    @Test
    void testAgruparAnimales(){

        Animal perro = new AnimalEspecifico("Perro", TipoAnimal.TERRESTRE, "guau guau");
        Animal pez = new AnimalEspecifico("pez", TipoAnimal.ACUATICO, "glu glu");
        Animal pollo = new AnimalEspecifico("pollo", TipoAnimal.VOLADOR, "pio pio");
        animalService.agregarAnimal(perro);
        animalService.agregarAnimal(pez);
        animalService.agregarAnimal(pollo);

        animalService.agruparAnimales(animalService.getListaAnimales());

    }
}
