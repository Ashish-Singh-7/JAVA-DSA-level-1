import java.util.*;
public class Shradhha_Recursions4th{
    public static int CalFactorial(int n){
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact_nm1=CalFactorial(n-1);
        int fact=n*fact_nm1;
        return fact;
    }
    public static void main(String[] args){
        int n=5;
        int ans=CalFactorial(n);
        System.out.println(ans);
    }
}