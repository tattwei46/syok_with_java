package syok_with_java;

public class ConstructorExample {
	int id;
	String name;
	
	ConstructorExample(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void printInfo() {
		System.out.println("Id is " + id + " and name is " + name);
	}
	
	public static void main(String[] args) {
		ConstructorExample example1 = new ConstructorExample(1, "example1");
		ConstructorExample example2 = new ConstructorExample(2, "example2");
		
		example1.printInfo();
		example2.printInfo();
	}
	
}
