class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
       
        int f=0;
        for(int i=0;i<nums.length;i++){
            len+=i-nums[i];
        }
            return len;
        }
    
}