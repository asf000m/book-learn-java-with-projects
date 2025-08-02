package ch03;

public class Ex03_04 {
    public static void main(String[] args) {
        int park_guests = 500;
        int max_capacity = 350;
        boolean is_maxcapacity = park_guests > max_capacity;
        System.out.println("Max capacity reached: " + is_maxcapacity);
    }
}
