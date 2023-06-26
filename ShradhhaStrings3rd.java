import java.util.*;
public class ShradhhaStrings3rd{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        String username=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='@')
            {
                break;
            }
            else
            {
                username+=str.charAt(i);
            }
        }
        System.out.println(username);
    }
}