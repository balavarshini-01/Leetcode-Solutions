class Solution {
    public boolean isAnagram(String s, String t) {
       char ch[]=s.toCharArray();
       char c[]=t.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(c);
       String q=new String(ch);
       String w=new String(c);
       if(q.equals(w))
       return true;
       else
       return false;

    }
}