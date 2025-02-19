class Solution {
    public int heightChecker(int[] heights) {
        int ex[]=Arrays.copyOf(heights,heights.length);
        Arrays.sort(ex);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=ex[i])
            c+=1;
        }
        return c;
    }
}