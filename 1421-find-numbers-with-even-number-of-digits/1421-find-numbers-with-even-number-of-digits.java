class Solution {
    public static int even(int n){
        int s1=0;
        while(n!=0){
            int s=n%10;
            s1++;
            n/=10;
        }
        return s1;
    }
    public int findNumbers(int[] nums) {
        int c=0,c1=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])%2==0)
                c++;
            else
                c1++; 
        }
        return c;
    }
}