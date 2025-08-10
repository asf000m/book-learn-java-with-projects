/* Proper housing is essential for the dinosaurs’ well-being. 
Write a switch statement that assigns a dinosaur to a specific enclosure based on its size (XS, S, M, L, or XL). */

import java.util.*;
public class Ex04_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the size of the dinosaur (XS, S, M, L, or XL)?\n>> ");
        String size = sc.next();
        // System.out.println(length);
        String message = "Length of the enclosure: ";
        switch(size) {
            case "XS" -> System.out.println(message + "10m to 15m");
            case "S" -> System.out.println(message + "20m to 50m");
            case "M" -> System.out.println(message + "50m to 100m");
            case "L" -> System.out.println(message + "100m to 150m");
            case "XL" -> System.out.println(message + "150m to 300m");
            default -> System.out.println("Invalid size.");
        }
    }
}
