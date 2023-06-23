import java.util.*;
public class ShradhhaFunctions2nd{
    public static int CalculateSumOdd(int n){
        int sum=1;
        for(int i=2;i<=n;i++)
        {
            if((i%2)!=0)
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=CalculateSumOdd(n);
        System.out.println(sum);
    }
}