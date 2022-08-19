import java.util.Scanner;

public class functions_start1{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int result=getProduct(n1,n2);
        System.out.println(result);
    }
    public static int getProduct(int n1,int n2) {
        return n1*n2;
    }
}