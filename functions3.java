import java.util.Scanner;

public class functions3 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
        int result=BasetoDecimal(n,b);
        System.out.println(result);
    }
    public static int BasetoDecimal(int n, int b) {
        int answer=0;
        int power=1;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            answer+=rem*power;
            power*=b;
        }
        return answer;
    }
}
