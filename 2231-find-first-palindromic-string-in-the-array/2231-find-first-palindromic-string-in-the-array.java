class Solution {
    public boolean pali(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;
        }
        if(r.equals(s))
        return true;
        else
        return false;
    }
    public String firstPalindrome(String[] words) {
        String a="";
        for(String i:words){
                if(pali(i)){
                a=i;
                break;}
                
            }return a;
        }
    }
