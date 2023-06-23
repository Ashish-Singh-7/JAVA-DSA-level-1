import java.util.*;
public class ShradhhaFunctions4th{
    public static Double CalculatePerimeter(Double r){
        Double perimeter=2 * 3.14 * r;
        return perimeter;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        Double r=scn.nextDouble();
        Double perimeter=CalculatePerimeter(r);
        System.out.println(perimeter);
    }
}