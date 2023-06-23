import java.util.*;
public class ShradhhaFunctions5th{
    public static boolean CalculateAgeForVote(int age){
        if(age>18)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int age=scn.nextInt();
        System.out.println(CalculateAgeForVote(age));
    }
}