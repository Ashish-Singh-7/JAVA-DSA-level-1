import java.util.Scanner;

public class getting_started8 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();

        int count=0;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("the number is prime");
        }
        else
        {
            System.out.println("the number is not prime");
        }
    }
    
}
