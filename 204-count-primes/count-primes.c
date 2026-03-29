int countPrimes(int n) 
{
    if (n<=2) 
    {
        return 0;
    }
    char isPrime[n];
    int count=0;

    for(int i=0;i<n;i++) 
    {
        isPrime[i]=1;
    }

    for(int i=2;i*i<n;i++) 
    {
        if(isPrime[i]==1) 
        {
            for(int j=i*i;j<n;j+=i) 
            {
                isPrime[j]=0;
            }
        }
    }

    for(int i=2;i<n;i++) 
    {
        if(isPrime[i]==1) 
        {
            count++;
        }
    }

    return count;
}
