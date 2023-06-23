import java.util.*;
public class ShradhhaFunctions8th{
    public static int CalculatePower(double x, int n){
        while(n!=0)
        {
            double result=Math.pow(x,n);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        double x=scn.nextInt();
        double result=CalculatePower(x,n);
        System.out.println(result);
    }
}