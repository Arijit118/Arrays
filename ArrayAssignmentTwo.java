package Arrays;

public class ArrayAssignmentTwo {
    public static int search(int nums[], int target) {
        //min will have index of minimum element of nums array
        int min = minSearch(nums);

        //find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1]) {
            return search(nums, min, nums.length-1, target);
        } else {
            return search(nums, 0, min, target);
        }
    }
    //Binary search to find target in left to right boundary(helper function)
    public static int search(int nums[], int left, int right, int target) {
        int l = left;
        int r = right;
        while(l<=r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    //Find Smallest element index(helper function)
    public static int minSearch(int nums[]) {
        int left = 0;
        int right = nums.length-1;

        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mid>0 && nums[mid-1]>nums[mid]) {
                return mid;
            } else if(nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return left;
    }
    public static void main(String args[]) {
        /*
         * There is an integer array nums sorted in ascending order (with distinct values).
         * Prior to being passed to your function, 
         * nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  
         * such  that  the  resulting  array  is 
         * [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).
         * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and 
         * become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and 
         * an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.
         * You must write an algorithm with O(log n) runtime complexity.
         */
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;//output should 4
        //System.out.println(minSearch(nums));
        System.out.println(search(nums, target));

    }
}
