import java.util.*;
public class Shraddha2dArrays3rd{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int rows=scn.nextInt();
        int columns=scn.nextInt();
        int[][] arr=new int[rows][columns];
        int total_no_elements=rows * columns;
        int count=0;

        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        while(count<total_no_elements)
        {
            for(int i=minr,j=minc;i<=maxr && count<total_no_elements;i++)
            {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            for(int i=maxr,j=minc;j<=maxc && count<total_no_elements;j++)
            {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            for(int i=maxr,j=maxc;i>=minr && count<total_no_elements;i--)
            {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            for(int i=minr,j=maxc;j>=minc && count<total_no_elements;j--)
            {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
}