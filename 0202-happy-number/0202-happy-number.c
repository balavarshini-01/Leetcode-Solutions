int logu( int n)
{
    int sum=0,res;
    while(n!=0)
    {
        res=n%10;
        sum=sum+pow(res,2);
        n=n/10;
    }
    return sum;
}
bool isHappy(int n)
{
    int a,b;
  a=logu(n);
  b=logu(logu(n));
  while(a!=b)
  {
      a=logu(a);
      b=logu(logu(b));
  }
 return b==1;
}
