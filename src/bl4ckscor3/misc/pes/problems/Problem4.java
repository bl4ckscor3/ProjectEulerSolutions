package bl4ckscor3.misc.pes.problems;

import java.util.Arrays;

public class Problem4 implements IProblem
{
	@Override
	public void exe()
	{
		int result = 0;
		
		for(int i = 100; i < 1000; i++)
		{
			jLoop:
			for(int j = 100; j < 1000; j++)
			{
				String s = "" + (i * j);
				char[] c = s.toCharArray();
				char[] reversed = new char[c.length];
				int k = 0;
				
				for(int l = c.length - 1; l >= 0; l--)
				{
					reversed[k] = c[l];
					k++;
				}
				
				if(!Arrays.equals(c, reversed))
					continue jLoop;
				
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
