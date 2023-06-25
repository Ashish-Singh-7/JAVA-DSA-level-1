import java.util.*;
public class ShradhhaArrays3rd{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}