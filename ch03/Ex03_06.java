package ch03;

public class Ex03_06 {
    public static void main(String[] args) {
        int safety_rating = 8;
        int safety_threshold = 8;
        String message = safety_rating >= safety_threshold ? "Excellent! We have a safety rating of "+ safety_rating : "Warning! Our safety rating is bellow "+ safety_threshold;
        System.out.println(message);
    }
}
