import java.util.Scanner;

public class positive_or_negative_number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        if(n>0)
        {
            System.out.println("positive");

        }
        else if(n<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }

    }
}    