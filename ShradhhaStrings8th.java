import java.util.*;
public class ShradhhaStrings8th{
public static void main(String[] args)
    {
        String arr[] = {"geeksforgeeks", "geeks",
            "geek", "geezer"};
        int n = arr.length;
 
        String ans = commonPrefix(arr, n);
 
        if (ans.length() > 0) {
            System.out.println("The longest common prefix is "
                    + ans);
        } else {
            System.out.println("There is no common prefix");
        }
    }
}