import java.util.Scanner;

public class IsSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        int length = sc.nextInt();
        System.out.print("Enter breadth:");
        int breadth = sc.nextInt();
        if(length == breadth){
            System.out.println("Yes,it is square");
        }else{
            System.out.println("Not square");
        }
    }
}
