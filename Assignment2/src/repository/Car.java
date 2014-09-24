/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository; 

import java.util.ArrayList;

/**
 *
 * @author fhj
 */
public class Car extends Vehicle { 
  
  /**
   * This car's body style.
   */
  private String style;

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }
  
  /**
   * ArrayList of type Car.
   */  
  private static ArrayList<Car> carArray = new ArrayList<>();
  
  /**
   * Returns the ArrayList object of type Car
   * @return this ArrayList of type Vehicle
   */  
  public static ArrayList<Car> getCarArray() {
    return carArray;
  }
  
  public void addObject (Car temp) {
    carArray.add(temp);
  }
  
  public void printCar () {
    
    
    System.out.println("\nCars:");
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model     " 
                      + " Year  " + "  Price " + "    Mileage    " + "\n");
        
    //for (int i = 0; i < Car.getCarArray().size(); ++i) {
    //  System.out.print(Car.getCarArray().get(i));
    //}
    for (Vehicle v : Vehicle.getVehicleArray()) {
      if (v.getClass().equals(Car.class)) {
        System.out.print(v);
      }
    }
  }
}