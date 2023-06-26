import java.util.*;
public  class ShradhhaStrings1st{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int names=scn.nextInt();
        String[] arr=new String[names];
        int TotalLength=0;
        for(int i=0;i<names;i++)
        {
            arr[i]=scn.next();
            TotalLength+=arr[i].length();
        }
        System.out.println(TotalLength);
    }
}