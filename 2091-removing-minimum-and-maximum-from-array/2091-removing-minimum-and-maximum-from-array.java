class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=1){
            return 1;
        }
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int minIndex=0,maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]){
                maxIndex=i;
            }
            if(min==nums[i]){
                minIndex=i;
            }
        }
        int front=Math.max(minIndex,maxIndex)+1;
        int back=nums.length-Math.min(minIndex,maxIndex);
        int both=Math.min(minIndex,maxIndex)+1+nums.length-Math.max(minIndex,maxIndex);
        return Math.min(front,Math.min(back,both));
    }
}