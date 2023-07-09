import java.util.*;
public class Shradhha_Recursions6th{
    public static int CalPower(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int xpownm1=CalPower(x,n-1);
        int xpown=x*xpownm1;
        return xpown;
    }
    public static void main(String[] args)
    {
        int x=2;
        int n=6;
        int ans=CalPower(x,n);
        System.out.println(ans); 
    }
}