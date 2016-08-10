package bl4ckscor3.misc.pes.problems;

public class Problem14 implements IProblem
{
	@Override
	public void exe()
	{
		int longest = 1;
		int current = 1;
		int start = 0;
		long n = 0;
		
		for(int i = 2; i < 1000000; i++)
		{
			n = i;
			
			while(n != 1)
			{
				if(n % 2 == 0)
					n /= 2;
				else
					n = (3 * n) + 1;

				current++;
			}
			
			if(++current > longest)
			{
				longest = current;
				start = i;
			}
			
			n = 0;
			current = 1;
		}
		
		System.out.println("The longest Collatz sequence below 1 million starts with " + start);
	}

	@Override
	public String name()
	{
		return "Longest Collatz sequence";
	}
}
