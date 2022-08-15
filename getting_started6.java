import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class getting_started6 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n1=scn.nextInt();
        int n2=scn.nextInt();
        if(n1>n2)
        {
            System.out.println(n1);
        }
        else if(n1<n2)
        {
            System.out.println(n2);
        }
        else
        {
            System.out.println("n1 is equal to n2");
        }
        
    }
}