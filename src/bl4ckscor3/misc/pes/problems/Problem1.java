package bl4ckscor3.misc.pes.problems;

public class Problem1 implements IProblem
{
	@Override
	public void exe()
	{
		int result = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
				result += i;
		}
		
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 is " + result);
	}

	@Override
	public String name()
	{
		return "Multiples of 3 and 5";
	}
}
