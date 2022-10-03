import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
        String s=str.charAt(0)+"";
        for(int i=1;i<str.length();i++)
        {
            char current=str.charAt(i);
            char previous=str.charAt(i-1);
            if(current!=previous)
            {
                s+=current;
            }
        }
        return s;
	}

	public static String compression2(String str){
		// write your code here
        String s=str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            char current=str.charAt(i);
            char previous=str.charAt(i-1);
            if(current==previous)
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    s+=count;
                    count=1;
                }
                s+=current;
            }
        }
        if(count>1)
        {
            s+=count;
            count=1;
        }
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}