import java.util.*;
public class FunctionAdd{
    public static int CalculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int sum=CalculateSum(a,b);
        System.out.println(sum);
    }
}