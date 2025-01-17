import java.util.Scanner;

public class CpSp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price:");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price:");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("You made a profit");
            System.out.print("Your Profit is:");
            int profit = sp-cp;
            System.out.print(profit);
        }
        if(cp>sp){
            System.out.println("You incurred a loss");
            System.out.print("Your Loss is:");
            int loss = cp - sp;
            System.out.print(loss);
        }
    }
}
