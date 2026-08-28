class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length==1){
            return 0;
        }
        int diff=0;
        int left=0;
        int right=k-1;
        int min=nums[right]-nums[left];
        while(right<nums.length) {
            diff=nums[right]-nums[left];
            min=Math.min(diff,min);
            left++;
            right++;
        }
        return min;
    }
}