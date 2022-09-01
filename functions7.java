import java.util.Scanner;

public class functions7 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int result=sum_of_integer(n);
        System.out.println(result);
    }
    public static int sum_of_integer(int n){
        int answer=0;
        while(n>0)
        {
            answer=answer+n%10;
            n=n/10;
        }
        return answer;
    }
}
