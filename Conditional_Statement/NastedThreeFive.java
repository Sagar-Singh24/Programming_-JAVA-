import java.util.Scanner;

public class NastedThreeFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        // if(n%5==0 || n%3==0){
        //     if(n%15!=0){
        //         System.out.println("The number is divisible by 3 and 5 but not 15");
        //     }else{
        //         System.out.println("Not matching the required condition");
        //     }
        // }
        if( n%15!=0 && (n%5==0||n%3==0) ){
            System.out.println("The number is divisible by 3 and 5 but not 15");
        }else{
                System.out.println("Not matching the required condition");
           }
   
    }

}
