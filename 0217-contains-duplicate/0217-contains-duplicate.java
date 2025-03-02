class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int len=nums.length;
        // int n=0;
        // for(int i=0;i<len;i++){
        //     for(int j=i+1;j<len;j++){
        //         if(nums[i]==nums[j])
        //             n+=1;
        //             break;
        //     }
        // }
        // if(n>=2||n==1)
        // return true;
        // else
        // return false;
        
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        if((nums.length)==(s.size())){
            return false;
        }
        else
        return true;
    }
}