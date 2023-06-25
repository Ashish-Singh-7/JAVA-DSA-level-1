import java.util.*;
public class ShradhhaArrays4th{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
            {
                isAscending=false;
            }
        }
        if(isAscending)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}