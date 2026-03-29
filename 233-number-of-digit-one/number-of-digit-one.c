int countDigitOne(int n) 
{
    long long count=0;
    for (long long i=1;i<=n;i*=10) {
        long long divider=i*10;
        
        count+=(n/divider)*i;
        
        long long remainder=n%divider;
        if (remainder>=2*i) 
        {
            count+=i;
        } else if(remainder>=i) {
            count+=remainder-i+1;
        }
    }
    return (int)count;
}