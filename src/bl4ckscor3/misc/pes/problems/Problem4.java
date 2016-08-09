package bl4ckscor3.misc.pes.problems;

import java.util.Arrays;

public class Problem4 implements IProblem
{
	@Override
	public void exe()
	{
		int result = 0;
		
		//loop through all 3-digit numbers
		for(int i = 100; i < 1000; i++)
		{
			jLoop:
			for(int j = 100; j < 1000; j++)
			{
				//calculate the number and convert it to an array
				String s = "" + (i * j);
				char[] c = s.toCharArray();
				char[] reversed = new char[c.length];
				int k = 0;
				
				//reverse the array
				for(int l = c.length - 1; l >= 0; l--)
				{
					reversed[k] = c[l];
					k++;
				}
				
				//if the arrays are not equal i * j is not a palindrome product so it can continue with the next number pair
				if(!Arrays.equals(c, reversed))
					continue jLoop;
				
				//if the palindrome product is greater than the last one found, it's set as the result
				if(Integer.parseInt(s) > result)
					result = Integer.parseInt(s);
			}
		}
		
		System.out.println("The largest palindrome product of two 3-digit numbers is " + result);
	}

	@Override
	public String name()
	{
		return "Largest palindrome product";
	}
}
