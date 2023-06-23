import java.util.*;
public class ShradhhaFunctions1st{
    public static int CalculateAverage(int a,int b,int c){
        int average=(a+b+c)/3;
        return average;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int average=CalculateAverage(a,b,c);
        System.out.println(average);
    }
}