package bl4ckscor3.misc.pes.problems;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

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

	/**
	 * @return A list containing all lines of the file for this problem ("problemXX.txt", where XX is the problem number).
	 * 			May return an empty list, if an exception was thrown during the read process
	 */
	public default List<String> readFromProblemFile()
	{
		try
		{
			return FileUtils.readLines(new File("resources" + File.separator + getClass().getSimpleName().toLowerCase() + ".txt"), Charset.defaultCharset());
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return new ArrayList<String>();
		}
	}
}
