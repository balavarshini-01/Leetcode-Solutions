class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int len=nums.length;
        for(int i=0;i<len;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}