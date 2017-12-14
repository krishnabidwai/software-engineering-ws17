public class MetersToKmConverter extends LengthConverter { 
	
	double  in;
  	double  out;
  	public MetersToKmConverter() {
  	  inputStr = "Meters";
  	  outputStr = "Km";
  	  Conversionfactor = 0.001;
  	}

 // Decorator
 	public MetersToKmConverter(UnitConverter base) {

 		//exception when input don't match for a decorator
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
 		outputStr = "Km";
 		Conversionfactor = base.Conversionfactor * 0.001;
 	}
   
 	public static MetersToKmConverter create() {
 		return new MetersToKmConverter();
 	}
 	
 }