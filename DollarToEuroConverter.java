public class DollarToEuroConverter extends CurrencyConverter
{
	public DollarToEuroConverter() {
	  inputStr = "Dollar";
	  outputStr = "Euro";
	  Conversionfactor = 0.85;
	}
	
	// Decorator
	public DollarToEuroConverter(UnitConverter base) {

		//exception when input don't match for a decorator
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
		outputStr = "Euro";
		Conversionfactor = base.Conversionfactor * 0.85;
	}
  
	public static DollarToEuroConverter create() {
		return new DollarToEuroConverter();
	}
	
};