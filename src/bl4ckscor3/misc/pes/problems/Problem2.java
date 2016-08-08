package bl4ckscor3.misc.pes.problems;

public class Problem2 implements IProblem
{
	@Override
	public void exe()
	{
		int i = 0;
		int result = 0;
		boolean run = true;
		
		while(run)
		{
			int fib = fib(i++);

			if(fib > 4000000)
			{
				run = false;
				continue;
			}
			
			if(fib % 2 == 0)
				result += fib;
		}
		
		System.out.println("The sum of all even fibonacci numbers up until 4000000 is " + result);
	}

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
