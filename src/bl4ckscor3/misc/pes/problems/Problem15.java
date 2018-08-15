package bl4ckscor3.misc.pes.problems;

public class Problem15 implements IProblem
{
	private long[][] nodes = new long[21][21]; //21 nodes, because there are 21 crossings and 20 squares

	@Override
	public void exe()
	{
		//top left crossing takes 0 paths to get to
		nodes[0][0] = 0;

		for(int i = 1; i < 20 + 1; i++) //every edge case along the top and bottom row only has one path to go through
		{
			nodes[i][0] = 1;
			nodes[0][i] = 1;
		}

		//pascal's triangle
		for(int x = 1; x < nodes.length; x++)
		{
			for(int y = 1; y < nodes[x].length; y++)
			{
				nodes[x][y] = nodes[x - 1][y] + nodes[x][y - 1];
			}
		}

		System.out.println("The amount of paths from top left to bottom right (and only being able to move to the right and down) through a 20x20 grid is " + nodes[20][20]);
	}

	@Override
	public String name()
	{
		return "Lattice paths";
	}
}
