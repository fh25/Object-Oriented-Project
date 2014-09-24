package repository;

import java.util.ArrayList;

/**
 * Class Truck extends Vehicle to provide additional information about a Truck. 
 * It provides methods to add and print a Truck object.
 * @author Fernando Herrera
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

  /**
   * Returns Truck Array
   * @return the Truck Array
   */
  public static ArrayList<Truck> getTruckArray() {
    return truckArray;
  }

  /**
   * Returns the weight represented by this Truck object
   * @return this object's weight
   */
  public float getWeight() {
    return weight;
  }
  
  /**
   * Sets the weight represented by this Truck object
   * @param weight this object's weight
   */ 
  public void setWeight(float weight) {
    this.weight = weight;
  }

  /**
   * Returns the length represented by this Truck object
   * @return this object's length
   */
  public float getLength() {
    return length;
  }

  /**
   * Sets the length represented by this Truck object
   * @param length this object's length
   */
  public void setLength(float length) {
    this.length = length;
  }
  
  /**
   * This method adds an object of type Truck to the Truck Array.
   * @param temp the object to be added to Truck Array
   */
  public void addObject (Truck temp) {
    truckArray.add(temp);
  }
  
  /**
   * This method prints the header information for a truck. It uses a for-each
   * loop to traverse the Vehicle Array and prints all objects of type Truck.
   */
  public void printTruck () {
    
    System.out.println("\nTrucks:");
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model     " 
                      + " Year  " + "  Price " + "    Mileage    " + "\n");

    for (Vehicle v : Vehicle.getVehicleArray()) {
      if (v.getClass().equals(Truck.class)) {
        System.out.print(v);
      }
    }
  }
}
