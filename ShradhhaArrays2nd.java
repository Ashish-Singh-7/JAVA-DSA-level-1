import java.util.*;
public class ShradhhaArrays2nd{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.next();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}