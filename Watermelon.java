import java.util.*;
public class Watermelon{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n%2==0)
        {
            if(n==2){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
}