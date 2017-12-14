public class InversionDecorator extends UnitConverter
{	
	public InversionDecorator() {}
	
	public InversionDecorator(UnitConverter base) {
		
		// throw exception when temperature converter is passed as an argument
		try {
			if(base.getClass().getSuperclass() == TemperatureConverter.class)	
				throw new NonInversibleException("Temperature Converters cannot be inversed!");
			}
		catch (NonInversibleException e) {
				System.out.println(e);
				System.exit(1);
				}
		
		// inversion
		inputStr = base.outputStr;
		outputStr = base.inputStr;
		Conversionfactor = Math.pow(base.Conversionfactor, -1);	// new factor = old factor ^ -1
	}
	
	public double convert(double inValue) {
		in = inValue;
		out = in * Conversionfactor;
		return out;
	}
	
}

class NonInversibleException extends Exception {
	  String err_msg;
	  
	  NonInversibleException(String exp) {
		  super(exp);
	  }
	  
	  public String toSring() {
		  return err_msg;
	  }
}