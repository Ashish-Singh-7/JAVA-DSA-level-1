import java.util.*;
public class ShradhhaFunctions{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            int num=scn.nextInt(i);
        }
        int positive=0;int negative =0;int zero=0;
        if(num(i)>0)
        {
            positive++;
            System.out.println(positive);
        }
        else if(num(i)<0)
        {
            negative++;
            System.out.println(negative);
        }
        else;
        {
            zero++;
            System.out.println(zero);
        }
    }
}