package bl4ckscor3.misc.pes.problems;

import java.util.ArrayList;

public class Problem7 implements IProblem
{
	@Override
	public void exe()
	{
		int find = 10001;
		ArrayList<Integer> primes = new ArrayList<Integer>();

		//add those primes
		primes.add(2);
		primes.add(3);

		//while there are less primes than the prime we want to find
		for(int currentNumber = 4; primes.size() < find; currentNumber++)
		{
			//find primes
			if(currentNumber % 2 != 0 && currentNumber % 3 != 0)
			{
				int temp = 4;

				while(temp * temp <= currentNumber)
				{
					if(currentNumber % temp == 0)
						break;

					temp++;
				}

				//it's a prime
				if(temp * temp > currentNumber)
					primes.add(currentNumber);
			}
		}

		System.out.println("The 10001st prime is " + primes.get(find - 1));
	}

	@Override
	public String name()
	{
		return "10001st prime";
	}
}
