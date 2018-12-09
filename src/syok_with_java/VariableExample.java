package syok_with_java;

public class VariableExample {

	public static void main(String[] args) {
		VariableExample variableExample = new VariableExample();
		variableExample.printByteArray();		
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
