package bl4ckscor3.misc.pes.problems;

public class Problem9 implements IProblem
{
	@Override
	public void exe()
	{
		int find = 1000;

		//a < b < c so that a²+b²=c², hence splitting the range in three parts
		for(int a = 1; a < find / 3; a++)
		{
			//the middle third is just the half of the remaining 2 thirds
			for(int b = (a + 1); b < find / 2; b++)
			{
				int c = find - a - b; //the beginning of the third third

				//just check whether the assumption is true and return, if so
				if(a * a + b * b == c * c)
				{
					System.out.println("The product of the Pythagorean triplet of a + b + c = 1000 is " + (a * b * c));
					return;
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
