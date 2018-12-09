package syok_with_java;

public class StaticExample {

	static int num = 1;
	static String myString;	
	
	// Non static method calling static method
	void func() {
		display();
	}
	
	// Static method
	static void display(){
		System.out.println("Display from static method");
	}
	
	public static void main(String[] args) {
		
		// Demo access static variable directly without using method
		System.out.println(num);
		
		StaticExample example1 = new StaticExample();
		StaticExample example2 = new StaticExample();
		
		
		// Demo static variables are shared among all instances of class
		example1.myString = "ABC";
		System.out.println(example1.myString);
		System.out.println(example2.myString);
		
		example1.myString = "DEF";
		System.out.println(example1.myString);
		System.out.println(example2.myString);
		
		// Demo static method can accessed directly in static and non-static method
		example1.func();
		
		display();
		
	}	
}

