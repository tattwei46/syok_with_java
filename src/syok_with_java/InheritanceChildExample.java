package syok_with_java;

public class InheritanceChildExample extends InheritanceParentExample{

	InheritanceChildExample(){
		System.out.println("Constructor of Child");
	}
	public static void main(String[] args) {
		InheritanceChildExample child = new InheritanceChildExample();
		System.out.println(child.publicString);
		System.out.println(child.protectedString);

	}

}
