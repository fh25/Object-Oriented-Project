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
        displacement = 0;
    String vin, 
           make, 
           model,
           style,
           type;
    int year = 0, 
        mileage = 0;
    float price = 0,
          loadWeight = 0,
          length = 0;

    System.out.print("\nEnter 5 character VIN number: ");
    vin = in.next();

    for (Vehicle c : Vehicle.getVehicleArray()) {
      while (vin.equalsIgnoreCase(c.getVin())) {
        System.out.print("Duplicate found.\nEnter license plate number: ");
        vin = in.next();
      }
    }

    System.out.print("Enter make: ");
    make = in.next();

    System.out.print("Enter model: ");
    model = in.nextLine();

    do {
      System.out.print("Enter year between 1950-2016: ");

        if (in.hasNextInt()) {
          year = in.nextInt();
        }

        if (year < maxYear && year > minYear) {
          flag = true;
        }
    } while (!(flag));

    flag = false;
    
    do {
      System.out.print("Enter mileage: ");
      
        if (in.hasNextInt()) {
          mileage = in.nextInt();
        } 
        
        if (mileage > -1) {
          flag = true;
        }
    } while (!(flag));
    
    flag = false;

    do {
      System.out.print("Enter price: ");

        if (in.hasNextFloat()) {
          price = in.nextFloat();
          flag = true;
        } else {
          System.out.println("Enter a valid price.");
          in.next();
        }
    } while (!(flag));
    
    flag = false;
    
    if (option == '1') {
      
      System.out.print("\nSelect body style:\n"
                     + "\t1. Coupe\n"
                     + "\t2. Sedan\n"
                     + "\t3. Mini-Van\n"
                     + "\t4. SUV\n"
                     + "Your choice: ");
    
      char selection = in.next().charAt(0);
    
        do {
          switch (selection) {
            case '1': 
              style = "Coupe"; 
              break;
            case '2':
              style = "Sedan";
              break;
            case '3':
              style = "Mini-Van"; 
              break;
            case '4':
              style = "SUV";
              break;
            case '5':
              break;
            default : 
              System.out.printf("Not a valid option%n", selection);
          }
        } while (selection != '5');
        
    } else if (option == '2') {
      
      do {
        System.out.print("\nEnter maximum load weight (min 2800): ");

        if (in.hasNextFloat()) {
          loadWeight = in.nextFloat();  
        } 
        
        if (loadWeight >= 2800) {
          flag = true;
        }
        
      } while (!(flag));
      
      flag = false;
      
      do {
        System.out.print("\nEnter truck length in feet (min 12ft): ");

        if (in.hasNextFloat()) {
          length = in.nextFloat();  
        } 
        
        if (length >= 12) {
          flag = true;
        }
        
      } while (!(flag));
      
    } else if (option == '3') {
      
      System.out.print("\nSelect body style:\n"
                     + "\t1. Coupe\n"
                     + "\t2. Sedan\n"
                     + "\t3. Mini-Van\n"
                     + "\t4. SUV\n"
                     + "Your choice: ");
    
      char selection = in.next().charAt(0);
    
        do {
          switch (selection) {
            case '1': 
              style = "Coupe"; 
              break;
            case '2':
              style = "Sedan";
              break;
            case '3':
              style = "Mini-Van"; 
              break;
            case '4':
              style = "SUV";
              break;
            case '5':
              break;
            default : 
              System.out.printf("Not a valid option%n", selection);
          }
        } while (selection != '5');
      
    }

    temp.addToArray(vin, make, model, year, mileage, price);

    System.out.println("Record added.");
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
          System.out.printf("License Plate  " + "  Manufacturer    "
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
