import java.util.*;
public class Shradhha_Recursions12th{
    public static void Subsequences(String str,int index,String newString){
        if(index==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        // to be 
        Subsequences(str,index+1,newString+currChar);
        //or not to be
        Subsequences(str,index+1,newString);
    }
    public static void main(String[] args){
        String str="abc";
        Subsequences(str,0,"");
    }
}