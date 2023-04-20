import java.util.*;
public class Kadane_Algorithm{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        int maximum_sum=arr[0],current_sum=0;
       for(int i=0;i<n;i++) //maximizing sum
       {
           current_sum+=arr[i];
           if(current_sum>maximum_sum){
               maximum_sum=current_sum;
           }
           if(current_sum<=0){
               current_sum=0;
           }
       }
       return maximum_sum;
    }
}
//THIS QUESTION IS SOLVED IN O(N) TIME AND O(1) SPACE COMPLEXITY