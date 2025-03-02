class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        ArrayList<Integer> d=new ArrayList<>();
        for(int i:nums){
            s.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!s.contains(i)){
                d.add(i);
            }
        }
        return d;
    }
}