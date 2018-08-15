package bl4ckscor3.misc.pes.problems;

public class Problem5 implements IProblem
{
	@Override
	public void exe()
	{
		//loop through all numbers because it's not known which number is the smallest
		//also the start is 20, because 1 through 19 will result in a number smaller than 1
		for(int i = 20; i < Integer.MAX_VALUE; i++)
		{
			//uneven numbers can't be evenly divided by 2, so there's no point to loop from 1 to 20
			if(i % 2 != 0)
				continue;

			//loop from 1 to 20
			inner: for(int k = 1; k <= 20; k++)
			{
				//if i is not evenly divisible by k, it's not meeting the criteria and it continues with i + 1
				if(i % k != 0)
					break inner;

				//i is evenly divisible by all numbers from 1 to 20 and the algorithm can be stopped
				if(k == 20)
				{
					System.out.println("The smallest number that is evenly divisible by all numbers from 1 to 20 is " + i);
					return;
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
