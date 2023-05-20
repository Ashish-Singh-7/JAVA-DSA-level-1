import java.util.*;
import java.util.Set;
import java.util.HashSet;
public class Boy_Or_Girl{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        Set<Character> characterSet=new HashSet<>();
        for(int i=1;i<str.length();i++)
        {
            characterSet.add(str.charAt(i));
        }
        if(characterSet.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
    }
}