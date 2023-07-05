class Solution{
    
   // Function for finding maximum AND value.
    public static int countMatchingElements(int sequence, int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if ((sequence & array[i]) == sequence) counter++;
        }
        return counter;
    }
    public static int maxAND (int array[], int n) {
        int result = 0;
        for (int i = 16; i >= 0; i--) {
            int counter = countMatchingElements(result | (1 << i), array);
            if (counter >= 2) result |= (1 << i);
        }
        return result;
    }
    
}