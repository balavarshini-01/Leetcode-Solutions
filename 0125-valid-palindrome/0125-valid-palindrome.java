class Solution {
    public boolean isPalindrome(String s) {

        String a= s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
  
        String sb=new StringBuffer(a).reverse().toString();
        return a.equals(sb);
            
        
    }
}