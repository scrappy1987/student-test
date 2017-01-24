package exampleProject;

public class HelloWorld {

	private String helloWorld;

	public HelloWorld(String aHelloWorld) {
		this.helloWorld = aHelloWorld;
	}

	public String sayHelloWorld() {
		String message = "nothelloWorld";
		if (!this.getHelloWorld().equals(null)) {
			return this.getHelloWorld();
		}
		return message;
	}

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}
}
