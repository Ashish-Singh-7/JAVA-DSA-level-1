import java.util.Scanner;

public class functions_basic3 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int n3=scn.nextInt();
        int result=average(n1,n2,n3);
        System.out.println(result);
    }
    public static int average(int n1,int n2,int n3){
        int answer=(n1+n2+n3)/3;
        return answer;
    }
}
