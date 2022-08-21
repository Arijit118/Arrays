package Arrays;
import java.util.*;
public class LargestNumber {
    public static int findLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-Infinity
        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 3, 5};
       int largest = findLargest(numbers);
       System.out.println("Largest number is: "+largest);
    }
}
