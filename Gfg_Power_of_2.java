class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        long value=(n & (n-1));
        if(value==0 && n!=0)
        {
            return true;
        }
        return false;
    }
    
}