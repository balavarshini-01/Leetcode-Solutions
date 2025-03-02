class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int a=0;
        // int len=nums.length;
        // int arr[]=new int[2];
        // for(int i=0;i<len;i++){
        //     for(int j=i+1;j<len;j++){
        //         if(nums[i]+nums[j]==target){
        //             arr[a]=i;
        //             a++;
        //             arr[a]=j;
        //             break;
        //         }
        //     }
        // }
        // return arr;

         int arr[]=new int[2];
         HashMap<Integer,Integer> m=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(m.containsKey(a)){
                return new int[] {
                    m.get(a),i
                };
            }
            m.put(nums[i],i);
         }
         return new int[]{};
    }
}