import java.util.*;

class move_all_negative_elements_to_one_side_of_an_array{
    public static void main(String args[]){
        System.out.print("Enter no. of element in the array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+" : ");
            a[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                int t=a[i];
                a[i]=a[k];
                a[k]=t;
                k++;
            }
        }
        System.out.print("The required array is\t");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
    }
}