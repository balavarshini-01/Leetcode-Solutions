bool isPalindrome(int x)
{
   long long  int res,sum=0,temp=x;

 while(x>0)
 {
     res=x%10;
     sum=sum*10+res;
     x/=10;
 }
 if(sum==temp)
 {
     return true;
 }
 else{
 return false;
 }
}