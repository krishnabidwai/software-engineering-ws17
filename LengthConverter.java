
public abstract class LengthConverter extends UnitConverter{ 
	  
	  public LengthConverter() { }
	  
}
class MetersToKmConverter extends LengthConverter { 

	  public MetersToKmConverter() { }
	  
	  public double convert(double inMeters) {
		  
		  if(inMeters <= 0)
			  return 1;
		  else
			return inMeters*0.001;
	  }
	  
	  public String toString(){
	      return "Meter to Kilometer Converter";
    }

    public void print(){
	      System.out.println(toString());
    }
}
	  
class KmToMetersConverter extends LengthConverter { 
		  
	  public KmToMetersConverter(){ }
	  
	  public double convert(double inKiloMeters) {
		  
		  if(inKiloMeters <= 0)
			  return 1;
		  else
			return inKiloMeters*1000;
	  }
	  
	  public String toString(){
	      return "Kilometer To Meter Converter";
    }

    public void print(){
	      System.out.println(toString());
    }
		  
}
