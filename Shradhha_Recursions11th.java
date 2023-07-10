import java.util.*;
public class Shradhha_Recursions11th{
    public static void MoveAllx(String str,int index,int count,String newString){
        if(index==str.length()){
            for(int i=0;i<count;i++)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        if(currChar=='x'){
            count++;
        }
        else
        {
            newString+=currChar;
        }
        MoveAllx(str,index+1,count,newString);
    }
    public static void main(String[] args){
        String str="axbcxdxx";
        MoveAllx(str,0,0,"");
    }

}
