package syok_with_java;

public class TestModifierExample {

	public static void main(String[] args) {
		ModiferExample modifierExample = new ModiferExample();
		
		// Print protected, protected methods are accessible in all sub-classes within same package
		modifierExample.printProtectedMethod();	
		
		// Print public, public methods are accessible to the world
		modifierExample.printPublicMethod();	
		
		// Error. Private method only accessible in class ModifierExample 
		//modifierExample.printPrivateMethod();	
		
		System.out.println("Access protected int directly " + modifierExample.protectedInt);
		
		System.out.println("Access protected int directly " + modifierExample.publicInt);
				
		System.out.println("Access private int using public method " + modifierExample.getPrivateInt());
		
		}
}
