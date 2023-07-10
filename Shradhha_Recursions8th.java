import java.util.*;
public class Shradhha_Recursions8th{
    public static void printReverse(String s,int index){
        if(index==0)
        {
            System.out.println(s.charAt(index));
            return;
        }
        System.out.println(s.charAt(index));
        printReverse(s,index-1);
    }
    public static void main(String[] args){
        String s="abcd";
        printReverse(s, s.length()-1);
    }
}