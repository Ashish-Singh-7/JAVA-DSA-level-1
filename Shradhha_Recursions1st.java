import java.util.*;
public class Shradhha_Recursions1st{
    public static void printNumb(int n){
        if(n==0)//Base Case
        {
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printNumb(n);
    }
}
//print from 5 to 1