import java.util.*;
public class pattern_3{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(i<=2)
        {
            i++;
            j--;
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}