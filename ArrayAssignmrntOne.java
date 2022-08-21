package Arrays;

public class ArrayAssignmrntOne {
    //brute force approach
    public static boolean containDuplicateDigit(int nums[]) {
        for(int i=0; i<nums.length; i++) {
           for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
           }         
        }

        return false;
    }
    
    public static void main(String args[]) {
        int nums[] ={1, 2, 3, 2};
        System.out.println(containDuplicateDigit(nums));
    }
}
