class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String q="";
        for(int i=0;i<words.size();i++){
            q+=words.get(i).charAt(0);
    }
    if(q.equals(s))
    return true;
    else
    return false;
}}