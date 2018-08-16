package bl4ckscor3.misc.pes.problems;

public class Problem21 implements IProblem
{
	@Override
	public void exe()
	{
		int[] divisorSums = new int[10000]; //the divisor sum of the number 284 is at index 284
		int amicableSum = 0;

		//preset some trivial values
		divisorSums[0] = 0;
		divisorSums[1] = 0;
		divisorSums[2] = 1;

		for(int i = 3; i < divisorSums.length; i++)
		{
			for(int j = 1; j < i; j++)
			{
				if(i % j == 0) //if this is true, j is a divisor of i
					divisorSums[i] += j; //add j to the divisor sum of i
			}
		}

		for(int i = 0; i < divisorSums.length; i++)
		{
			//boundary check
			//a number is not amicable to itself
			//check if the number is amicable
			if(divisorSums[i] < divisorSums.length && divisorSums[i] != i && divisorSums[divisorSums[i]] == i)
				amicableSum += i; //add it to the total sum
		}

		System.out.println("The sum of all amicable numbers below 10_000 is " + amicableSum);
	}

	@Override
	public String name()
	{
		return "Amicable numbers";
	}
}
