package Practica3;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Animal gomita = new Animal(2, "Gomita", "Perro");
        Animal Juan = new Animal(2, "Juan", "Perro");
        HashSet<Animal> animals = new HashSet<Animal>();
        animals.add(gomita);
        animals.add(Juan);
        System.out.print(animals.size());
    }
}
