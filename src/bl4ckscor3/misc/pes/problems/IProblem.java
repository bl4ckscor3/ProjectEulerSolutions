package bl4ckscor3.misc.pes.problems;

public interface IProblem
{
	/**
	 * Executes the problem
	 */
	public void exe();
	
	/**
	 * Defines the name of the problem as written on the ProjectEuler page
	 * @return The name of the problem
	 */
	public String name();
}
