package Arrays;

public class MaxSubarraySum {
    //Brute force solution
    public static void findMaxSubarraySum(int numbers[]) {
        int maxSubarraySum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                int currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum+" ");
                if(maxSubarraySum < currSum) {
                    maxSubarraySum = currSum;
                }
            }
            
        }
        System.out.println("Max sum btw all sub array is: "+ maxSubarraySum);
    }
    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        findMaxSubarraySum(numbers);
    }
}
