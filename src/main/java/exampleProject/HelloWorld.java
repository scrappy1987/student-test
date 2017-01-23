package exampleProject;

public class HelloWorld
{
	private String helloWorld;

	public HelloWorld(String aHelloWorld)
	{
		this.helloWorld = aHelloWorld;
	}

	public String sayHelloWorld()
	{
		return this.getHelloWorld();
	}

	public String getHelloWorld()
	{
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld)
	{
		this.helloWorld = helloWorld;
	}
}
