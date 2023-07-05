class Solution
{
    //Function to swap odd and even bits.
    public static unsigned int swapBits(unsigned int n)
    {
    	// Your code here
    	unsigned int even = n & 0xAAAAAAAA;  // extract even bit only 
    	unsigned int odd = n & 0x55555555;   // extract odd vit only
    	even >>= 1; 
        odd <<= 1;
        //Combine the shifted values of odd and even bits.
        return even | odd;
    	
    }

    
}