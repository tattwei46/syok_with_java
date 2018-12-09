package syok_with_java;

class StaticPolyExample {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	} 
}

class DynamicParentPolyExample{
	
	public void display(){
		System.out.println("Parent method");
	}
}

class DynamicChildPolyExample extends DynamicParentPolyExample{
	
	public void display(){
		System.out.println("Child method");
	}
}

public class PolymorphismExample {

	public static void main(String[] args) {
		StaticPolyExample staticExample = new StaticPolyExample();
		
		// Static Polymorphism using overloading method
		System.out.println(staticExample.add(1, 2));
		System.out.println(staticExample.add(1, 2, 3));

		// Dynamic Polymorphism using overriding method
		DynamicChildPolyExample dynamicExample = new DynamicChildPolyExample();
		dynamicExample.display();
	}

}
