class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        StringBuffer q=new StringBuffer(s);
        String c=q.reverse().toString();
        int even=0,odd=0;
        int arr[]=new int[2];
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='1' && i%2==0)
            even++;
            else if(c.charAt(i)=='1')
            odd++;
        }
        arr[0]=even;
        arr[1]=odd;
        return arr;
    }
}