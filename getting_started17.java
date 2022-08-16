import java.util.Scanner;

public class getting_started17 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        int power=scn.nextInt();
        int result=1;

        while(power>0)
        {
            result=result*number;
            power--;
        }
        System.out.print(result);
    }
}
