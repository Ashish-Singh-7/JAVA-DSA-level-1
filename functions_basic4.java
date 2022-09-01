import java.util.Scanner;

public class functions_basic4 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String n=scn.nextLine();
        int result=count_vowels(n);
        System.out.println(result);
    }
    public static int count_vowels(String n){
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u')
            {
                count++;
            }
        }
        return count;

    }
}
