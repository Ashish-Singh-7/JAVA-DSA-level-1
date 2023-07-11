import java.util.*;
public class Shradhha_Recursions_Adv4th{
    public static int GuestCall(int n){
        if(n<=1)
        {
            return 1;
        }
        int SingleCall=GuestCall(n-1);
        int PairCall=(n-1)*GuestCall(n-2);
        return SingleCall+PairCall;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(GuestCall(n));
    }
    
}