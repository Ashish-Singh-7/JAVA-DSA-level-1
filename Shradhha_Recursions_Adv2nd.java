import java.util.*;
public class Shradhha_Recursions_Adv2nd{
    public static int totalPaths(int i,int j,int n,int m){
        if(i==n || j==n)
        {
            return 0;
        }
        if(i==n-1 || j==n-1)
        {
            return 1;
        }
        int downPath=totalPaths(i+1,j,n,m);
        int rightPath=totalPaths(i,j+1,n,m);
        return downPath + rightPath;
    }
    public static void main(String[] args){
        int n=3;
        int m=3;
        int totalPath=totalPaths(0,0,n, m);
        System.out.println(totalPath);
    }
}