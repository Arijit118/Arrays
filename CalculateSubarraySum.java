package Arrays;

public class CalculateSubarraySum {
    public static void printSubarraysum(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                int sum = 0;
                for(int k=i; k<=j; k++) {
                    sum += numbers[k];
                }
                System.out.println("Subarray sum is: "+sum);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarraysum(numbers);
    }
}
