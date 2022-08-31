import java.util.Scanner;

public class functions5 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int result=getSum(b,n1,n2);
        System.out.println(result);
    }
    public static int getSum(int b, int n1, int n2){
        // write ur code here
        int answer=0;
        int carry=0;
        int power=1;
        while(n1>0 || n2>0 || carry>0)
        {
            int num1=n1%10;
            int num2=n2%10;
            
            n1=n1/10;
            n2=n2/10;
            
            int dig=num1+num2+carry;
            
            carry=dig/b;
            dig=dig%b;
            
            answer=answer+dig*power;
            power*=10;
        }
        return answer;
    }
}
