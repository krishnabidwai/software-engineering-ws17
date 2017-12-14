public class DollarToRupeesConverter extends CurrencyConverter
{
	// initialization
	public DollarToRupeesConverter() {
	  inputStr = "Dollar";
	  outputStr = "Rupees";
	  Conversionfactor = 68;
	}
	
	// Decorator
	public DollarToRupeesConverter(UnitConverter base) {
		
		//throw an exception when input don't match for a decorator
		try {
			if(base.outputStr != "Dollar")
				throw new UnmatchedMetricsException("Incoming value should be Dollar!");
		}
		catch(UnmatchedMetricsException e) {
			System.out.println(e);
			System.exit(1);
		}
		
		// extension
		inputStr = base.inputStr;
		outputStr = "Rupees";
		Conversionfactor = base.Conversionfactor * 68;
	}
  
	public static DollarToRupeesConverter create() {
		return new DollarToRupeesConverter();
	}
	
};