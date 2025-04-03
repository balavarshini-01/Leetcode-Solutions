class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> h=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                h.add(i);
            }
        }
        if(k>h.size()){
            return -1;
        }
        int a=h.get(k-1);
        return a;
    }
}