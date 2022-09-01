import java.util.Scanner;

public class functions6 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int b = scn.nextInt();
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
        
            int d = getDifference(b, n1, n2);
            System.out.println(d);
         }
        
         public static int getDifference(int b, int n1, int n2){
             // write your code here
             int answer=0;
             int power=1;
             while(n1>0 || n2>0)
             {
                 int num1=n1 % 10;
                 int num2=n2 % 10;
                 n1=n1/10;
                 n2=n2/10;
                 
                 int dig=n2 - n1;
                 dig=dig%b;
                 
                 answer= answer+dig*power;
                 power*=10;
             }
             return answer;
            }
}
