/* Proper nutrition is crucial for maintaining our dinosaurs’ health. 
Write an if statement that determines the number of feeds a dinosaur 
requires per day based on its weight. */

import java.util.*;
public class Ex04_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dinosaur weight in kg to determine its number of feeds: ");
        double dinoWeight = sc.nextDouble();
        int numberFeeds = 0;

        if (dinoWeight > 1000) {
            numberFeeds = 10;
        } 
        else if (dinoWeight > 500) {
            numberFeeds = 8;
        }
        else if (dinoWeight > 100) {
            numberFeeds = 6;
        }
        else if (dinoWeight > 10) {
            numberFeeds = 4;
        }
        else {
            numberFeeds = 3;
        }

        String mesage = "For a dinosaur that weights " + dinoWeight + 
            ", it's necessary " + numberFeeds + " feeds per day.";
        System.out.println(mesage);
    }
}
