import java.util.Scanner;

public class getting_started16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.print(factorial);
    }
}
