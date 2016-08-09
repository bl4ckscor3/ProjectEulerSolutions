package bl4ckscor3.misc.pes.problems;

public class Problem12 implements IProblem
{
	@Override
	public void exe()
	{
		int tri = 0;
		int div;
		int sqrt;
		
		//iterate through all integer values to generate the triangular numbers
		for(int i = 0; i < Integer.MAX_VALUE; i++)
		{
			tri += i;
			div = 1; //already counting the number itself
			sqrt = (int)Math.sqrt(tri);
			
			//find divisors
			for(int j = 1; j <= sqrt; j++)
			{
				//if evenly divisible, increment divisor count
				if(tri % j == 0)
					div += 2;
			}

			//correction if the number was a perfect square
			if(sqrt * sqrt == tri)
				div--;
			
			if(div > 500)
			{
				System.out.println("The first triangular number with more than 500 divisors is " + tri);
				break;
			}
		}
	}

	@Override
	public String name()
	{
		return "Highly divisible triangular number";
	}
}
