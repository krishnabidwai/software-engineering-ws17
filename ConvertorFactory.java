import java.util.HashMap;
import java.util.function.Supplier;

//---------Abstract Factory---------//
 class ConverterFactory {
	
	//---------HashMap---------//
	private static HashMap<String, Supplier<UnitConverter>> factory_methods
		= new HashMap<String, Supplier<UnitConverter>>();
	
	static {
		factory_methods.put("DollarToEuroConverter", () -> DollarToEuroConverter.create());
		factory_methods.put("DollarToRupeesConverter", () -> DollarToRupeesConverter.create());
		factory_methods.put("EuroToRupeesConverter", () -> EuroToRupeesConverter.create());
		
		factory_methods.put("MetersToKmConverter", () -> MetersToKmConverter.create());
		factory_methods.put("MetersToFeet", () -> MetersToFeet.create());
		factory_methods.put("KmToFeetConverter", () -> KmToFeetConverter.create());
		
		//factory_methods.put("FahrenheitToKelvinConverter", () -> FahrenheitToKelvinConverter.create());
	}
	
	//---------Singleton---------//
	// Single Instance of a Factory
	private static ConverterFactory instance = null;
	
	// Constructor is hidden to keep only one instance
	protected ConverterFactory() {}
	
	// Get the single instance of a factory
	public static ConverterFactory getInstance() {
		if(instance == null) {
			instance = new ConverterFactory();
		}
		return instance;
	}
	
	//---------Factory Method---------// 
	// get the converter with its name
	public UnitConverter create(String type) {
		
		Supplier<UnitConverter> supplier = factory_methods.get(type);
		
		// Wrong Input
		if(supplier != null) {
			return supplier.get();
		}
		
		// Throwing Exception
		throw new IllegalArgumentException("Invalid converter: " + type);
	}
};