import java.util.Scanner;

public class functions2{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
        int result=convert_Number_To_base(n,b);
        System.out.print(result);
    }
    public static int convert_Number_To_base(int n, int b) {
        int answer=0; int power=1;
        while(n!=0)
        {
            int rem=n%b;
            n=n/10;
            answer=answer+rem*power;
            power*=10;
        }
        return answer;
    }

}