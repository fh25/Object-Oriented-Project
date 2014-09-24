/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

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
  
  public void printTruck (Truck t) {
    
    System.out.println("\nTrucks:");
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model    " 
                      + "    Mileage" + "    Max Load " + "  Length  " 
                      + "    Year    " + "  Price\n");
        
    for (Vehicle v : Vehicle.getVehicleArray()) {
      
      if (v.equals(t)) {
        System.out.printf("  %-5s     " + "  %-10s     " + "  %-10s" 
                          + "   %-6d     " + "%-7.2f    " + "%-4.2f  " 
                          + "     %-4d " + "   $%,10.2f\n", getVin(), getMake(), 
                          getModel(), getMileage(), getWeight(), getLength(), 
                          getYear(), getPrice());
      }
    }
  }
}
