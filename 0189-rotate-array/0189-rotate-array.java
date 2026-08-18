class Solution {
    public void rotate(int[] nums, int k) {
        int left=0,right=nums.length-1,temp=0;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        int[] result=new int[nums.length];
        k=k%nums.length;
        left=0;
        right=k-1;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            result[left]=temp;
            left++;
            right--;
        }
        left=k;
        right=nums.length-1;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            result[left]=temp;
            left++;
            right--;
        }
    }
}