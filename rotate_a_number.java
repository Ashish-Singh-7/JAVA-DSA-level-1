import java.util.Scanner;

public class rotate_a_number{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();

        int no_of_dig=0;
        int temp=n;
        while(temp!=0)
        {
            temp=temp/10;
            no_of_dig++;
        }

        k=k % no_of_dig;
        if(k<0)
        {
            k=k + no_of_dig;
        }

        int div=1;
        int mult=1;
        for(int i=1;i<=no_of_dig;i++)
        {
            if(i<=k)
            {
                div*=10;
            }
            else
            {
                mult*=10;
            }
        }
        int quotient=n/div;
        int remainder=n%div;
        int answer=mult*remainder+quotient;
        System.out.println(answer);
    }
}
