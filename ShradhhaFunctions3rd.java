import java.util.*;
public class ShradhhaFunctions3rd{
    public static int GreatestOfTwo(int a,int b){
        if(a>b)
        {
            return a;
        }
        return a;
        else{
            return b;
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int greatest=GreatestOfTwo(a,b);
        System.out.println(greatest);
    }
}