import java.util.Scanner;

public class getting_started10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

         if((n%4==0 && n%100!=0) || (n%400==0))
         {
            System.out.println("Leap year");
         }
         else
         {
            System.out.println("not a leap year");
         }
    }
}
