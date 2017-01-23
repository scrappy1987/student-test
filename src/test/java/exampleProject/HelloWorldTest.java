package exampleProject;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest
{
	@Test
	public void testThatStringEqualsHelloWorld()
	{
		HelloWorld helloWorld = new HelloWorld("helloworld");
		Assert.assertEquals(helloWorld.getHelloWorld(), "helloworld");
	}
	
	@Test
	public void TestSayHelloWorld()
	{
		HelloWorld helloWorld = new HelloWorld("helloworld");
		String s = helloWorld.sayHelloWorld();
		assertEquals(s,"helloworld");
	}
	
	@Test
	public void TestSetHelloWorld()
	{
		HelloWorld helloWorld = new HelloWorld("helloworld");
		String s = helloWorld.sayHelloWorld();
		assertEquals(s,"helloworld");
	}

	@Test
	public void testThatStringDoesNotEqualHelloWorld()
	{
		HelloWorld helloWorld = new HelloWorld("nothelloWorld");
		Assert.assertEquals(helloWorld.getHelloWorld(), "nothelloWorld");

	}

}
