import java.util.Scanner;

public class functions8 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int year=scn.nextInt();

        if((year%400==0) || (year%4==0 && year%100!=0))
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
            
        }
    }
}
