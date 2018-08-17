package bl4ckscor3.misc.pes.problems;

import java.util.Arrays;

public class Problem22 implements IProblem
{
	@Override
	public void exe()
	{
		String content = readFromProblemFile().get(0); //the file only contains one line
		String[] names = content.substring(1, content.length() - 1).split("\",\""); //one name per array position
		int total = 0;

		Arrays.sort(names);

		for(int i = 1; i <= names.length; i++) //loop through names
		{
			int name = 0;

			for(char c : names[i - 1].toCharArray()) //loop through characters
			{
				name += Character.getNumericValue(c) - 9; //the index of a character in the alphabet is this
			}

			total += i * name; //multiply the name position by the character score and add to the total
		}

		System.out.println("The score of all the names in \"problem22.txt\" as explained at https://projecteuler.net/problem=22 is " + total);
	}

	@Override
	public String name()
	{
		return "Names scores";
	}
}
