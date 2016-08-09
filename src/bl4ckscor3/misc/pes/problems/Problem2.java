package bl4ckscor3.misc.pes.problems;

public class Problem2 implements IProblem
{
	@Override
	public void exe()
	{
		int i = 0;
		int result = 0;
		boolean run = true;
		
		//run it as long as the fibonacci number is below four million
		while(run)
		{
			int fib = fib(i++);

			if(fib > 4000000)
			{
				run = false;
				continue;
			}
			
			//if the fibonacci number is even, add it to the result
			if(fib % 2 == 0)
				result += fib;
		}
		
		System.out.println("The sum of all even fibonacci numbers up until 4000000 is " + result);
	}

	/**
	 * Calculates the nth fibonacc number
	 * @param n The fibonacci number index to calculate
	 * @return The nth fibonacci number
	 */
	private int fib(int n)
	{
		if(n <= 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}
	
	@Override
	public String name()
	{
		return "Even Fibonacci numbers";
	}
}
