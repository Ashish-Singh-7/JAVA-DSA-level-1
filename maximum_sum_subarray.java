import java.util.*;

public class maximum_sum_subarray{
    public static void main(String args[]){
        System.out.print("Enter no. of element in the array  : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+" : ");
            a[i]=sc.nextInt();
        }
        int sum=a[0];
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                    s=s+a[j];
                    if(sum<s){
                        sum=s;
                    
                }
            }
        }
        System.out.println("The sum is "+sum);
    }
}