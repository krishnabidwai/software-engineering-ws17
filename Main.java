import java.lang.reflect.Method;

class Main {
  public static void main(String[] args) throws Exception
  {
    String conversion = args[0];
    String value = args[1];

    /*
     * TODO
     *
     * use desired conversion here
     *
    

    UnitConverter myConverter = new DollarToEuroConverter();
    double aLotOfDollars = 10000;
    double aLotOfEuros = myConverter.convert(aLotOfDollars);
    System.out.println(myConverter.toString() + " has converted " + aLotOfDollars + " USD to " + aLotOfEuros + " EUR!");
	*/
	
	try{
		
	Class<?> cls = Class.forName(conversion);
 	Object obj = cls.newInstance();
 	
 	// use Methods - putValues & print
 	// method 'putValues' requires a string as a parameter
 	Method m = cls.getDeclaredMethod("putValues", new Class[] {String.class});
 	m.invoke(obj, value);
 	m = cls.getDeclaredMethod("print");
 	m.invoke(obj);
	}catch(ClassNotFoundException cnfe){
		
		System.out.println("Wrong Class Name");
	}
   }
}

