class Command {

	public Command(String conversion, Double value) {

		// Get the Single Instance of the factory
		ConverterFactory factory = ConverterFactory.getInstance(); 
		// Get the corresponding converter
		converter = factory.create(conversion);
		// Assign the value as a double
		input = value;
	}

	// Calculate and print the result
	public void execute() {
		converter.convert(input);
		converter.print();
	}
	
	private UnitConverter converter;
	private double input;

}