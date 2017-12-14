public class EuroToRupeesConverter extends CurrencyConverter
{
	// initialization
	public EuroToRupeesConverter() {
	  inputStr = "Euro";
	  outputStr = "Rupees";
	  Conversionfactor = 75;
	}
	
	// Decorator: extending the functionality 
	public EuroToRupeesConverter(UnitConverter base) {

		//throw an exception when metrics don't match for a decorator
		try {
			if(base.outputStr != "Euro")
				throw new UnmatchedMetricsException("Incoming value should be Euro!");
		}
		catch(UnmatchedMetricsException e) {
			System.out.println(e);
			System.exit(1);
		}
		
		// extension
		inputStr = base.inputStr;
		outputStr = "Rupees";
		Conversionfactor = base.Conversionfactor * 75;
	}
  
	public static EuroToRupeesConverter create() {
		return new EuroToRupeesConverter();
	}
	
};