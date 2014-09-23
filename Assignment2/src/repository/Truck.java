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
  
  public void printTruck () {
    
    System.out.println("\nTrucks:");
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model    " 
                      + "    Max Load Weight " + "  Length  " + "  Year  " 
                      + "     Price\n");
        
    for (Vehicle c : Vehicle.getVehicleArray()) {
      System.out.printf("   %-7s       " + "%-10s     " + "%-10s" + "   %4f " 
                        + "   %4f  " + "       %2d      " + "   $%,10.2f\n", 
                        getVin(), getMake(), getModel(), getWeight(), 
                        getLength(), getYear(), getPrice());
    }
  }
}
