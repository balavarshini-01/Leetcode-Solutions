class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0;
        int len=nums.length;
        int arr[]=new int[2];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j]==target){
                    arr[a]=i;
                    a++;
                    arr[a]=j;
                    break;
                }
            }
        }
        return arr;
    }
}