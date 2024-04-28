public class MaxOnesSequence {
    public static int maxOnesSequence(int[] arr) {
        int maxSequence = 0;
        int currentSequence = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentSequence++;
                if (currentSequence > maxSequence) {
                    maxSequence = currentSequence;
                }
            } else {
                currentSequence = 0;
            }
        }
        
        return maxSequence;
    }
    
    public static void main(String[] args) {
        int[] binaryArray = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        int maxSequence = maxOnesSequence(binaryArray);
        System.out.println("Maximum sequence of ones: " + maxSequence);
    }
}
