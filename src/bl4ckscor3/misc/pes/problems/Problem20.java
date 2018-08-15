package bl4ckscor3.misc.pes.problems;

import java.math.BigInteger;

public class Problem20 implements IProblem
{
	@Override
	public void exe()
	{
		char[] digits = factorial(BigInteger.valueOf(100)).toString().toCharArray(); //get all the digits of 100!
		int sum = 0;

		for(char c : digits) //sum up the digits
		{
			sum += Integer.parseInt("" + c);
		}

		System.out.println("The sum of the digits from 100! is " + sum);
	}

	private BigInteger factorial(BigInteger n)
	{
		if(n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE))
			return BigInteger.ONE;
		return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

	@Override
	public String name()
	{
		return "Factorial digit sum";
	}
}
