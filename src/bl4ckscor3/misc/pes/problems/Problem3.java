package bl4ckscor3.misc.pes.problems;

public class Problem3 implements IProblem
{
	@Override
	public void exe()
	{
		//constant
		long l = 600851475143L;
		long n = 0L;

		//loop through all numbers until l
		for(int i = 2; i <= l; i++)
		{
			//while l is evenly divisible by i
			while(l % i == 0)
			{
				//prime factorization
				n = i;
				l /= i;
			}
		}

		System.out.println("The largest prime factor of 600851475143 is " + n);
	}

	@Override
	public String name()
	{
		return "Largest prime factor";
	}
}
