public abstract class LengthConverter extends UnitConverter{ 
  
 public LengthConverter() { }
  
  public double convert(double inValue) {
		in = inValue;
		out = in * Conversionfactor;
		return out;
	}
	public static LengthConverter create() {
	  return null;
	}
 }