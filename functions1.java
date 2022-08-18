import java.util.Scanner;

public class functions1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int result=getDigitFrequency(n,d);
        System.out.println(result);
    }
    public static int getDigitFrequency(int n,int d) {
        int count=0;
        while(n>0)
        {
            int dig=n%10;
            n=n/10;
            if(dig==d)
            {
                count++;
            }
        } 
        return count;    
    }
}