import java.util.*;
public class Translation{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        String a = scn.next();
        StringBuilder sb=new StringBuilder(a);
        if(s.equals(sb.reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}