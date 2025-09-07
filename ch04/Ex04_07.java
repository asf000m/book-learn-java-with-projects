/* It is important to delegate tasks properly to keep operations running smoothly.
Create a program that assigns different duties to employees based on their job 
titles using a switch statement. */

import java.util.*;
public class Ex04_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your job title to view your duty >> ");
        String jobTitle = sc.next();
        String jobDuty = "";
        switch (jobTitle) {
            case "paleozoologist" -> jobDuty = "Studies and monitors dinosaur behavior and biology.";
            case "veterinarian" -> jobDuty = "Specializes in prehistoric creature health";
            case "nutritionist" -> jobDuty = "Designs diets for herbivores, carnivores, and omnivores";
            case "engineer" -> jobDuty = "Builds and maintains secure habitats";
            case "keeper" -> jobDuty = "Daily care, feeding, and enrichment for the dinosaurs";
            case "specialist" -> jobDuty = "Tracks mood, aggression, and social dynamics";
            case "officer" -> jobDuty = "Responds to breaches and monitors perimeter defenses";
            case "technician" -> jobDuty = "Maintains animatronic dinosaurs and automated systems";
            case "analyst" -> jobDuty = "Tracks health, movement, and visitor engagement";
            default -> jobDuty = "Job title not found.";
        }
        
        System.out.println("The " + jobTitle + " has the following duty:");
        System.out.println("\t" + jobDuty);
    }
}
