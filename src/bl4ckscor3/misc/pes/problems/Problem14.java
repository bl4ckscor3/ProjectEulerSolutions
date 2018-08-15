package bl4ckscor3.misc.pes.problems;

public class Problem14 implements IProblem
{
	@Override
	public void exe()
	{
		int longest = 0;
		int currentLength = 0;
		int start = 0;
		long n = 0;

		//loop through all numbers until 1mil
		for(int i = 2; i < 1_000_000; i++)
		{
			n = i;

			//generate the sequence
			//it is conjectured that all sequences end with 1, so this assumes exactly that
			while(n != 1)
			{
				if(n % 2 == 0) //rule 1 of the collatz conjecture: if n is even, divide n by 2
					n /= 2;
				else //rule 2 of the collatz conjecture: if n is odd, multiply it by 3 and add 1
					n = (3 * n) + 1;

				currentLength++; //increase the length of the current chain
			}

			//check the length of the current sequence with the length of the so far longest sequence and set it if it is longer
			if(++currentLength > longest)
			{
				longest = currentLength;
				start = i;
			}

			currentLength = 0; //reset for next iteration
		}

		System.out.println("The longest Collatz sequence below 1 million starts with " + start);
	}

	@Override
	public String name()
	{
		return "Longest Collatz sequence";
	}
}
