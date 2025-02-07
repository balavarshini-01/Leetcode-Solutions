class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> hm = new HashMap<>(num.length());
        for(int u=0;u<num.length();u++){
            int c=num.charAt(u)-'0';
                hm.put(c,hm.getOrDefault(c,0)+1);
            
        }
        
            for(int u=0;u<num.length();u++){
                int c=num.charAt(u)-'0';
                int i=0;
                if(hm.containsKey(u)){
                    i=hm.get(u);
                }
                
            
        if(i!=c)
        return false;
            }
        return true;

        
    }
}