import java.util.*;
public class ShradhhaStrings6th{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        char character='o';
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==character)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}