package repository;

import java.util.ArrayList;

/**
 * Class Motorcycle extends Vehicle to provide additional information about a 
 * Motorcycle. It provides methods to add and print a Motorcycle object.
 * 
 * @author Fernando Herrera
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

  /**
   * Returns the ArrayList object of type Motorcycle
   * @return this ArrayList of type Motorcycle
   */
  public static ArrayList<Motorcycle> getMotorcycleArray() {
    return motorcycleArray;
  }

  /**
   * Returns the type represented by this Motorcycle object
   * @return this object's type
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type passed from the user input
   * @param type this object's type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Returns the engine size represented by this Motorcycle object
   * @return this object's engine size
   */
  public int getEngine() {
    return engine;
  }

  /**
   * Sets the engine size passed from the user input
   * @param engine this object's engine
   */
  public void setEngine(int engine) {
    this.engine = engine;
  }
  
  /**
   * Adds an object of type Motorcycle to the Motorcycle Array
   * @param temp is the object passed to be added to this Motorcycle's Array
   */
  public void addObject (Motorcycle temp) {
    motorcycleArray.add(temp);
  }
  
  /**
   * This method prints the header information for a motorcycle. It uses a 
   * for-each loop to traverse the Vehicle Array and prints all objects of 
   * type Motorcycle.
   */
  public void printMotorcycle () {
    
    System.out.println("\nMotorcycles:");
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model     " 
                      + " Year  " + "  Price " + "    Mileage    " + "\n");
        
    for (Vehicle v : Vehicle.getVehicleArray()) {
      if (v.getClass().equals(Motorcycle.class)) {
        System.out.print(v);
      }
    }
  }
}