package ch03;

public class Ex03_03 {
    public static void main(String[] args) {
        int year = 2024;
        boolean is_leapyear = (year % 4) > 0;
        System.out.println(year + " is a leap year? " + is_leapyear);
    }
}
