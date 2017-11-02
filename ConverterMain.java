import java.util.Scanner;

class ConverterMain { 
	
	public void print(String classname, double d){
		
		try {
			
			Class<?> clazz = Class.forName(classname);
			Object o = clazz.newInstance();
			UnitConverter de = (UnitConverter) o;
			de.print();
			System.out.println(de.convert(d));	
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
	}
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		double d = sc.nextDouble();
		sc.close();
		
		ConverterMain cm = new ConverterMain();
		cm.print(name, d);
	}
		
}