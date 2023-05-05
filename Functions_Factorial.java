import java.util.*;
public class Functions_Factorial{
    public static int CalculateFactorial(int n){
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(CalculateFactorial(n));
    }
}