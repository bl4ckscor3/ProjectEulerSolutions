package bl4ckscor3.misc.pes.problems;

public class Problem5 implements IProblem
{
	@Override
	public void exe()
	{
		//loop through all numbers because it's not known what number is the smallest
		outer:
		for(int i = 1; i < Integer.MAX_VALUE; i++)
		{
			//loop through 1 to 20
			for(int k = 1; k <= 20; k++)
			{
				//if i is not evenly divisible by k, it's not meeting the criteria and it continues with i + 1
				if(i % k != 0)
					break;
				
				//i is evenly divisible by all numbers from 1 to 20 and the algorithm can be stopped
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
