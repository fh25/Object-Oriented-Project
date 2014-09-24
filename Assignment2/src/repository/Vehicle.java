package repository;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;

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
public class Vehicle implements Serializable {

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

  public static void setVehicleArray(ArrayList<Vehicle> vehicleArray) {
    Vehicle.vehicleArray = vehicleArray;
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

  public void setVin(String vin) {
    this.vin = vin;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  public void setPrice(float price) {
    this.price = price;
  }
  
  public void addToVehicleArray (Vehicle temp) {
    vehicleArray.add(temp);
  }
  
  /**
   * Writes data stored in ArrayList to file "dealership.txt"
   * @throws Exception - file not found exception
   */
  public void saveData () throws Exception {
     
    try {
      FileOutputStream fileOut = new FileOutputStream("dealership.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      
      for ( Vehicle c : Vehicle.getVehicleArray() ) {
        out.writeObject(c);
      }
      
      fileOut.close();
      
    } catch (IOException ioException) {
      System.err.println("Error opening file. Terminating." + ioException);
      System.exit(1); 
    }
   
    System.out.print("Data saved.\n");
  }
  

  /**
   * Converts and returns this Vehicle object to a formatted String.
   * @return a String representation of this Vehicle.
   */
  @Override
  public String toString () {
    return ( "  " + vin + "        " + make + "            " + model + "       " 
            + year + "    " + price + "     " +  mileage +  "      \n");   
  }
}
