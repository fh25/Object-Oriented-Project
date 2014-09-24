/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository; 

import java.io.PrintStream;

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
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model        " 
                    + "Mileage    " + "Style    " + "  Year  " + "    Price\n");
        
    for (Vehicle v : Vehicle.getVehicleArray()) {
     //PrintStream printf = System.out.printf("ArrayList: " + v);
    
    
      //if (v.equals(c)) {
        
        /*
        System.out.printf("  %-5s       " + "%-10s      " + " %-10s" 
                          + "   %6d  " + "   %6s " + "     %4d  " 
                          + "  $%,10.2f\n", v.getVin(), v.getMake(), v.getModel(), 
                          v.getMileage(), getStyle(), v.getYear(), v.getPrice());
            */
      //}
      
      System.out.print(v);
        
    }
  }
}
