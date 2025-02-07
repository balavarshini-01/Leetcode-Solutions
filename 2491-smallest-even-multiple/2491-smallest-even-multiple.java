class Solution {
    public int smallestEvenMultiple(int n) {
        int lcm,o=0;
        lcm=n>2?n:2;
        while(true){
            if(lcm%2==0 && lcm%n==0){
            o=lcm;
            break;
            }++lcm;
        }return o;
    }
}