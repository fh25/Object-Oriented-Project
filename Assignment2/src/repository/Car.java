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
  
public void printCar (Car c) {
    
  System.out.println("\nCars:");
  System.out.printf("VIN Number  " + "  Manufacturer    " + " Model    " 
                    + "    Style " + "  Year  " + "     Price\n");
        
  for (Vehicle v : Vehicle.getVehicleArray()) {
     
    if (v.equals(c)) {
      System.out.printf("   %-7s     " + "%-10s      " + "%-10s" + "  %4s " 
                        + "  %4d  " + "   $%,10.2f\n", getVin(), getMake(), getModel(), 
                        getStyle(), getYear(), getPrice());
    }
  }
}
}
