package syok_with_java;

public class VariableExample {
	
	public static String staticString = "this is a static string";

	public static void main(String[] args) {
		VariableExample variableExample = new VariableExample();
		
		variableExample.demoStaticVariable();
		
		variableExample.printByteArray();		
	}
	
	private void demoStaticVariable() {
		VariableExample obj = new VariableExample();
		VariableExample obj1 = new VariableExample();
		VariableExample obj2 = new VariableExample();
		
		// All three will print the same string
		System.out.println(obj.staticString);
		System.out.println(obj1.staticString);
		System.out.println(obj2.staticString);
		
		// Change the static string from one class
		obj1.staticString = "Changed a static string";
		
		// All three will print the same string
		System.out.println(obj.staticString);
		System.out.println(obj1.staticString);
		System.out.println(obj2.staticString);
	}
	
	// Print byte array
	private void printByteArray() {
		int len = 3;
		byte data[] = new byte[len];
		data[0] = 0x00;
		data[1] = 0x0B;
		data[2] = 0x0C;

		
		for (int i=0;i < data.length; i++) {
			System.out.println(String.format("%02X ", data[i]));
		}
	}

}
