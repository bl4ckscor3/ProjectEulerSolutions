package bl4ckscor3.misc.pes.problems;

import java.math.BigInteger;

public class Problem16 implements IProblem
{
	@Override
	public void exe()
	{
		BigInteger two = new BigInteger("2");
		BigInteger number = BigInteger.ONE;
		char[] cA;
		int result = 0;

		//calculate 2^1000 with BigInteger, because int's highest number is 2^31-1
		for(int i = 0; i < 1000; i++)
		{
			number = number.multiply(two);
		}

		//convert to char array so every digit is accessible
		cA = number.toString().toCharArray();

		//add the digits together
		for(char c : cA)
		{
			result += Integer.parseInt("" + c);
		}

		System.out.println("The sum of all digits of 2^1000 is " + result);
	}

	@Override
	public String name()
	{
		return "Power digit sum";
	}
}
