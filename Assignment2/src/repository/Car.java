/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository; 

import java.util.ArrayList;

/**
 * Class Car extends Vehicle to provide additional information about a Car. 
 * It provides methods to add and print a Car object.
 * @author Fernando Herrera
 */
public class Car extends Vehicle { 
  
  /**
   * This car's body style.
   */
  private String style;

  /**
   * Returns the style represented by this Car object.
   * @return this object's style
   */
  public String getStyle() {
    return style;
  }

  /**
   * Sets the style for a Car object.
   * @param style is set as this Car object's style
   */
  public void setStyle(String style) {
    this.style = style;
  }
  
  /**
   * ArrayList of type Car.
   */  
  private static ArrayList<Car> carArray = new ArrayList<>();
  
  /**
   * Returns the ArrayList object of type Car
   * @return this ArrayList of type Car
   */  
  public static ArrayList<Car> getCarArray() {
    return carArray;
  }
  
  /**
   * Adds an object of type Car to the Car Array
   * @param temp is the object passed to be added to this Car's Array
   */
  public void addObject (Car temp) {
    carArray.add(temp);
  }
  
  /**
   * This method prints the header information for a car. It uses a for-each
   * loop to traverse the Vehicle Array and prints all objects of type Car.
   */
  public void printCar () {
    
    System.out.println("\nCars:");
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model     " 
                      + " Year  " + "  Price " + "    Mileage    " + "\n");
      
    for (Vehicle v : Vehicle.getVehicleArray()) {
      if (v.getClass().equals(Car.class)) {
        System.out.print(v);
      }
    }
  }
}