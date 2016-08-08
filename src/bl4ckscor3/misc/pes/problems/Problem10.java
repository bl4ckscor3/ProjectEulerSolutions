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

	    for(int i = 4; i <= n; i+=2)
	    {
	    	composites[i] = true;
	    }
	    
	    for(int i = 3; i < limit; i += 2)
	    {
	        if(!composites[i])
	        {
	            for(int j = i * i; j <= n; j += i)
	            {
	            	composites[j] = true;
	            }
	        }
	    }
	    
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
