package test;

import java.util.*;

public class TestSecret
{
    Secret secret = null;
    
    public TestSecret(Secret secret)
    {
        this.secret = secret;
    }
    
    public boolean test(Integer n)
    {
        boolean isAdditivePrime = true;
        // Find all primes up to N
        ArrayList<Integer> primes = allPrimes(n);
        for(int x = 0; x < primes.size()-1; x++){
            for(int y = x+1; y < primes.size(); y++){
                // For each pair of primes, see if secret(x) + secret(y) == secret(x+y)
                Integer both = secret.calc(primes.get(x) + primes.get(y));
                Integer distribute = secret.calc(primes.get(x)) + secret.calc(primes.get(y));
                isAdditivePrime = both.equals(distribute);
                if(!isAdditivePrime){
//                    System.out.println(primes.get(x) + " " + primes.get(y) + " " + both + " " + distribute);
                    break;
                }
            }
            if(!isAdditivePrime){
                break;
            }
        }
        return isAdditivePrime;
    }
    
    private ArrayList<Integer> allPrimes(Integer n)
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        while(n > 1)
        {
            boolean isPrime = true;
            for(int i = n/2; i > 1; i--){
                if( n % i == 0 )
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primes.add(n);
            }
            n--;
        }
        return primes;
    }
    
    public static void main(String args[])
    {
        Secret secret = new Secret();
        TestSecret testSecret = new TestSecret(secret);
        if(args.length > 0)
        {
            Integer n = new Integer(args[0]);
            Boolean isAdditivePrime = testSecret.test(n);
            System.out.println(isAdditivePrime);
        }
        else
        {
            System.out.println("Please supply an integer argument");
        }
    }
    
}