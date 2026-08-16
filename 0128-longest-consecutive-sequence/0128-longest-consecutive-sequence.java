class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0,max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
        if (!set.contains(num-1)) {
            int temp = num;
            count = 1;
        while (set.contains(temp+1)) {
          temp++;
          count++;
        }
        max=Math.max(max,count);
        }
        }
        return max;
    }
}