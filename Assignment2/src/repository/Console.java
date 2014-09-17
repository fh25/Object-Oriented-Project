package repository;

import java.util.Scanner;
import java.io.FileReader;

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
   * Class Console creates and displays an interactive menu for the user.
   * @param args
   * @throws Exception
   */ 
  public static void main (String[] args) throws Exception {   	 
        
    /**
     * @Scanner reads car data from file "cars.txt"
     */    
    Scanner in = new Scanner(new FileReader("cars.txt"));
        
    /**
     * license plate number.
     */ 
    String carPlate;
        
    /**
     *  make of a car.
     */    
    String carMake;
        
    /**
     *  model of a car.
     */    
    String carModel;
        
    /**
     *  year of a car.
     */   
    int carYear;
        
    /**
     *  price of a car.
     */
    float carPrice; 
        
    /**
     * new object of type Car       
     */
    Vehicle record = new Vehicle ();
        
    /**
     * new object of type Input
     */
    Input input = new Input();        
        
    /**
     *  integer variable to hold user input
     */
    int choice;      
        
    while ( in.hasNextLine() ) {
      String line = in.nextLine();
      String [] data = line.split(" ");
      carPlate = data[0];
      carMake = data[1];
      carModel = data[2];
      carYear = Integer.parseInt(data[3]);
      carPrice = Float.parseFloat(data[4]);
      record.addToArray(carPlate, carMake, carModel, carYear, carPrice);
    }
        
    in.close();
        
    do {
      printMenu();
        
      choice = userChoice( in );
        
      switch (choice) {
        case '1':  
          input.addRecord( in, record ); 
          break;
        case '2':  
          input.deleteRecord( in, record );
          break;
        case '3':  
          record.printRecords();
          break;
        case '4':  
          input.priceRange( in );//input.searchRecords( in );
          break;
        case '5':  
          
          break;
        case '6':  
          //record.saveData();
          break;
        case '7':
          break;
        case '8':
          break;
        case '9':
          break;
        default: 
          System.out.printf( "Not a valid option%n", choice );
      }
        
    } while ( choice != '9' );
  }
    
  /**
   * Prints a menu out to the console.
   */   
  public static void printMenu() {
    System.out.print( "\n" );
    System.out.print( "Choose one of the following:\n" 
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
  public static int userChoice( Scanner in ) {
    in = new Scanner(System.in);
    System.out.print( "Your choice: " );

    char command = in.next().charAt(0);

    return command;
  }
}