import java.util.*;

class FormatDemo
{
	public static void main(String args[])
	{
		Formatter fmt = new Formatter();
		fmt.format("Formatting %s is easy %d %f", "with Java ", 10, 98.6);
		System.out.println(fmt);
		fmt.close();
	}
}

// Formatting with Java  is easy 10 98.600000