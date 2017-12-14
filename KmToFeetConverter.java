
public class KmToFeetConverter extends LengthConverter{
	
	// initialization
	public KmToFeetConverter() {
		
	  inputStr = "Km";
	  outputStr = "Feet";
	  Conversionfactor = 3280;
	}

	// Decorator
	public KmToFeetConverter(UnitConverter base) {
		
		//throw an exception when input don't match for a decorator
		try {
			if(base.outputStr != "Km")
				throw new UnmatchedMetricsException("Incoming value should be Km!");
		}
		catch(UnmatchedMetricsException e) {
			System.out.println(e);
			System.exit(1);
		}
		
		// extension
		inputStr = base.inputStr;
		outputStr = "Feet";
		Conversionfactor = base.Conversionfactor * 3280;
	}
  
	public static KmToFeetConverter create() {
		return new KmToFeetConverter();
	}
	
};

