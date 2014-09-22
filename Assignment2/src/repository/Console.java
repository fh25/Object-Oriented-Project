package repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

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
  
  private static ObjectInputStream in;
  
  /**
   * Class Console creates and displays an interactive menu for the user.
   * @param args
   * @throws Exception
   */ 
  public static void main (String[] args) throws Exception {   	 
    
    openFile();
    readFile();
    closeFile();

    /**
     * @Scanner reads car data from file "cars.txt"
     */    
    Scanner in = new Scanner(System.in);//(new FileReader("cars.txt"));
   
    /**
     * Vehicle VIN number.
     */ 
    String vehicleVin;
        
    /**
     *  The make of the vehicle.
     */    
    String vehicleMake;
        
    /**
     *  The model of the vehicle.
     */    
    String vehicleModel;
        
    /**
     *  The year of the vehicle.
     */   
    int vehicleYear;
    
    /**
     * The mileage of the vehicle.
     */
    int vehicleMileage;
        
    /**
     *  The price of the vehicle.
     */
    float vehiclePrice; 
    
    
    //experiment
    Vehicle vehicle = new Vehicle ();
        
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
        
      choice = userChoice  (in);
        
      switch (choice) {
        case '1':
          do {
            option = vehicleChoice (in);
            switch (option) {
              case '1': 
                input.addRecord (in, car, option); 
                break;
              case '2':
                input.addRecord (in, truck, option);
                break;
              case '3':
                input.addRecord (in, bike, option); 
                break;
              case '4':
                break;
              default : 
                System.out.printf("Not a valid option%n", option);
            }
          } while (option != '4');
          break;
        case '2':  
          input.deleteRecord( in, vehicle );
          break;
        case '3':  
          vehicle.printRecords();
          break;
        case '4':  
          //input.priceRange( in );//input.searchRecords( in );
          break;
        case '5':  
          
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
    System.out.print("\nChoose Vehicle Type: \n"
                     + "\t1. Car\n"
                     + "\t2. Truck\n"
                     + "\t3. Motorcycle\n"
                     + "\t4. Back to Main Menu.\n"
                     + "Your choice: ");
    
    char selection = in.next().charAt(0);
    
    return selection;
  }
  
  public static void openFile() {
    try {
      in = new ObjectInputStream(new FileInputStream("dealership.txt")); 
      
    } catch (IOException ioException) {
      System.err.println("Error opening file. Try adding data then exit using "
                         + "menu option 9.");
    }
  }
  
  public static void readFile() throws ClassNotFoundException {
    Vehicle v;
    
    try {
      while (true) {
        v = (Vehicle) in.readObject();
        System.out.println(v); //printing for test purposes
        v.addObject(v);
      }
    } catch (IOException ioException) {
      
    }
  }
  
  public static void closeFile() {
    try {
      if (in != null)
        in.close();
    } catch (IOException ioException) {
      System.err.println("Error closing file.");
    }
  }
}
