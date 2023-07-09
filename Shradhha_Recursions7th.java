import java.util.*;
public class Shradhha_Recursions7th{
    public static void TowerOfHanoi(int n,String source,String helper,String dest){
        if(n==1)
        {
            System.out.println("transfer disk"+n+"from"+source+"to"+dest);
            return;
        }
        TowerOfHanoi(n-1,source,dest,helper);
        System.out.println("transfer disk"+n+"from"+source+"to"+dest);
        TowerOfHanoi(n-1,helper,source,dest);
    }
    public static void main(String[] args){
        int n=3;
        TowerOfHanoi(n,"S","H","D");
    }
}