package syok_with_java;

public class ModiferExample {

	public int publicInt = 8;
	protected int protectedInt = 9;
	private int privateInt = 10;
	
	protected void printProtectedMethod() {
		System.out.println("printProtectedMethod");
	}
	
	public void printPublicMethod() {
		System.out.println("printPublicMethod");
	}
	
	private void printPrivateMethod() {
		System.out.println("printPrivateMethod");
	}
	
	// Use public method to access private variables
	public int getPrivateInt() {
		return privateInt;
	}
}
