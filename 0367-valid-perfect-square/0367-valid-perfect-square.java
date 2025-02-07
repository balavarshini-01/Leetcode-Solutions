class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long x = num;  // Use long to prevent overflow
        while (x * x > num) {
            x = (x + num / x) / 2;  // Newton's formula
        }
        return x * x == num;
    }
}
