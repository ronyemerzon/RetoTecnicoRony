import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalFactory animalFactory = context.getBean(AnimalFactory.class);

        Scanner sc = new Scanner(System.in);
        List<Animal> listaAnimales = new ArrayList<>(); // Lista para guardar los animales que se iran ingresando

        do{
            System.out.println("Ingresa el tipo de animal:\n1. Terrestre. \n2. Volador \n3. Acuatico.\n");
            String tipo = sc.next().toUpperCase();

            System.out.println("Ingrese la especie del animal. Ejemplo: Perro, Gato, Pollo, etc.\n");
            String nombre = sc.next();

            System.out.println("Ingrese la onomatopeya que hace el animal: ");
            String onomaIngreso = sc.next();

            Animal animal = AnimalFactory.crearAnimal(nombre, tipo, onomaIngreso);
            listaAnimales.add(animal);

            System.out.println("¿Desea continuar agregando animales?\nSi o No");
            String continuar
        } while (continuar.equals("Salir"));

        AnimalService.agruparAnimales(listaAnimales);
    }

}
