import java.util.Scanner;

public class getting_started7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1= scn.nextInt();
        int n2= scn.nextInt();
        int n3= scn.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println(n1);
        }
        else if(n2>n3 && n2>n1)
        {
            System.out.println(n2);
        }
        else if(n3>n1 && n1>n2)
        {
            System.out.println(n3);
        }
    }
} 
