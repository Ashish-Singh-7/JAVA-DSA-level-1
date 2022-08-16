import java.util.Scanner;

public class getting_started13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int o=1;
        while(n>0)
        {
            int reverse=0;
            int lastDigit=n%10;
            int or=reverse*10+lastDigit;
            n=n/10;
        }

        
        if(n==1)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("no palindrome");
        }


    }
}