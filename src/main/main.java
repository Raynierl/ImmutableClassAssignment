package main;

public class main {

	public static void main(String[] args) {
		int intValue= 5;
		String stringValue = "Hello";
		double doubleValue = 2.0;
		// We can Still create instances of the class;
		ImmutableClass IC = new ImmutableClass(intValue,stringValue,doubleValue);
		System.out.println(IC);
		System.out.println("We Still are able to get its values");
//		IC.setDoubleValue(4.0);
//		System.out.println(IC);
		
	}
//class InhertiterClass extends ImmutableClass {} 
	// You cannot inherit  the class because it is Immutable. It contains the final keyword making the members of the class 
	// making it unable child classes can't be created. 
	// 
	
}
