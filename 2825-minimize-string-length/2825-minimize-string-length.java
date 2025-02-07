class Solution {
    public int minimizedStringLength(String s) {
        String a="";
        char[] c=s.toCharArray();
        int i,j;
        for(i=0;i<s.length();i++){
            for(j=0;j<s.length();j++){
            if(c[i]==c[j])
            break;
        }
        if(i==j)
        a=a+c[i];
    }
    return a.length();
}}