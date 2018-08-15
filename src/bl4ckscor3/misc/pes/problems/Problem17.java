package bl4ckscor3.misc.pes.problems;

public class Problem17 implements IProblem
{
	private String[] words = {"and", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred", "thousand"};

	@Override
	public void exe()
	{
		int amount = 0;

		for(int i = 1; i <= 1000; i++)
		{
			amount += getLetterCount(i);
		}

		System.out.println("The amount of letters of every number from 1 to 1000 (inclusive) written out in words is " + amount);
	}

	private int getLetterCount(int i)
	{
		int amount = 0;

		if(i < 20)
			amount += words[i].length(); //the first 19 indices (starting by 1, because 0 is "and") are the numbers just like they are here
		else if(i % 10 == 0 && i / 100 < 1)
			amount += words[i / 10 - 2 + 20].length(); //indices 21 to 27 are all the evenly divisible by 10 numbers (20, 30, ..., 100)
		else if(i < 100)
		{
			amount += getLetterCount(Math.floorDiv(i, 10) * 10); //get the digit at the 2nd to last place and multiply by 10 to get the actual number
			amount += getLetterCount(i % 10); //get the last digit
		}
		else if(i < 1000)
		{
			amount += words[Math.floorDiv(i, 100)].length() + words[words.length - 2].length(); //x hundred

			if(i % 100 != 0)
			{
				amount += words[0].length(); //and
				amount += getLetterCount(i % 100); //get the digit at the 3rd to last place and multiply by 100 to get the actual number
			}
		}
		else //one + thousand
			amount += words[1].length() + words[words.length - 1].length();

		return amount;
	}

	@Override
	public String name()
	{
		return "Number letter counts";
	}
}
