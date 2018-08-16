package bl4ckscor3.misc.pes;

import java.util.ArrayList;
import java.util.Scanner;

import bl4ckscor3.misc.pes.problems.IProblem;
import bl4ckscor3.misc.pes.problems.Problem1;
import bl4ckscor3.misc.pes.problems.Problem10;
import bl4ckscor3.misc.pes.problems.Problem11;
import bl4ckscor3.misc.pes.problems.Problem12;
import bl4ckscor3.misc.pes.problems.Problem13;
import bl4ckscor3.misc.pes.problems.Problem14;
import bl4ckscor3.misc.pes.problems.Problem15;
import bl4ckscor3.misc.pes.problems.Problem16;
import bl4ckscor3.misc.pes.problems.Problem17;
import bl4ckscor3.misc.pes.problems.Problem19;
import bl4ckscor3.misc.pes.problems.Problem2;
import bl4ckscor3.misc.pes.problems.Problem20;
import bl4ckscor3.misc.pes.problems.Problem3;
import bl4ckscor3.misc.pes.problems.Problem4;
import bl4ckscor3.misc.pes.problems.Problem5;
import bl4ckscor3.misc.pes.problems.Problem6;
import bl4ckscor3.misc.pes.problems.Problem7;
import bl4ckscor3.misc.pes.problems.Problem8;
import bl4ckscor3.misc.pes.problems.Problem9;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<IProblem> problems = new ArrayList<IProblem>();
		Scanner s = new Scanner(System.in);
		int n;

		addAll(problems);

		while(true) //while the user wants to execute a problem
		{
			System.out.print("Enter the numer of the problem you want to run (-1 to exit): ");
			n = s.nextInt();

			//the user wants to exit
			if(n == -1)
			{
				s.close();
				break;
			}

			forLoop: for(IProblem p : problems) //looping through the problems
			{
				if(p.getClass().getName().split("\\.")[4].endsWith("" + n)) //check if the actual class name's ending matches the entered number
				{
					long start;
					long end;

					System.out.println("Running problem #" + n + " - \"" + p.name() + "\"");
					System.out.println("");
					start = System.currentTimeMillis();
					p.exe(); //executing the problem
					end = System.currentTimeMillis();
					System.out.println("");
					System.out.println("Execution time: " + convertTime(start, end));
					break forLoop;
				}
			}
		}
	}

	/**
	 * Adds all problems to the list
	 * @param problems The list to add the problems to
	 */
	private static void addAll(ArrayList<IProblem> problems)
	{
		problems.add(new Problem1());
		problems.add(new Problem2());
		problems.add(new Problem3());
		problems.add(new Problem4());
		problems.add(new Problem5());
		problems.add(new Problem6());
		problems.add(new Problem7());
		problems.add(new Problem8());
		problems.add(new Problem9());
		problems.add(new Problem10());
		problems.add(new Problem11());
		problems.add(new Problem12());
		problems.add(new Problem13());
		problems.add(new Problem14());
		problems.add(new Problem15());
		problems.add(new Problem16());
		problems.add(new Problem17());
		problems.add(new Problem19());
		problems.add(new Problem20());
	}

	/**
	 * Converts milliseconds to seconds and minutes, if needed
	 * @param start The start of the problem in ms
	 * @param end The end of the problem in ms
	 * @return The resulting String
	 */
	private static String convertTime(long start, long end)
	{
		long elapsedTime = end - start;
		int minutes = 0;
		int seconds = 0;

		if(elapsedTime > 60000)
		{
			while(elapsedTime > 60000)
			{
				elapsedTime -= 60000;
				minutes++;
			}
		}

		if(elapsedTime > 1000)
		{
			while(elapsedTime > 1000)
			{
				elapsedTime -= 1000;
				seconds++;
			}
		}

		return (minutes != 0 ? minutes + "min " : "") + (seconds != 0 ? seconds + "s " : "") + elapsedTime + "ms";
	}
}
