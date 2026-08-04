class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result=new int[nums.length];
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                result[pos]=nums[i];
                pos++;
            }
            }
             for(int i=0;i<nums.length;i++){
                if(nums[i]%2!=0){
                result[pos]=nums[i];
                pos++;
                }
            }
            return result;
    }
}