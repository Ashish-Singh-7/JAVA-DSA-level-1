import java.util.*;
public class Shradhha_Recursions2nd{
    public static void printNumb(int n){
        if(n==6)//Base Case
        {
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String[] args){
        int n=1;
        printNumb(n);
    }
}
//print from 1 to 5