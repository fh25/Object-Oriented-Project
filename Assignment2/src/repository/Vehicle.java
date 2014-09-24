package repository;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;

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
  
  /**
   * Returns the VIN number represented by this Vehicle object.
   * @return this object's VIN number
   */
  public String getVin() {
    return vin;
  }

  /**
   * Returns the mileage represented by this Vehicle object.
   * @return this object's mileage
   */
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
   * Sets the VIN number passed from the user input.
   * @param vin this object's VIN number
   */
  public void setVin(String vin) {
    this.vin = vin;
  }

  /**
   * Sets the make passed from the user input
   * @param make this object's make
   */
  public void setMake(String make) {
    this.make = make;
  }

  /**
   * Sets the model passed from the user input
   * @param model this object's model
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the year passed from the user input
   * @param year this object's year
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * Sets the mileage passed from the user input
   * @param mileage this object's mileage
   */
  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  /**
   * Sets the price passed from the user input
   * @param price this object's price
   */
  public void setPrice(float price) {
    this.price = price;
  }
  
  /**
   * This method adds an object of type Vehicle to the Vehicle Array
   * @param temp the object to be added to the Vehicle Array
   */
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
