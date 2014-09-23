/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository; //just a test comment

import java.util.ArrayList;

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
  private static ArrayList<User> userArray = new ArrayList<>();
  
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
  
  public void addUserToArray(){
	  
  }
  
  
}
