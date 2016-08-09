package bl4ckscor3.misc.pes.problems;

//i have actually no clue anymore how this works
public class Problem9 implements IProblem
{
	@Override
	public void exe()
	{
		int find = 1000;
		
		outer:
		for(int a = 1; a < find / 3; a++)
		{
			for(int b = (a + 1); b < find / 2; b++)
			{
				int c = find - a - b;
				
				if(a * a + b * b == c * c)
				{
					System.out.println("The product of the Pythagorean triplet of a + b + c = 1000 is " + (a * b * c));
					break outer;
				}
			}
		}
	}

	@Override
	public String name()
	{
		return "Special Pythagorean triplet";
	}
}
