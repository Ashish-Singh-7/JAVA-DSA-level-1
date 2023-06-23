import java.util.*;
public class FunctionMultiply{
    public static int CalculateProduct(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int product=CalculateProduct(a,b);
        System.out.println(product);
    }
}