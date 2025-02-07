class Solution {
    public int addDigits(int num) {
        int sum=0,sum1=0;
        while(num>0 || sum>9){
            if(num==0){
                num=sum;
                sum=0;
            }
            int t=num%10;
            sum=sum+t;
            num/=10;
        }
        
        return sum;
    }
}