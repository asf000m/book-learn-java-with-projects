package ch03;

public class Ex03_05 {
    public static void main(String[] args) {
        int dino1_age = 21;
        int dino2_age = 25;
        int age_diff = dino1_age - dino2_age;
        age_diff = age_diff < 0 ? -age_diff : age_diff;
        System.out.println("The Dino1 is "+ dino1_age +" years old and Dino2 is "+ dino2_age + " years old.");
        System.out.println("The age difference is "+ age_diff +" years");
    }
}
