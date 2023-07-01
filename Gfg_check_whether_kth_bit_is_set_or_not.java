class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
         n=n>>k;
         if(n%2==0)
         {
             return false;
         }
         else
         {
             return true;
         }
    }
}