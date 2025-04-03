class Solution {
    public int partitionString(String s) {
        int l=1;
        HashSet<Character>h=new HashSet<>();
       for(char c:s.toCharArray()){
        if(h.contains(c)){
            l++;
            h.clear();
        }
        h.add(c);
       }
       return l;

    }
}