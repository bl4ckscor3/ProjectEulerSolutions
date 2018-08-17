package bl4ckscor3.misc.pes.problems;

import java.util.List;

public class Problem18 implements IProblem
{
	private int biggestSum;
	private int sum;

	@Override
	public void exe()
	{
		List<String> lines = readFromProblemFile(); //read the triangle in the file
		int[][] triangle = new int[lines.size()][]; //set up an array with the same amount of arrays as there are lines in the file

		for(int i = 0; i < lines.size(); i++)
		{
			String[] numbers = lines.get(i).split(" "); //put each number in its own array position

			triangle[i] = new int[numbers.length]; //initialize the ith array

			//populate the ith array
			for(int j = 0; j < numbers.length; j++)
			{
				triangle[i][j] = Integer.parseInt(numbers[j]);
			}
		}

		sum = 0;
		biggestSum = 0;
		recursiveTriangle(triangle, 0, 0);
		System.out.println("The maximum sum from top to bottom of the triangle in \"problem18.txt\" is " + biggestSum);
	}

	private void recursiveTriangle(int[][] triangle, int lineIndex, int numberIndex)
	{
		sum += triangle[lineIndex][numberIndex]; //add the current number to the sum

		if(lineIndex == triangle.length -1) //bottom row
		{
			if(sum > biggestSum) //check if the current sum is bigger, and if yes, replace
				biggestSum = sum;

			sum -= triangle[lineIndex][numberIndex]; //subtract the current number from the sum, because it is not included in the next path
			return;
		}
		else
			recursiveTriangle(triangle, lineIndex + 1, numberIndex); //continue calculation in the number to the bottom left of the current one

		recursiveTriangle(triangle, lineIndex + 1, numberIndex + 1); //continue calculation in the number to the bottom right of the current one
		sum -= triangle[lineIndex][numberIndex]; //subtract the current number from the sum, because it is not included in the next path
	}

	@Override
	public String name()
	{
		return "Maximum path sum I";
	}
}
