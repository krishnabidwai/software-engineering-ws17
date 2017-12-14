public class MetersToFeet extends LengthConverter{
	
	// initialization
	public MetersToFeet() {
		
	inputStr = "Meters";
	  outputStr = "Feet";
	  Conversionfactor = 3.28;
}

	// Decorator
	public MetersToFeet(UnitConverter base) {
		
		//throw an exception when input don't match for a decorator
		try {
			if(base.outputStr != "Meters")
				throw new UnmatchedMetricsException("Incoming value should be Meters!");
		}
		catch(UnmatchedMetricsException e) {
			System.out.println(e);
			System.exit(1);
		}
		
		// extension
		inputStr = base.inputStr;
		outputStr = "Rupees";
		Conversionfactor = base.Conversionfactor * 3.28;
	}
  
	public static MetersToFeet create() {
		return new MetersToFeet();
	}
	
};
