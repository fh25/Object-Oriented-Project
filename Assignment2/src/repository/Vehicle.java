package repository;

import java.util.ArrayList;
import java.io.PrintWriter;
import java.lang.Object;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The class Vehicle holds certain information about the vehicle such as its license plate number, make,
 model, year, and price.
 * @author Fernando Herrera and Leah Weiland
 */
public class Vehicle {

  /**
  * This vehicle's VIN plate number.
  */
  private String vin;
    
  /**
   * This vehicle's make.
   */
  private String make;
    
  /**
   * This vehicle's model.
   */  
  private String model;
    
  /**
   * This vehicle's year.
   */  
  private int year;
  
  /**
   * This vehicle's mileage.
   */
  private int mileage;
    
  /**
   * This vehicle's price.
   */  
  private float price;
    
  /**
   * ArrayList of type Vehicle.
   */  
  private static ArrayList<Vehicle> vehicleArray = new ArrayList<>();
    
  /**
   * Returns the ArrayList object of type Vehicle
   * @return this ArrayList of type Vehicle
   */  
  public static ArrayList<Vehicle> getVehicleArray() {
    return vehicleArray;
  }
  
  /**
   * Returns the VIN number represented by this Vehicle object.
   * @return this object's license plate number
   */
  public String getVin() {
    return vin;
  }

  public int getMileage() {
    return mileage;
  }
    
  /**
   * Returns the make represented by this Vehicle object.
   * @return this object's make.
   */
  public String getMake() {
    return make;
  }
    
  /**
   * Returns the model represented by this Vehicle object.
   * @return this object's model.
   */
  public String getModel() {
    return model;
  }
    
  /**
   * Returns the year represented by this Vehicle object.
   * @return this object's year.
   */
  public int getYear() {
    return year;
  }
    
  /**
   * Returns the price represented by this Vehicle object.
   * @return this object's price.
   */
  public float getPrice() {
    return price;
  }
    
  /**
   * Creates a temporary object of type Vehicle, setting the values with the given parameters.
   * @param vehicleVin  the Vehicle license plate number.
   * @param vehicleMake  the make of the Vehicle.
   * @param vehicleModel  the model of the Vehicle.
   * @param vehicleYear  the year of the Vehicle.
   * @param vehicleMileage the mileage of the Vehicle.
   * @param vehiclePrice  the price of the Vehicle.
   */
  public void addToArray (String vehicleVin, String vehicleMake, 
                          String vehicleModel, int vehicleYear, 
                          int vehicleMileage, float vehiclePrice) {
    
    Vehicle temp = new Vehicle ();
    
    temp.vin = vehicleVin;
    temp.make  = vehicleMake;
    temp.model = vehicleModel;
    temp.year  = vehicleYear;
    temp.price = vehiclePrice;
    
    vehicleArray.add( temp );
  }
    
  /**
   *  Prints to the console the attributes of type Vehicle stored in an ArrayList.
   */
    
  public void printRecords () { 
    int i = 0;
    
    System.out.printf("Record  " + "VIN Number  " + "  Manufacturer    "  
                      + " Model    " + "    Year  " + "     Price\n" );
        
      for (Vehicle c : Vehicle.getVehicleArray()) {
        System.out.printf("  %d   \t", ++i );
        System.out.printf("   %-7s\t" + "  %-10s\t" + "  %-10s" + "   %4d " 
                          + "   $%,10.2f\n", c.getVin(), c.getMake(), 
                          c.getModel(), c.getYear(), c.getPrice());
      }      
  }
    
  /**
   * Writes data stored in ArrayList to file "cars.txt"
   * @throws Exception - file not found exception
   */
    
  public void saveData () throws Exception {
        
    try (PrintWriter outFile = new PrintWriter("cars.txt")) {
      for ( Vehicle c : Vehicle.getVehicleArray() ) {
        outFile.println(c);
      }
            
      System.out.print("Data saved.\n");
    }
  }

  /**
   * Converts and returns this Vehicle object to a formatted String.
   * @return a String representation of this Vehicle.
   */
    
  @Override
  public String toString () {
    return ( vin + " " + make + " " + model + " " + year + " " + price );   
  }
}
