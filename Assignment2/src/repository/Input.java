package repository;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Class Input provides methods to add, delete, and search records of an
 ArrayList of type Vehicle using provided input from the user.
 *
 * @author Fernando Herrera and Leah Weiland
 *
 */
public class Input {

  /**
   * Creates a temporary object of type Car setting its attributes to values
 input by the user. The temporary object is then added to ArrayList of
 type Car.
   *
   * @param in reuse Scanner in object
   * @param temp reuses Vehicle object temp
   */
  public void addRecord(Scanner in, Car temp) {
    in = new Scanner(System.in);
    
    boolean flag = false;
    
    InputMismatchException inputError;
    
    int minYear = 1949,
        maxYear = 2017;

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
      
    System.out.print("Enter body style: ");
      temp.setStyle(in.next());
      
      temp.addObject(temp);
  
    System.out.println("Record added.");
  }
  
  /**
   * Creates a temporary object of type Truck setting its attributes to values
 input by the user. The temporary object is then added to ArrayList of
 type Truck.
   *
   * @param in reuse Scanner in object
   * @param temp reuses Vehicle object temp
   */
  public void addRecord(Scanner in, Truck temp) {
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
      
    do {
      System.out.print("\nEnter maximum load weight (min 2800): ");

      if (in.hasNextFloat()) {
        temp.setWeight(in.nextFloat());  
      } 
        
      if (temp.getWeight() >= minLoadWeight) {
        flag = true;
      }
        
    } while (!(flag));
      
    flag = false;
      
    do {
      System.out.print("Enter truck length in feet (min 10ft): ");

      if (in.hasNextFloat()) {
        temp.setLength(in.nextFloat());  
      } 
      
      if (temp.getLength() >= minLength) {
        flag = true;
      }
        
    } while (!(flag));
      
    temp.addObject(temp);
      
    System.out.println("Record added.");
  }
  
  /**
   * Creates a temporary object of type Motorcycle setting its attributes to values
 input by the user. The temporary object is then added to ArrayList of
 type Motorcycle.
   *
   * @param in reuse Scanner in object
   * @param temp reuses Vehicle object temp
   */
  public void addRecord(Scanner in, Motorcycle temp) {
    in = new Scanner(System.in);
    
    boolean flag = false;
    
    int minYear = 1949,
        maxYear = 2017;

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
      
    System.out.print("Enter motorcycle type: ");
    temp.setType(in.next());
      
    flag = false;
     
    do {
      System.out.print("Enter engine displacement: ");
        
      if (in.hasNextInt()) {
        temp.setEngine(in.nextInt());
      }
      
      if (temp.getEngine() > 0) {
        flag = true;
      }
    } while (!(flag));
      
    temp.addObject(temp);
    
    System.out.println("Record added.");
  }
  /**
   * Creates a temporary object of type Employee and sets its attributes to values input by
   * the user. It then calls a method of the class Employee to add he object to an ArrayList
   * of type User.
   * @param in Scanner for user input
   */
  public void addEmployeeUserRecord(Scanner in){    
    in = new Scanner(System.in);
	Employee temp  = new Employee();
	int identificationNum = 0;
	String firstName = "";
	String lastName = "";
	float salary = 0;
	int bankAccount = 0;	
	
	identificationNum = Console.incrementCounter();
	//try
	//{
	System.out.print("Enter the employee's first name: ");	
	firstName = in.next();
	//}catch(IOException ){
	  // in.hasNext();
	//}
	

	System.out.print("Enter the employee's last name: ");		
	lastName = in.next();
	boolean match = true;
	
	do {
		System.out.print("Enter the employee's salary: ");
		if (in.hasNextFloat()) {
			salary = in.nextFloat();
			match = true;
		}
		else
		{
			System.out.print("Invalid input.\n");
			match = false;
			in.next();
		}
	} while (!match);	
	
	
	boolean match1 = true;
	
	do{	
	System.out.print("Enter the employee's direct deposit bank account number: ");
	if(in.hasNextInt())
	{
	bankAccount = in.nextInt();
	match1 = true;
	}
	else
	{
		System.out.print("Invalid input.\n");
		match1 = false;
		in.next();
	}
	}while(!match1);
	
	temp.addEmployeeRecord(identificationNum, firstName, lastName, salary, bankAccount);	
	
  }
  /**
   * Creates a temporary object of the type Customer and sets its attributes to values input
   * by the user. It then calls a methof of the class Customer to add the object to an 
   * ArrayList of type User.
   * @param in
   */
  public void addCustomerUserRecord(Scanner in){
	    in = new Scanner(System.in);
		Customer c = new Customer();
		int identificationNum = 0;
		String firstName = "";
		String lastName = "";
		String phoneNumber = "";
		int driversLicense = 0;
		boolean match = true;
		
		identificationNum = Console.incrementCounter();
		System.out.print("Enter the customer's first name: ");
		firstName = in.next();
		
		System.out.print("Enter the customer's last name: ");
		lastName = in.next();
		
		do
		{		
		System.out.print("Enter the customer's phone number: ");
		if( in.hasNext())
		{
			phoneNumber = in.next();
			match = true;
		}
		else
		{
			System.out.print("Invalid phone number.\n");
			match = false;
			in.next();
		}		
		}while(!match);
		
		match = true;
		do
		{
			
		System.out.print("Enter the customer's drivers license number: ");
		if(in.hasNextInt())
		{
		driversLicense = in.nextInt();
		match = true;
		}
		else
		{
			System.out.print("Invalid drivers license number.\n");
			match = false;
			in.next();
		}
		}while(!match);
		
		c.addCustomerRecord(identificationNum, firstName, lastName, driversLicense, phoneNumber);
		
		//in.close();
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
