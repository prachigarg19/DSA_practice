class Solution {
    public double myPow(double x, int n) {
        return calc(x,(long)n);
    } 
    public double calc( double x, long n)
    {
        if(x==0) return 0;
        if(n==0||x==1) return 1.0;
        if(n < 0) return calc( 1/x , -n);
        if(n%2==0)
        {
             return calc( x*x , n/2 ); 
            
        }
            
        else {
            
                return x * calc( x , n-1 );
        }
    }
}

