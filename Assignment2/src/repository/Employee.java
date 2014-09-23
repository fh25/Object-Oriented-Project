/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import java.util.Scanner;

/**
 *
 * @author fhj
 */
public class Employee extends User {
  
  /**
   * This employee's salary.
   */
  private float salary;
  
  /**
   * This employee's direct deposit bank account number.
   */
  private int accountNumber;

  /**
   * 
   * @return Returns this employee's salary.
   */
  public float getSalary() {
    return salary;
  }
/**
 * 
 * @param salary the value of this employee's salary.
 */
  public void setSalary(float salary) {
    this.salary = salary;
  }
/**
 * 
 * @return this employee's account number.
 */
  public int getAccountNumber() {
    return accountNumber;
  }
 /**
  * 
  * @param accountNumber this employees account number.
  */

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }
  
  public void addEmployeeRecord(int id, String firstName, String lastName, float salary, int bankAccount){
	  
	  Employee temp = new Employee();	  
	  
	  temp.setId(id);
	  temp.setFirstName(firstName);
	  temp.setLastName(lastName);
	  temp.accountNumber = bankAccount;
	  temp.salary = salary;
	 
	  temp.addEmployeeToArray(temp);
  }
  
}


