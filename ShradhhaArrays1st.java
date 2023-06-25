import java.util.*;
public class ShradhhaArrays1st{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        for(int i=0;i<arr.length;i++)11
        {
            if(arr[i]==x)
            {
                System.out.println(i);
            }
        }
    }
}