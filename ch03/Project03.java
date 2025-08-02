package ch03;

public class Project03 {
    public static void main(String[] args) {
        // Dino meal planner
        double dino_weight = 1244;  // weight in kg
        double food_proportion = 0.05;  // proportion of food per total weight a day
        double food_needed = dino_weight * food_proportion;
        int feedings = 3;  // number of feedings a day
        String message = "Our " + dino_weight + " kg dinosaur need to eat " + food_needed + " kg with 3 feedings.";
        System.out.println(message);
    }
}
