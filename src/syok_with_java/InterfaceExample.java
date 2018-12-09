package syok_with_java;

interface MyInterface3Parent {
	public void myInterface3Method1();
}

interface MyInterface3Child extends MyInterface3Parent{
	public void myInterface3Method2();
}

interface MyInterface2 {
	public void myInterface2Method1();
}

interface MyInterface1 {
	public void myInterface1Method1();
	public void myInterface1Method2();
}
public class InterfaceExample implements MyInterface1, MyInterface2, MyInterface3Child{

	public static void main(String[] args) {
		InterfaceExample example1 = new InterfaceExample();
		example1.myInterface1Method1();
		example1.myInterface1Method2();
		example1.myInterface2Method1();
		example1.myInterface3Method1();
		example1.myInterface3Method2();

	}

	@Override
	public void myInterface1Method1() {
		System.out.println("Implementing interface1 method1");
		
	}

	@Override
	public void myInterface1Method2() {
		System.out.println("Implementing interface1 method1");	
	}

	@Override
	public void myInterface2Method1() {
		System.out.println("Implementing interface2 method1");
		
	}

	@Override
	public void myInterface3Method1() {
		System.out.println("Implementing interface3parent method1");
		
	}

	@Override
	public void myInterface3Method2() {
		System.out.println("Implementing interface3child method1");
		
	}

}
