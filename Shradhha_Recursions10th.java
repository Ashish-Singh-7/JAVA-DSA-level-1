import java.util.*;
public class Shradhha_Recursions10th{
    public static boolean SortedArrayOrNot(int arr[],int index){
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index+1]>arr[index])
        {
            return SortedArrayOrNot(arr,idx+1);
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println(SortedArrayOrNot(arr, 0));
    }
}