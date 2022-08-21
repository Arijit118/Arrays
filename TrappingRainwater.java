package Arrays;

public class TrappingRainwater {
    public static int calTrappedRainWater(int height[]) {
        int n = height.length;
        int trappedWater = 0;
        //Calculate left max boundry - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        //Calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        //Calculate Trapped water
        for(int i=0; i<n; i++) {
            //Calculate waterLevel = min(leftMax Boundary, rightMax Boundary);
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //Trapped water = water level - height * width(here width=1)
            trappedWater += waterLevel - height[i]; 
        }
        return trappedWater;
    }
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5}; 
        System.out.println("Total trapped water= "+ calTrappedRainWater(height));
    }
}
