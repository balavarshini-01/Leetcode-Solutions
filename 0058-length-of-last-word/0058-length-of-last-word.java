import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
       s=s.replaceAll("\\s+"," ").trim();
        ArrayList<String> ar=new ArrayList<>();
        ArrayList ar1=new ArrayList(); 
        int in = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                ar.add(s.substring(in, i));
                in = i + 1;
            }
        }
        ar.add(s.substring(in));
        ar1.add(ar.get(ar.size()-1));
        char[] chars = ar1.toString().toCharArray();
        return (chars.length)-2;
        
    }
}