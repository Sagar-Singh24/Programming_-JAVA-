import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Day = sc.nextInt();

        switch (Day){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednusday");
            break;

            case 4:
            System.out.println("Thrusday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
            System.out.println("Invalid");
        }
    }
}
