class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<Double> a = new TreeSet<>();
        for(int i=0,j=n-1;i<j;i++,j--){
           double al=(double)(nums[i]+nums[j])/2;
           a.add(al);
        }
        return a.size();
    }
}