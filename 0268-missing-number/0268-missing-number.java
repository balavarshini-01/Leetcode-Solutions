import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        // int len=nums.length;
       
        // int f=0;
        // for(int i=0;i<nums.length;i++){
        //     len+=i-nums[i];
        // }
        //     return len;
        // }
   int n=nums.length;
       return (IntStream.range(0,n+1)).sum() - Arrays.stream(nums).sum()  ;
    }
}