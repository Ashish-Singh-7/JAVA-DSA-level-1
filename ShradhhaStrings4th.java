import java.util.*;
public class ShradhhaStrings4th{
    public static void main(Strings[] args){
        StringBuilder sb=new StringBuilder("tony");
        for(int i=0;i<sb.length()/2;i++)
        {
            int front=i;
            int back=sb.length()-i-1;// 5-1-0=4

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}