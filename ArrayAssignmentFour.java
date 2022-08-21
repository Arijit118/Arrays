package Arrays;

public class ArrayAssignmentFour {
    public static int trappedRainWater(int height[]) {
        int trappedWater = 0;
        //Calculate Left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        //Calculate right max boundary
        int rightMax[] = new int[height.length];
        rightMax[rightMax.length-1] = height[height.length-1];
        for(int i=rightMax.length-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        //Calculate trapped water
        for(int i=0; i<height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
    public static void main(String args[]) {
        //int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; //output 6
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println("Total Trapped = "+trappedRainWater(height)); // output 9
    }
}
