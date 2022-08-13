import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }

            int space=2*(n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
