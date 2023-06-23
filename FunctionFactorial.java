import java.util.*;
public class FunctionFactorial{
    public static int CalculateFactorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int fact=CalculateFactorial(n);
        System.out.println(fact);
    }
}