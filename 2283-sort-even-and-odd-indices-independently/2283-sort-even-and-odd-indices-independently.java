class Solution {    
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int even[]=new int[(n+1)/2];
        int odd[]=new int[n/2];
          int u=0,v=0;
        if(nums.length==2)
            return nums;
        else{
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
            even[u++]=nums[i];
            else
            odd[v++]=nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
    
      u=0;
       v=(nums.length/2)-1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
            nums[i]=even[u++];
            else
            nums[i]=odd[v--];
        }
        }
    return nums;
}}