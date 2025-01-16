import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int x = sc.nextInt();
        System.out.println("Enter second Number:");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("Sum is: "+sum);
    }
}
