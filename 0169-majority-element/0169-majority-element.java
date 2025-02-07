import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int start=0;
        int end=nums.length-1;;
        Arrays.sort(nums);
        return nums[(start+end)/2];
    }
}
