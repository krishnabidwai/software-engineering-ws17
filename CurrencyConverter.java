public abstract class CurrencyConverter extends UnitConverter { 
	 public CurrencyConverter() {} 
 }

class DollarToEuroConverter extends UnitConverter
{
  public DollarToEuroConverter() { }

  public double convert(double inDollars) {
	
	if(inDollars <= 0)
		return 1;
	else
		return inDollars*0.85;
  }

  public String toString(){
    return "Dollar to Euro Converter";
  }

  public void print(){
    System.out.println(toString());
  }
}

class EuroToDollarConverter extends CurrencyConverter { 
	  
	public EuroToDollarConverter() { }
	  
	public double convert(double inEuros) 
	{
		if(inEuros <= 0)
			return 1;
		else
	    return inEuros*1.6;
	}
	  
	public String toString()
	{
	    return "Euro To Dollar Converter";
	}

     public void print(){
	    System.out.println(toString());
     }
}
