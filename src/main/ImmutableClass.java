package main;

public final class ImmutableClass {
	private final int intValue;
    private final String stringValue;
    private  double doubleValue;
//  public doubleValue -- members should not be public and should be final
    
    public ImmutableClass(int intValue, String stringValue, double doubleValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
        this.doubleValue = doubleValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }
//    public double setDoubleValue(Double d) {
//        this.doubleValue = d;
//        return this.doubleValue
//    }
// Same Idea applies for setters. we do not want to modify this data.
    @Override 
    public String toString() {
    	return "INT: " + this.getIntValue() + "\nString: " + this.getStringValue() + "\nDouble: " + this.getDoubleValue();
    }
}
