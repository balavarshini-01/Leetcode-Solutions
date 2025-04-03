class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int a=0;
        for(Map.Entry<Integer,Integer> i:h.entrySet()){
            if(i.getValue()>=2)
            a=i.getKey();
        }
        return a;
    }
}