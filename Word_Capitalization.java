import java.util.*;
public class Word_Capitalization{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String input=scn.next();
        String res=input.substring(0,1).toUpperCase()+input.substring(1);
        System.out.println(res);
    }
}