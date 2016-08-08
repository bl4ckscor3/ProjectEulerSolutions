package bl4ckscor3.misc.pes;

import java.util.ArrayList;
import java.util.Scanner;

import bl4ckscor3.misc.pes.problems.IProblem;
import bl4ckscor3.misc.pes.problems.Problem1;
import bl4ckscor3.misc.pes.problems.Problem2;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<IProblem> problems = new ArrayList<IProblem>();
		Scanner s = new Scanner(System.in);
		int n;
		boolean run = true;
		
		addAll(problems);
		
		while(run)
		{
			boolean fault = true;
			
			System.out.print("Enter the numer of the problem you want to run: ");
			n = s.nextInt();
			
			for(IProblem p : problems)
			{
				if(p.getClass().getName().split("\\.")[4].endsWith("" + n))
				{
					String yn;
					
					System.out.println("Running problem #" + n + " - \"" + p.name() + "\"");
					System.out.println("");
					p.exe();
					System.out.println("");
					System.out.print("Do you want to run another problem? Y/N: ");
					yn = s.next();
					
					if(yn.equalsIgnoreCase("N"))
					{
						run = false;
						fault = false;
						System.out.println("Closing program!");
					}
					else if(yn.equalsIgnoreCase("Y"))
						fault = false;
					else
					{
						System.out.println("Invalid option entered, stopping program.");
						run = false;
						fault = false;
					}
				}
			}
			
			if(fault)
				System.out.println("Invalid number entered.");
		}
		
		s.close();
	}
	
	private static void addAll(ArrayList<IProblem> problems)
	{
		problems.add(new Problem1());
	}
}
