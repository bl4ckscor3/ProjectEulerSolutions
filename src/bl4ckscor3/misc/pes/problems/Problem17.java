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
			amount += words[i].length();
		else if(i % 10 == 0 && i / 100 < 1)
			amount += words[i / 10 - 2 + 20].length();
		else if(i < 100)
		{
			amount += getLetterCount(Math.floorDiv(i, 10) * 10);
			amount += getLetterCount(i % 10);
		}
		else if(i < 1000)
		{
			amount += words[Math.floorDiv(i, 100)].length() + words[words.length - 2].length(); //x hundred

			if(i % 100 != 0)
			{
				amount += words[0].length(); //and
				amount += getLetterCount(i % 100);
			}
		}
		else //one thousand
			amount += words[1].length() + words[words.length - 1].length();

		return amount;
	}

	@Override
	public String name()
	{
		return "Number letter counts";
	}
}
