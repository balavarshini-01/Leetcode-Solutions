class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,d=0,r=0,l=0;
        int len=moves.length();
        for(int i=0;i<len;i++){
            if(moves.charAt(i)=='U')
            u++;
            else if(moves.charAt(i)=='D')
            d++;
            else if(moves.charAt(i)=='L')
            l++;
            else
            r++;
        }
        if(u!=d)
        return false;
        else if(l!=r)
        return false;
        else
        return true;



    }
}