package Arrays;

public class MaxSubArraySumUsingKadanAlgo {

    //Calculate max sub array sum using kadanes algo.
    public static void findMaxSubarrSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<numbers.length; i++) {
            currSum = currSum + numbers[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max sum between all sub arrays is: "+maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        findMaxSubarrSum(numbers);
    }
}
