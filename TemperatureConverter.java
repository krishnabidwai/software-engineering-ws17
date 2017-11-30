public abstract class TemperatureConverter extends UnitConverter{
	  public TemperatureConverter() {}
}

 class CelsiusToFahrenheitConverter extends TemperatureConverter { 
  double  in;
  double  out;
   public CelsiusToFahrenheitConverter() { }
	  public double convert(double inCelsius) {

		    return ((inCelsius*1.8)+32);
		  }

		  public String toString(){
		    return "Celsius To Fahrenheit Converter";
		  }

		  public void print(){
		    System.out.println(toString());
		  }
}
	  
class FahrenheitToCelsiusConverter extends TemperatureConverter { 
	   
	double  in;
	double  out;
	   public FahrenheitToCelsiusConverter() { }

	   public double convert(double inFahrenheit) {
		    return ((inFahrenheit-32)*0.55555);
	   }

	   public String toString(){
	     return "Fahrenheit To Celsius Converter";
	   }

	   public void print(){
	    System.out.println(toString());
	   }
  
}
