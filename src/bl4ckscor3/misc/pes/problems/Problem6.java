package bl4ckscor3.misc.pes.problems;

public class Problem6 implements IProblem
{
	@Override
	public void exe()
	{
		int sosquare = 0;
		int sosum = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			sosquare += Math.pow(i, 2);
		}
		
		for(int i = 1; i <= 100; i++)
		{
			sosum += i;
		}
		
		sosum = (int)Math.pow(sosum, 2);
		System.out.println("The difference between the sum of the squares and the square of the sum of the first one hundred natural numbers is " + (sosum - sosquare));
	}

	@Override
	public String name()
	{
		return "Sum square difference";
	}
}
