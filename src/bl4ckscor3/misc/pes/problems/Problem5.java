package bl4ckscor3.misc.pes.problems;

public class Problem5 implements IProblem
{
	@Override
	public void exe()
	{
		outer:
		for(int i = 1; i < Integer.MAX_VALUE; i++)
		{
			for(int k = 1; k <= 20; k++)
			{
				if(i % k != 0)
					break;
				
				if(k == 20)
				{
					System.out.println("The smallest number that is evenly divisible by all numbers from 1 to 20 is " + i);
					break outer;
				}
			}
		}
	}

	@Override
	public String name()
	{
		return "Smallest multiple";
	}
}
