import java.util.Scanner;

public class getting_started5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number1=scn.nextInt();
        int number2=scn.nextInt();

        int sum=0;
        for(int i=number1;i<=number2;i++)
        {
            sum+=i;
            System.out.println(sum);
        }

    }
}
