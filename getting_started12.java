import java.util.Scanner;

public class getting_started12 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        while(n>0)
        {
            int reverse=n%10;
            n=n/10;
            System.out.print(reverse);
        }
    }
}
