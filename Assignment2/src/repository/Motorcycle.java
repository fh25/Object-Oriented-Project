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
public class Motorcycle extends Vehicle {
  
  /**
   * This motorcycle's type.
   */
  private String type;
  
  /**
   * This motorcycle's engine displacement.
   */
  private int engine;

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
  
  public void printMotorcycle (Motorcycle m) {
    
    System.out.println("\nMotorcycle:");
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model       " 
                      + " Mileage" + "    Type    " + "   Engine cc " 
                      + "  Year  " + "    Price\n");
        
    for (Vehicle v : Vehicle.getVehicleArray()) {
      
      if (v.equals(m)) {
      System.out.printf("  %-5s       " + "%-10s      " + " %-10s" + "   %6d  " 
                        + " %8s " + "      %-4d   " + "   %4d " 
                        + "   $%,10.2f\n", getVin(), getMake(), getModel(), 
                        getMileage(), getType(), getEngine(), getYear(), 
                        getPrice());
      }
    }
  }
}