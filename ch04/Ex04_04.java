/* We are working with beautiful but dangerous creatures. So, safety first. 
Write a program that prints a warning message if the park’s safety rating falls below a certain threshold. 
We must always be alert to potential issues that could harm our staff, visitors, or dinosaurs. */

import java.util.*;
public class Ex04_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the safety rating of the park today?\n>> ");
        double rating = sc.nextDouble();
        // System.out.println(rating);
        System.out.print("What's the safety rating threshold?\n>> ");
        double threshold = sc.nextDouble();
        // System.out.println(threshold);
        String warning = "WARNING! The safety rating of the park is bellow the minimum!\nPlease, take actions now, so our staff, guests, and animals are safe.";
        String congratulations = "CONGRATULATIONS! Our park is safe! Stay improving our park.";

        if (rating < threshold) {
            System.out.println(warning);
        } else {
            System.out.print(congratulations);
        }
    }
}
