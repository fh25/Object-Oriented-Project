package repository;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class Console creates a menu for a car repository. 
 * @author Fernando Herrera and Leah Weiland
 */
public class Console {	
  
  /**
   * @ObjectInputStream used to read from a file
   */
  private static ObjectInputStream inFile;
  
  /**
   * @ObjectOutputStream used to write to a file
   */
  private static ObjectOutputStream out;

  /**
	 * variable to keep track of how many users there are in the system
	 */
	static int userCounter = 0;

  /**
   * Class Console creates and displays an interactive menu for the user.
   * @param args
   * @throws Exception
   */ 
  public static void main (String[] args) throws Exception {   	 
   
    openInFile();
    readFile();
    closeInFile();

    /**
     * @Scanner reads car data from file "dealership.txt"
     */    
    Scanner in = new Scanner(System.in);
   
    //experiment
    Vehicle vehicle = new Vehicle ();
    
    /**
     * new object of type User
     */
    User user = new User();
    
    /**
     * new object of type Input for employee input
     */
    Input employee = new Input();
        
    /**
     * new object of type Car       
     */
    Car car = new Car ();
    
    /**
     * new object of type Truck
     */
    Truck truck = new Truck ();
    
    /**
     * new object of type Motorcycle
     */
    Motorcycle bike = new Motorcycle ();
        
    /**
     * new object of type Input
     */
    Input input = new Input ();        
        
    /**
     *  integer variable to hold user input
     */
    int choice;
    
    /**
     *  integer variable to hold user vehicle choice
     */
    int option;
        
    do {
      printMenu ();
        
      choice = userChoice (in);
        
      switch (choice) {
        case '1':
          do {
            option = vehicleChoice (in);
            switch (option) {
              case '1': 
                //input.addRecord (in, car); 
                input.addRecord(in);
                break;
              case '2':
                input.addRecord (in, truck);
                break;
              case '3':
                input.addRecord (in, bike); 
                break;
              case '4':
                break;
              default : 
                System.out.printf("Not a valid option%n", option);
            }
          } while (option != '4');
          break;
        case '2':  
          input.deleteRecord(in, vehicle);
          break;
        case '3':  
          
          //for (Vehicle v : Vehicle.getVehicleArray()) {
        //PrintStream printf = System.out.printf("ArrayList: " + v);
         // }
          car.printCar(car);
          //truck.printTruck(truck);
          //bike.printMotorcycle(bike);
          break;
        case '4':  
          //input.priceRange( in );//input.searchRecords( in );
          break;
        case '5':  
          do {
            option = addUserChoice(in);
            switch(option){
            case '1':              
              //Employee temp = new Employee();
              input.addEmployeeUserRecord(in);
              break;
            case '2':
              Input customer = new Input();
              customer.addCustomerUserRecord(in);
              break;
            case '3':
              break;
            default :
              System.out.printf(" Not a valid option%n", option);
            }       	  
          }while (option != '3');
          break;
        case '6':  
          
          break;
        case '7':
          break;
        case '8':
          break;
        case '9':
          vehicle.saveData();
          break;
        default: 
          System.out.printf("Not a valid option%n", choice);
      }
    } while (choice != '9');
  }
    
  /**
   * Prints a menu out to the console.
   */   
  public static void printMenu () {
    System.out.print("\n");
    System.out.print("Choose one of the following:\n" 
                     + "\t1. Add a new vehicle to the database.\n"
                     + "\t2. Delete a vehicle from a database (by VIN)\n"
                     + "\t3. Show all existing vehicles in the database.\n"
                     + "\t4. Show a list of vehicles within a given price range\n"
                     + "\t5. Add a new user to the database.\n"
                     + "\t6. Update user info (by ID)\n" 
                     + "\t7. Show list of users.\n"
                     + "\t8. Sell a vehicle\n"
                     + "\t9. Exit program.\n");
  }

  /**
   * Returns integer value read by Scanner
   * @param in reusing Scanner in object
   * @return user input read by Scanner, an integer value between 1 and 6
   */
  public static int userChoice(Scanner in) {
    in = new Scanner(System.in);
    System.out.print("Your choice: ");

    char command = in.next().charAt(0);

    return command;
  }
  
  public static int vehicleChoice(Scanner in) {
    in = new Scanner(System.in);
    System.out.print("\nChoose Vehicle Type To Add: \n"
                     + "\t1. Car\n"
                     + "\t2. Truck\n"
                     + "\t3. Motorcycle\n"
                     + "\t4. Back to Main Menu.\n"
                     + "Your choice: ");
    
    char selection = in.next().charAt(0);
    
    return selection;
  }
  
  public static int addUserChoice(Scanner in){
	  in = new Scanner(System.in);
	  System.out.print("\nChoose a user type to add to the database: \n"
			  		   + "\t1. Employee \n"
			  		   + "\t2. Customer \n"
			  		   + "\t3. Back to Main Menu. \n"
			  		   + "Your choice: ");
	  
	  char selection = in.next().charAt(0);
	 
	  return selection;
  }
  
  public static void openInFile() {
    try {
      inFile = new ObjectInputStream(new FileInputStream("dealership.txt")); 
      
    } catch (IOException e) {
      System.out.println("Try adding data then exit using menu option 9 to "
                         + "create file. " + e);
      
    }
  }
  
  public static void readFile() {
    
    if (inFile == null) {
      return;
    }
    
    try {
      while (true) {
        Vehicle v = (Vehicle) inFile.readObject();
        //v.addObject(v);
        System.out.println(v); //printing for test purposes 
      }
    } 
    catch (ClassNotFoundException classNotFound) {
      System.err.println("Invalid object type. " + classNotFound);
    } 
    catch (IOException e) {
      System.err.println("Error reading from file. " + e);
    }
  }
  
  public static void closeInFile() {
    try {
      if (inFile != null) {
        inFile.close();
      }
    } catch (IOException e) {
      System.err.println("Error closing file. Terminating." + e);
      System.exit(1);
    }
  }
  
  public static void openOutFile() {
    try {
      out = new ObjectOutputStream(new FileOutputStream("dealership.txt")); 
      
    } catch (IOException e) {
      System.err.println("Error opening file." + e);
    }
  }
  
  public static void writeFile() throws ClassNotFoundException {
    for ( Vehicle c : Vehicle.getVehicleArray() ) {
      try {
        out.writeObject(c);
      } catch (IOException ex) {
        System.err.println("Error writing to file. " + ex);
      }
    }
  }
  
  public static void closeOutFile() {
    try {
      if (out != null)
        out.close();
    } catch (IOException e) {
      System.err.println("Error closing file. Terminating. " + e);
      System.exit(1);
    }
  }
  
  public static int incrementCounter(){
    ++userCounter;
	return userCounter;    
  }
  public static void printUsers(){
	  
  }
}
