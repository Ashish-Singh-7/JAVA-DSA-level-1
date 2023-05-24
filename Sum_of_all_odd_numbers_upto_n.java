import java.util.*;
public class Sum_of_all_odd_numbers_upto_n{
    public static int Calculate_Sum_of_all_odd_numbers_upto_n(int n){
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(Calculate_Sum_of_all_odd_numbers_upto_n(n));
    }
}