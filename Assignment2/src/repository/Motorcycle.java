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
public class Motorcycle extends Vehicle {
  
  /**
   * This motorcycle's type.
   */
  private String type;
  
  /**
   * This motorcycle's engine displacement.
   */
  private int engine;
  
  /**
   * ArrayList of type Motorcycle.
   */  
  private static ArrayList<Motorcycle> motorcycleArray = new ArrayList<>();  

  public static ArrayList<Motorcycle> getMotorcycleArray() {
    return motorcycleArray;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getEngine() {
    return engine;
  }

  public void setEngine(int engine) {
    this.engine = engine;
  }
  
  public void addObject (Motorcycle temp) {
    motorcycleArray.add(temp);
  }
  
  public void printMotorcycle () {
    
    System.out.println("\nMotorcycles:");
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model     " 
                      + " Year  " + "  Price " + "    Mileage    " + "\n");
        
    for (int i = 0; i < Motorcycle.getMotorcycleArray().size(); ++i) {
      System.out.print(Motorcycle.getMotorcycleArray().get(i));
    }
  }
}