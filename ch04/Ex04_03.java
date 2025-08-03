/* Some dinosaurs are tougher to handle than others. 
Write an if statement that checks whether a number of years of experience is enough experience to work with a certain type of dinosaur.
This ensures the safety of both our dinosaurs and employees. */
import java.util.*;
public class Ex04_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many years of experience do you have working with dinosaurs?\n>> ");
        int years = sc.nextInt();

        int trex = 5;
        int triceratops = 4;
        int ankylosaurus = 3;
        int sauropods = 2;
        int species = 0;

        System.out.println("What species of dinosaurs do you pretend to work with?");
        System.out.println("1. T. rex\n2. Triceratops\n3. Ankylosaurus\n4. Sauropods");
        System.out.print("Choose one >> ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 -> species = trex;
            case 2 -> species = triceratops;
            case 3 -> species = ankylosaurus;
            case 4 -> species = sauropods;
            default -> System.out.println("\nIncorrect choice.");
        }

        if (years >= species) {
            System.out.println("\nAlright! You can work with this species!");
        } else {
            System.out.println("\nSorry, but you don't have enough experience to work with this species.");
        }
    }
}
