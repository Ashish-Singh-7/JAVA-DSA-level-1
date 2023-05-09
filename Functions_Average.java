import java.util.*;
public class Functions_Average{
    public static int Calculate_Average(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        System.out.println(Calculate_Average(a,b,c));
    }
}
