import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
// write your code here
Scanner scn=new Scanner(System.in);
int rows=scn.nextInt();
int columns=scn.nextInt();

int arr[][]=new int[rows][columns];

for(int i=0;i<rows;i++)
{
    for(int j=0;j<columns;j++)
    {
        arr[i][j]=scn.nextInt();
    }
}

for(int i=0;i<rows;i++)
{
    for(int j=0;j<columns;j++)
    {
        System.out.print(arr[i][j]+ " ");
    }
    System.out.println();
}
}
}