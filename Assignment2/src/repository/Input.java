package repository;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

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
  //public void addRecord(Scanner in, Car temp) {
  
  public void addCarRecord (Scanner in) {  
    
    Car temp = new Car ();
    
    boolean flag = false;
    
    String key;
    
    int minYear = 1949,
        maxYear = 2017;

    System.out.print("\nEnter 5 character VIN number: ");
    key = in.next(); 

    for (Vehicle c : Vehicle.getVehicleArray()) {
      if (key.equalsIgnoreCase(c.getVin())) {
        System.out.print("Duplicate found.\nEnter VIN number: ");
        key = in.next();
      }
    }
    
    temp.setVin(key);

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
      temp.addToVehicleArray(temp);
    
    System.out.println("Record added.");
  }
  
  /**
   * Creates a temporary object of type Truck setting its attributes to values
 input by the user. The temporary object is then added to ArrayList of
 type Truck.
   *
   * @param in reuse Scanner in object
   * @param temp uses Truck object temp
   */
  public void addTruckRecord(Scanner in) {
    
    Truck temp = new Truck ();
    
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
      
    do {
      System.out.print("Enter maximum load weight (min 2800): ");

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
    temp.addToVehicleArray(temp);
      
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
  public void addBikeRecord(Scanner in) {
    
    Motorcycle temp = new Motorcycle ();
    
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
    temp.addToVehicleArray(temp);
    
    System.out.println("Record added.");
  }
  /**
   * Creates a temporary object of type Employee and sets its attributes to values input by
   * the user. It then calls a method of the class Employee to add he object to an ArrayList
   * of type User.
   * @param in Scanner for user input
   */
  public void addEmployeeUserRecord(Scanner in){    
  
	Employee e  = new Employee();	
	
	e.setId(Console.incrementCounter());
	
	System.out.print("Enter the employee's first name: ");	
	e.setFirstName(in.next());
	
	System.out.print("Enter the employee's last name: ");		
	e.setLastName(in.next());
	
	boolean match = true;
	
	do {
		System.out.print("Enter the employee's salary: ");
		if (in.hasNextFloat()) {
			e.setSalary(in.nextFloat());
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
	e.setAccountNumber(in.nextInt());
	match1 = true;
	}
	else
	{
		System.out.print("Invalid input.\n");
		match1 = false;
		in.next();
	}
	}while(!match1);
	
	e.addEmployeeToEmployeeArray(e);	
  }
  
  /**
   * Creates a temporary object of the type Customer and sets its attributes to values input
   * by the user. It then calls a methof of the class Customer to add the object to an 
   * ArrayList of type User.
   * @param in
   */
  public void addCustomerUserRecord(Scanner in){
	    boolean match = true;
		Customer c = new Customer();		
		
		c.setId(Console.incrementCounter()); 
		System.out.print("Enter the customer's first name: ");
		c.setFirstName(in.next());
		
		System.out.print("Enter the customer's last name: ");
		c.setLastName(in.next());
		
		do
		{		
		System.out.print("Enter the customer's phone number: ");
		if( in.hasNext())
		{
			c.setPhoneNumber(in.next());
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
		c.setDriverLicense(in.nextInt());
		match = true;
		}
		else
		{
			System.out.print("Invalid drivers license number.\n");
			match = false;
			in.next();
		}
		}while(!match);
		
		c.addCustomerToCustomerArray(c);	
		
	  }

  /**
   * Deletes an object from ArrayList of type Vehicle.
   *
   * @param in reuse Scanner in object
   */
  public void deleteRecord(Scanner in) {

    int i = 0,
        j = 0,
        k = 0;

    System.out.print("Enter VIN # to delete record: ");
    String key = in.next();

    for (Car c : Car.getCarArray()) {

      if (c.getVin().equalsIgnoreCase(key)) {
        Car.getCarArray().remove(i);
        System.out.printf("Record containing VIN # %s removed.", key);
        System.out.print("\n");
        return;
      }
      
      ++i;
    }
    
    for (Truck t : Truck.getTruckArray()) {

      if (t.getVin().equalsIgnoreCase(key)) {
        Truck.getTruckArray().remove(i);
        System.out.printf("Record containing VIN # %s removed.", key);
        System.out.print("\n");
        return;
      }
      
      ++j;
    }
    
    for (Motorcycle m : Motorcycle.getMotorcycleArray()) {

      if (m.getVin().equalsIgnoreCase(key)) {
        Motorcycle.getMotorcycleArray().remove(i);
        System.out.printf("Record containing VIN # %s removed.", key);
        System.out.print("\n");
        return;
      }
      
      ++k;
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
  public void priceRange(Scanner in, int option) {
 
    boolean flag = false;
    float min = 0;
    float max = 0;

    do {
      System.out.print("Enter a minimum price: ");

        if (in.hasNextFloat()) {
          min = in.nextFloat();
          flag = true;
        } else {
          System.out.println("Enter a valid price.");
          in.next();
        }
    } while (!(flag));

    flag = false;

    do {
      System.out.print("Enter a maximum price: ");

        if (in.hasNextFloat()) {
          max = in.nextFloat();
          flag = true;
        } else {
          System.out.println("Enter a valid price.");
          in.next();
        }
    } while (!(flag));
    
    switch (option) {
      case '1':
        carSearch (min, max);
        break;
      case '2':
        truckSearch (min, max);
        break;
      case '3':
        bikeSearch (min, max);
        break;
      default:
        break;
    }
  }
  
  public void carSearch (float min, float max) {
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model     " 
                      + " Year  " + "  Price " + "    Mileage    " + "\n");

    for (Car c : Car.getCarArray()) {

      if (c.getPrice() >= min && c.getPrice() <= max) {

        System.out.printf("  %-7s\t" + "%-10s\t" + " %-10s" + "  %4d "
                          + "     $%,10.2f\n", c.getVin(), c.getMake(), 
                          c.getModel(), c.getYear(), c.getPrice(), c.getMileage());
      }
    }
  }
  public int getsearchIDNumber(Scanner in){
	  int searchID = 0;
	  boolean isInt = true;
	  do{
		  System.out.print(" Enter a valid ID number: ");
		  if( in.hasNextInt()){
		    searchID = in.nextInt();
		    isInt = true;
		  }
		  else{
			  System.out.print("Invalid entry.\n");
			  isInt = false;			  
			  in.next();
		  }			  
	  }while( !isInt );
	  return searchID;
  
  public void truckSearch (float min, float max) {
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model     " 
                      + " Year  " + "  Price " + "    Mileage    " + "\n");

    for (Truck t : Truck.getTruckArray()) {

      if (t.getPrice() >= min && t.getPrice() <= max) {

        System.out.printf("  %-7s\t" + "%-10s\t" + " %-10s" + "  %4d "
                          + "     $%,10.2f\n", t.getVin(), t.getMake(), 
                          t.getModel(), t.getYear(), t.getPrice(), t.getMileage());
      }
    }
  }
  
  public void bikeSearch (float min, float max) {
    System.out.printf("VIN Number  " + "  Manufacturer    " + " Model     " 
                      + " Year  " + "  Price " + "    Mileage    " + "\n");

    for (Motorcycle m : Motorcycle.getMotorcycleArray()) {

      if (m.getPrice() >= min && m.getPrice() <= max) {

        System.out.printf("  %-7s\t" + "%-10s\t" + " %-10s" + "  %4d "
                          + "     $%,10.2f\n", m.getVin(), m.getMake(), 
                          m.getModel(), m.getYear(), m.getPrice(), m.getMileage());
      }
    }
  }
}
