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
public class Truck extends Vehicle {
  
  /**
   * This truck's weight.
   */
  private float weight;
  
  /**
   * This truck's length.
   */
  private float length;
  
  /**
   * ArrayList of type Car.
   */  
  private static ArrayList<Truck> truckArray = new ArrayList<>();

  
  public static ArrayList<Truck> getTruckArray() {
    return truckArray;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public float getLength() {
    return length;
  }

  public void setLength(float length) {
    this.length = length;
  }
  
  public void addObject (Truck temp) {
    truckArray.add(temp);
  }
  
  public void printTruck () {
    
    System.out.println("\nTrucks:");
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model     " 
                      + " Year  " + "  Price " + "    Mileage    " + "\n");

    //for (int i = 0; i < Truck.getTruckArray().size(); ++i) {
    //  System.out.print(Truck.getTruckArray().get(i));
    //}
    for (Vehicle v : Vehicle.getVehicleArray()) {
      if (v.getClass().equals(Truck.class)) {
        System.out.print(v);
      }
    }
  }
}
