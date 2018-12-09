package syok_with_java;

abstract class AbstractClass {
	// An abstract class with keyword abstract can have both abstract method and concrete method
	abstract void abstractMethod();
	
	void concreteMethod() {
		System.out.println("Concrete Method");
	}
}
public class AbstractExample extends AbstractClass{

	@Override
	void abstractMethod() {
		System.out.println("Implementing abstract method ");
	}
	
	public static void main(String[] args) {
		AbstractExample example = new AbstractExample();
		example.abstractMethod();
		example.concreteMethod();
	}

}
