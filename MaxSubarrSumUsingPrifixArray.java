package Arrays;

public class MaxSubarrSumUsingPrifixArray {
    public static void findMaxSubarrSum(int numbers[]) {
        int currSum = 0;
        int maxSubarrSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        //Calculate Prefix array
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        //Calculate max subarray sum
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = start>0 ? prefix[end] - prefix[start-1] : prefix[end];
                System.out.println(currSum);
                if(maxSubarrSum < currSum) {
                    maxSubarrSum = currSum;
                }
            }
        }
        System.out.println("Max sum between all subarrays sum is: "+maxSubarrSum);
    }    
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        
        findMaxSubarrSum(numbers);
    }
}
