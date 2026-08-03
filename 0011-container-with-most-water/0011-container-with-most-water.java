class Solution {
    public int maxArea(int[] height) {
        int area=0,max_water=0,left=0,right=height.length-1;
        while(left<right) {
            area = Math.min(height[left], height[right]) * (right - left);
            max_water = Math.max(max_water, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max_water;
    }
}