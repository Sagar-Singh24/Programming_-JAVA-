//package Conditional_Statement;
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int a = sc.nextInt();
        if(a%5==0){
            System.out.println("Yes,it is divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
}
