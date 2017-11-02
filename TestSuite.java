import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {
  
  @Test public static void DETest1() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  @Test public static void DETest2() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  @Test public static void DETest3() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(0);
    assertEquals(1,result,0.001);
  }
  @Test public static void DETest4() {
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(10000);
   assertEquals(16000,result,0.001);
  }
  @Test public static void DETest5() {
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  @Test public static void DETest6() {
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(0);
    assertEquals(1,result,0.001);
  }
  
  //LengthConvertor
  
  @Test public static void DETest7() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  @Test public static void DETest8() {
    UnitConverter test = new MetersToKmConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  @Test public static void DETest9() {
    UnitConverter test = new MetersToKmConverter();
    double result = test.convert(0);
    assertEquals(1,result,0.001);
  }
  @Test public static void DETest10() {
    UnitConverter test = new KmToMetersConverter();
    double result = test.convert(10000);
   assertEquals(10000000,result,0.001);
  }
  @Test public static void DETest11() {
    UnitConverter test = new KmToMetersConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  @Test public static void DETest12() {
    UnitConverter test = new KmToMetersConverter();
    double result = test.convert(0);
    assertEquals(1,result,0.001);
  }
  
  //Temperatur Convertor test cases
  
  //LengthConvertor
  
  @Test public static void DETest13() {
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(10);
    assertEquals(50,result,0.001);
  }
  @Test public static void DETest14() {
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(-1);
    assertEquals(30.2,result,0.001);
  }
  @Test public static void DETest15() {
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(0);
    assertEquals(32,result,0.001);
  }
  @Test public static void DETest16() {
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(32);
   assertEquals(0,result,0.001);
  }
  @Test public static void DETest17() {
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(1);
    assertEquals(-17.2222,result,0.001);
  }
  @Test public static void DETest18() {
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(100);
    assertEquals(37.7778,result,0.001);
  }
   
}
