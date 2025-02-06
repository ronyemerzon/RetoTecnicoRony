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

        String continuar;

        do{
            String tipo;
            do{
                System.out.println("Ingresa el tipo de animal:\n1. Terrestre. \n2. Volador \n3. Acuatico.\n");
                tipo = sc.nextLine().toUpperCase();
                if(!tipo.equals("TERRESTRE") && !tipo.equals("VOLADOR") && !tipo.equals("ACUATICO")) {
                    System.out.println("Debes ingresar un valor correcto que esté dentro de las 3 opciones. Puede ser mayusculas o minusculas...");
                }
            } while (!tipo.equals("TERRESTRE") && !tipo.equals("VOLADOR") && !tipo.equals("ACUATICO"));


            System.out.println("Ingrese la especie del animal. Ejemplo: Perro, Gato, Pollo, etc.\n");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la onomatopeya que hace el animal: ");
            String onomaIngreso = sc.nextLine();

            Animal animal = AnimalFactory.crearAnimal(nombre, tipo, onomaIngreso);
            listaAnimales.add(animal);

            do{
                System.out.println("¿Desea continuar agregando animales?\nSi o No");
                continuar = sc.nextLine().toLowerCase().trim();
                if(!continuar.equals("si") && !continuar.equals("no")){
                    System.out.println("La respuesta no es válida. Debes escribir 'si' o 'no'.\n");
                }
            } while (!continuar.equals("si") && !continuar.equals("no"));


        } while (!continuar.equals("no"));

        System.out.println("Lista de animales agrupados por tipos...");
        for(Animal animal : listaAnimales){
            animal.DameDatos();
        }
    }

}
