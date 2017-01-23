package exampleProject;

public class Adder
{
	private int value1;
	private int value2;

	public Adder(int val1, int val2)
	{
		this.value1 = val1;
		this.value2 = val2;
	}

	public int getTotal()
	{
		return getValue1() + getValue2();
	}

	public int getValue1()
	{
		return value1;
	}

	public int getValue2()
	{
		return value2;
	}
}
