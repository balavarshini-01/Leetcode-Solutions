class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pas=new ArrayList();
       for(int i=0;i<numRows;i++){
         List<Integer> rr=new ArrayList();
           for(int j=0;j<=i;j++){
           if(j==0||j==i) rr.add(1);
           else{
               List<Integer> pre=pas.get(i-1);
               rr.add(pre.get(j)+pre.get(j-1));
           }
       }
     pas.add(rr);
    }
    return pas;
}}