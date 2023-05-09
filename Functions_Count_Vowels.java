import java.util.*;
public class Functions_Count_Vowels{
    public static int Count_vowels(String str)
    {
        int count=0;
        for(int n=0;n<str.length();n++)
        {
            if(str.charAt(n)=='a' || str.charAt(n)=='e' || str.charAt(n)=='i' || str.charAt(n)=='o' || str.charAt(n)=='u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        System.out.println(Count_vowels(str));
    }
}