/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

  @Test
  public void test_Units(){
	  System.out.println("Test if getUnits returns right value for units...");
	  //Tests all possible cases for changeUnits as well as getUnits
      
	  Temperature celsius = new Temperature(0, Temperature.Units.CELSIUS);
	  assertTrue(celsius.getUnits() == Temperature.Units.CELSIUS);
	  Temperature converted = new Temperature(celsius);
	  converted.changeUnits(Temperature.Units.FAHRENHEIT);
	  assertTrue(converted.getUnits() == Temperature.Units.FAHRENHEIT);
	  converted.changeUnits(Temperature.Units.KELVIN);
	  assertTrue(converted.getUnits() == Temperature.Units.KELVIN);
      
	  Temperature kelvin = new Temperature(0, Temperature.Units.KELVIN);
	  assertTrue(kelvin.getUnits() == Temperature.Units.KELVIN);
	  converted = new Temperature(kelvin);
	  converted.changeUnits(Temperature.Units.CELSIUS);
	  assertTrue(converted.getUnits() == Temperature.Units.CELSIUS);
	  converted.changeUnits(Temperature.Units.FAHRENHEIT);
	  assertTrue(converted.getUnits() == Temperature.Units.FAHRENHEIT);
      
	  Temperature fahrenheit = new Temperature(0, Temperature.Units.FAHRENHEIT);
	  assertTrue(fahrenheit.getUnits() == Temperature.Units.FAHRENHEIT);
      converted = new Temperature(fahrenheit);
	  converted.changeUnits(Temperature.Units.CELSIUS);
	  assertTrue(converted.getUnits() == Temperature.Units.CELSIUS);
	  converted.changeUnits(Temperature.Units.KELVIN);
	  assertTrue(converted.getUnits() == Temperature.Units.KELVIN);
  }

  @Test
  public void test_Value(){
	  System.out.println("Test if getValue returns right value for value...");
	  for(double i = -461; i < 500; i++){ // -461 as starting value because one below absolute zero in fahrenheit, 500 chosen arbitrarily. 
		  Temperature celsius = new Temperature(i,Temperature.Units.CELSIUS);
		  assertTrue(celsius.getValue() == i);
		  
		  Temperature fahrenheit = new Temperature(i, Temperature.Units.FAHRENHEIT);
		  assertTrue(fahrenheit.getValue() == i);
		  
		  Temperature kelvin = new Temperature(i, Temperature.Units.KELVIN);
		  assertTrue(kelvin.getValue() == i);
	  }
  }
}
