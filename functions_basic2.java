import java.util.Scanner;

import java.util.Scanner;

public class functions_basic2{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int n3=scn.nextInt();
        int result=smallest(n1,n2,n3);
        System.out.println(result);
    }
    public static int smallest(int n1,int n2,int n3){
        if(n1<n2 && n1<n3)
        {
            return n1;
        }
        else if(n2<n1 && n2<n3)
        {
            return n2;
        }
        else
        {
            return n3;
        }
    }
}