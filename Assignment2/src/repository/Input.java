package repository;

import java.util.Scanner;

/**
 * Class Input provides methods to add, delete, and search records of an
 ArrayList of type Vehicle using provided input from the user.
 *
 * @author Fernando Herrera and Leah Weiland
 *
 */
public class Input {

  /**
   * Creates a temporary object of type Vehicle setting its attributes to values
 input by the user. The temporary object is then added to ArrayList of
 type Vehicle.
   *
   * @param in reuse Scanner in object
   * @param temp reuses Vehicle object temp
   */
  public void addRecord(Scanner in, Vehicle temp, int option) {
    in = new Scanner(System.in);
    
    boolean flag = false;
    
    int minYear = 1949,
        maxYear = 2017,
        minLength = 10,
        minLoadWeight = 2800;

    System.out.print("\nEnter 5 character VIN number: ");
    temp.setVin(in.next()); 

    for (Vehicle c : Vehicle.getVehicleArray()) {
      while (temp.getVin().equalsIgnoreCase(c.getVin())) {
        System.out.print("Duplicate found.\nEnter VIN number: ");
        temp.setVin(in.next());
      }
    }

    System.out.print("Enter make: ");
    temp.setMake(in.next());

    System.out.print("Enter model: ");
    temp.setModel(in.next());

    do {
      System.out.print("Enter year between 1950-2016: ");

        if (in.hasNextInt()) {
          temp.setYear(in.nextInt());
        }

        if (temp.getYear() < maxYear && temp.getYear() > minYear) {
          flag = true;
        }
    } while (!(flag));

    flag = false;
    
    do {
      System.out.print("Enter mileage: ");
      
        if (in.hasNextInt()) {
          temp.setMileage(in.nextInt()); 
        } 
        
        if (temp.getMileage() > -1) {
          flag = true;
        }
    } while (!(flag));
    
    flag = false;

    do {
      System.out.print("Enter price: ");

        if (in.hasNextFloat()) {
          temp.setPrice(in.nextFloat());
        } 
        
        if (temp.getPrice() > 0) {
          flag = true;
        }
    } while (!(flag));
    
    flag = false;
    
    if (option == '1') {
      
      Car c = new Car ();
      
      System.out.print("Enter body style: ");
      c.setStyle(in.next());
      
      c.addObject(temp);
    
    } else if (option == '2') {
      
      Truck t = new Truck ();
      
      do {
        System.out.print("\nEnter maximum load weight (min 2800): ");

        if (in.hasNextFloat()) {
          t.setWeight(in.nextFloat());  
        } 
        
        if (t.getWeight() >= minLoadWeight) {
          flag = true;
        }
        
      } while (!(flag));
      
      flag = false;
      
      do {
        System.out.print("Enter truck length in feet (min 10ft): ");

        if (in.hasNextFloat()) {
          t.setLength(in.nextFloat());  
        } 
        
        if (t.getLength() >= minLength) {
          flag = true;
        }
        
      } while (!(flag));
      
      t.addObject(temp);
      
    } else if (option == '3') {
      
      Motorcycle m = new Motorcycle ();
      
      System.out.print("Enter motorcycle type: ");
      m.setType(in.next());
      
      flag = false;
      
      do {
        System.out.print("Enter engine displacement: ");
        
        if (in.hasNextInt()) {
          m.setEngine(in.nextInt());
        }
      
        if (m.getEngine() > 0) {
          flag = true;
        }
      } while (!(flag));
      
      m.addObject(temp);
    }

    System.out.println("Record added.");
  }
  
  public void addEmployeeUserRecord(Scanner in, User temp, int option){
    in = new Scanner(System.in);
	//boolean flag = false;
	int identificationNum = 0;
	String firstName = "";
	String lastName = "";
	
	// Randomly generate: identificationNum = 
	System.out.print("Enter first name: ");
	firstName = in.next();
	
	System.out.print("Enter last name: ");
	lastName = in.next();
  }
  
