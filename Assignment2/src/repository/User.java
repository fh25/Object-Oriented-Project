/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository; //just a test comment

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fhj
 */
public class User {
  
  /**
   * This user's identification number.
   */
  private int id;
  
  /**
   * This user's first name.
   */
  private String firstName;
  
  /**
   * This user's last name.
   */
  private String lastName;
  
  /**
   * ArrayList of type User
   */
  private static ArrayList<Employee> userArrayEmployee = new ArrayList<>();
  private static ArrayList<Customer> userArrayCustomer = new ArrayList<>();
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public static ArrayList<Employee> getUserArrayEmployee() {
	return userArrayEmployee;
}

public static void setUserArrayEmployee(ArrayList<Employee> userArrayEmployee) {
	User.userArrayEmployee = userArrayEmployee;
}

public static ArrayList<Customer> getUserArrayCustomer() {
	return userArrayCustomer;
}

public static void setUserArrayCustomer(ArrayList<Customer> userArrayCustomer) {
	User.userArrayCustomer = userArrayCustomer;
}

public void addEmployeeToEmployeeArray(Employee e){
	  userArrayEmployee.add(e);
  }
  
  public void addCustomerToCustomerArray(Customer c){
	  userArrayCustomer.add(c);
  }
  
  public void printUserEmployeeArray(){	  
	  for( Employee e : getUserArrayEmployee() ){
		  
		 System.out.printf("% 2d  " +  "%-15.10s" +  "%-15.30s" + "$%,.2f" + "% 15d\n",  e.getId(), e.getFirstName(), e.getLastName(), e.getSalary(), e.getAccountNumber() );
	  }
  }
  public void printUserArrayHeader(){
	  
	  System.out.printf("ID" + "  First" + "          Last" + "           Salary" + "                Account\n");
	  
  } 

  public void printUserCustomerArray(){
	  for( Customer c : getUserArrayCustomer()){
		  System.out.printf("% 2d  " +  "%-15.10s" +  "%-15.30s" + "%-15d" + "%15s\n",  c.getId(), c.getFirstName(), c.getLastName(), c.getDriverLicense(), c.getPhoneNumber() );
	  }
  }
  
  public void printUserCustomerHeader(){
	  System.out.printf("ID" + "  First" + "          Last" + "           DL Number" + "              Phone\n");
  }    
}

