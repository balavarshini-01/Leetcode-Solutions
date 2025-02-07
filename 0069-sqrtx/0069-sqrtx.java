class Solution {
    public int mySqrt(int x) {
        double a=Math.sqrt(x);
        double b=Math.floor(a);
        return (int)b;
    }
}