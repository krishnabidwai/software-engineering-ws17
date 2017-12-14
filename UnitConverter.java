public abstract class UnitConverter
{
	public double in;
	public double out;
	public String inputStr;
	public String outputStr;
	public double Conversionfactor;

  public UnitConverter() { }
  public abstract double convert(double inValue);
  public String toString() {
	  return inputStr + " to " + outputStr + " Converter";
  }
  public void print() {
	  System.out.println(toString() + ": " + in + " -> " + out);
  }
  public static UnitConverter create() {
	  return null;
  }
}

class UnmatchedMetricsException extends Exception {
	  String err_msg;
	  
	  UnmatchedMetricsException(String exp) {
		  super(exp);
	  }
	  
	  public String toSring() {
		  return err_msg;
	  }
}
