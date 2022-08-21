package Arrays;

public class LinearSearch {
    public static void linearSearch(int key, int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                System.out.println("Key found in "+i+"th index");
            }
        }
    }
    public static int secondLinearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 20;
        // linearSearch(key, numbers);
        int index = secondLinearSearch(numbers, key);
        if(index==-1) {
            System.out.println("Key Not Found.");
        } else {
            System.out.println("Key found at: "+index);
        }
    }
}