  public void addCustomerUserRecord(Scanner in, User temp, int option){
	    in = new Scanner(System.in);
		//boolean flag = false;
		int identificationNum = 0;
		String firstName = "";
		String lastName = "";
		
		// Randomly generate: identificationNum = 
		System.out.print("Enter first name: ");
		firstName = in.next();
		
		System.out.print("Enter last name: ");
		lastName = in.next();
	  }

  /**
   * Deletes an object from ArrayList of type Vehicle.
   *
   * @param in reuse Scanner in object
   * @param temp reuse Vehicle object temp
   */
  public void deleteRecord(Scanner in, Vehicle temp) {

    in = new Scanner(System.in);
    int i = 0;

    System.out.print("Enter VIN # to delete record: ");
    String key = in.next();

    for (Vehicle c : Vehicle.getVehicleArray()) {

      if (c.getVin().equalsIgnoreCase(key)) {
        Vehicle.getVehicleArray().remove(i);
        System.out.printf("Record containing VIN # %s removed.", key);
        System.out.print("\n");
        return;
      }
      
      ++i;
    }
    
    System.out.printf("Record with VIN # %s Not Found.\n", key);

  }

  /**
   * Reads a String of characters representing a car license plate number
 input by the user and searches an ArrayList of type Vehicle for the object
 with a matching license plate number. If a match is found the system will
   * print out to the console a message indicating the record was found and
   * all of the objects information. If the a match is not found the system
   * will print out "Record Not Found."
   *
   * @param in reuse Scanner in object
   */
  public void searchRecords(Scanner in) {

    in = new Scanner(System.in);

    System.out.print("Enter license plate #: ");
    String key = in.next();

      for (Vehicle c : Vehicle.getVehicleArray()) {

        if (c.getVin().equalsIgnoreCase(key)) {

          System.out.println("Record Found");
          System.out.printf("VIN Number  " + "  Manufacturer    "
                            + " Model    " + "    Year  " + "     Price\n");
          System.out.printf("   %-7s\t" + "  %-10s\t" + "  %-10s" + "   %4d "
                            + "   $%,10.2f\n", c.getVin(), c.getMake(), 
                            c.getModel(), c.getYear(), c.getPrice());
          return;
        }
      }
      
    System.out.println("Record Not Found.");
  }

  /**
   * Reads two float values input by the user, a minimum value and maximum
   * value. Then an ArrayList of type Vehicle is traversed. If objects are found
 with price values within the bounds of the values input by the user the
 objects information is printed out to the console.
   *
   * @param in reuse Scanner in object
   */
  public void priceRange(Scanner in) {
    in = new Scanner(System.in);
    boolean flag = false;
    float min = 0;
    float max = 0;

    do {
      System.out.print("Enter a minimum price: ");

        if (in.hasNextFloat()) {
          min = in.nextFloat();
          flag = true;
        } 
        else {
          System.out.println("Enter a valid price.");
          in.next();
        }
    } while (!(flag));

    flag = false;
    in = new Scanner(System.in);

    do {
      System.out.print("Enter a maximum price: ");

        if (in.hasNextFloat()) {
          max = in.nextFloat();
          flag = true;
        } 
        else {
          System.out.println("Enter a valid price.");
          in.next();
        }
    } while (!(flag));

    System.out.printf("License Plate  " + "  Manufacturer    "
                      + " Model    " + "    Year  " + "     Price\n");

    for (Vehicle c : Vehicle.getVehicleArray()) {

      if (c.getPrice() >= min && c.getPrice() <= max) {

        System.out.printf("   %-7s\t" + "  %-10s\t" + "  %-10s" + "   %4d "
                          + "   $%,10.2f\n", c.getVin(), c.getMake(), 
                          c.getModel(), c.getYear(), c.getPrice());
      }
    }
  }
}
