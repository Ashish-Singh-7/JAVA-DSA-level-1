class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int count=0;
        while(a>0 | b>0)
        {
            if(a%2!=b%2)
            {
                count++;
            }
            a=a>>1;b=b>>1;
        }
        return count;
    }
}
