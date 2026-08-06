class Solution {
    public int smallestNumber(int n, int t) {
       int tem=1;
       int a=n;
       while(a>0)
       {
        int re=a%10;
        tem*=re;
        a/=10;
       }
       if(tem%t!=0)
       {
        return smallestNumber(n+1,t);
       }
       return n;


    }
}