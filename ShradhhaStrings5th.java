import java.util.*;
public class ShradhhaStrings5th{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse))
        {
            System.out.println("is Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}