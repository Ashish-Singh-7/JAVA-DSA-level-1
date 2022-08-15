import java.util.Scanner;

public class getting_started11 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int sum=0;
        while(n>0)
        {
            int dig=n%10;
            n=n/10;
            sum+=dig;
            System.out.println(sum);
        }

    }
}
