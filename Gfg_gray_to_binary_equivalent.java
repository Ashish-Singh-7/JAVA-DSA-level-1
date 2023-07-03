class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        int x=0;
        while(n>0)
        {
           x=x^n;
           n=n>>1;
        }
        return x;
    }
       
}