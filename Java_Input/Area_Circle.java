import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Corrected 'New' to 'new'
        System.out.println("Enter Radius: ");
        int radius;
        radius = sc.nextInt();
        double pi = 3.1415;
        double area = pi * radius * radius;
        System.out.println("The area of the circle: " + area);
        sc.close();
    }
}
