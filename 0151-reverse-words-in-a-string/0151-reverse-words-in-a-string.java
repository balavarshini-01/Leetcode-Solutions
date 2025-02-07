class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split(" ");
        String str1="";
        for(int i=str.length-1;i>=0;i--){
            str1+=str[i]+" ";
        }
        String res=str1.replaceAll("\\s+", " ");
        return (res.substring(0, res.length() - 1));
    }
}