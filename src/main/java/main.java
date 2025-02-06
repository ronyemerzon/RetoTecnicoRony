import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //Perro maya = new Perro("perro", "guau guau");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el tipo de animal:\n1. Terrestre. \n2. Volador \n3. Acuatico.\n");
        String tipo = sc.next().toUpperCase();

        System.out.println("Ingrese la especie del animal. Ejemplo: Perro, Gato, Pollo, etc.\n");
        String nombre = sc.next();

        System.out.println("Ingrese la onomatopeya que hace el animal: ");
        String onomaIngreso = sc.next();

        AnimalFactory animalFactory = new AnimalFactory(nombre, tipo, onomaIngreso);
        animalFactory.DameDatos();



    }

}
