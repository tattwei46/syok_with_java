package syok_with_java;

public class ControlStatementExample {
	
	public static void main(String[] args) {
			
		int x = 1;
		int y = 3;
		
		ControlStatementExample example = new ControlStatementExample();
		example.demoIfElse(x,y);
		example.demoSwitchCase(x);
		example.demoForLoop(x,y);
	}
	
	private void demoSwitchCase(int x) {
		switch(x) {
		case 1:
			System.out.println("Case 1: Value is " + x);
			break;
		case 2:
			System.out.println("Case 2: Value is " + x);
			break;
		case 3:
			System.out.println("Case 3: Value is " + x);
			break;
		default:
			System.out.println("default case: Value is " + x);
			break;
		}
	}
	
	private void demoIfElse(int x, int y) {
		if (x < y) {
			System.out.println("x < y");
		} else if (x > y) {
			System.out.println("x > y");
		} else {
			System.out.println("x = y");
		}
				
	}
	
	private void demoForLoop(int x, int y) {
		for(int i=0;i < y; i++) {
			System.out.println("Value is " + x);
		}
	}
}
