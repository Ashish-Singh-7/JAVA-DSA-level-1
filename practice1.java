import java.util.*;
public class practice1{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++)
        {
            int count=0;
            int m=scn.nextInt();
            for(int div=2;div*div<=m;div++)
            {
                if(m%div==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("prime");
            }
            else
            {
                System.out.println("not prime");
            }
        }
   }
  }