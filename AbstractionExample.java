package codes;
abstract class hello{
	public abstract void exampleOfAbstraction();
	public void greetings() {
		System.out.println("Hello, Ruban!");
	}
	
}
public class AbstractionExample extends hello {
	public void exampleOfAbstraction() {
		System.out.println("Implementing method in abstract class");
	}
	public static void main(String[] args) {
		AbstractionExample obj = new AbstractionExample();
		obj.exampleOfAbstraction();
		obj.greetings();
	}
}
