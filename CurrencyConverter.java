public abstract class CurrencyConverter extends UnitConverter
{
	public CurrencyConverter() { }
	public double convert(double inValue) {
		in = inValue;
		out = in * Conversionfactor;
		return out;
	}
	public static CurrencyConverter create() {
	  return null;
	}
};