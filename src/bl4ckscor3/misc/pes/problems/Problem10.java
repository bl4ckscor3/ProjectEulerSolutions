package bl4ckscor3.misc.pes.problems;

public class Problem10 implements IProblem
{
	@Override
	public void exe()
	{
		int n = 2000000;
	    long sum = 0;
	    int limit = (int)Math.sqrt(n) + 1;
	    boolean[] composites = new boolean[n + 1];  //false = prime
	    
	    composites[0] = true;
	    composites[1] = true;
	    composites[2] = false;

	    //set all even numbers except 2 to non-prime
	    for(int i = 4; i <= n; i+=2)
	    {
	    	composites[i] = true;
	    }
	    
	    //loop through all odd numbers
	    for(int i = 3; i < limit; i += 2)
	    {
	    	//if current number is a prime
	        if(!composites[i])
	        {
	        	//mark all numbers bigger or equal to the square of the current prime as composite
	            for(int j = i * i; j <= n; j += i)
	            {
	            	composites[j] = true;
	            }
	        }
	    }
	    
	    //add all primes together
	    for(int i = 0; i < composites.length; i++)
	    {
	        if(!composites[i])
	        	sum += i;
	    }

		System.out.println("The sum of all primes below two million is " + sum);
	}

	@Override
	public String name()
	{
		return "Summation of primes";
	}
}
