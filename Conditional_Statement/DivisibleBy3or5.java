import java.util.Scanner;

public class DivisibleBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println("The number is divisible by 3 and 5");
        }
        else{
            System.out.println("Not divisible by 3 and 5");
        }
    }
}
