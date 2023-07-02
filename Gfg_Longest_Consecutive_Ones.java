class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
        int count=0;
        while(N>0)
        {
            N=(N & (N<<1));
            count++;
        }
        return count;
    }
}
