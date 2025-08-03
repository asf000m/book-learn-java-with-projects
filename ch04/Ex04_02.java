/* Different species require different care strategies and exhibit unique behavior traits. 
Write a switch statement that prints a description of a dinosaur based on its species. 
This will help educate both the staff and park visitors. */

import java.util.*;
public class Ex04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello!\nChoose what species of dinosaur do you want to know about:");
        System.out.println("1. T. rex\n2. Triceratops\n3. Ankylosaurus\n4. Sauropods");
        System.out.print("\n>> ");
        int choice = sc.nextInt();

        String trait1 = "A popular carnivorous dinosaur known for its pointed, serrated teeth,\nsuggesting it are meat by tearing chunks.\n";
        String trait2 = "A herbivorous dinosaur with a wall of teeth designed for chopping tough vegetation,\nand a frill that may have benn for species recognition, according to some research.\n";
        String trait3 = "An armored, quadrupedal herbivore with bony plates for protection\nand small teeth for eating plants.\n";
        String trait4 = "There were large herbivores with long necks for reaching high foliage,\nand some may have ingested stones called gastroliths to help grind food in ther stomachs, \na behavior seen in modern birds.\n";

        switch(choice){
            case 1 -> System.out.println("\n" + trait1);
            case 2 -> System.out.println("\n" + trait2); 
            case 3 -> System.out.println("\n" + trait3); 
            case 4 -> System.out.println("\n" + trait4); 
            default -> System.out.println("Unkown option");
        }
    }
}
