import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        while(n-->0)
        {
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            int sum=a+b+c;
            if(sum>=2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}