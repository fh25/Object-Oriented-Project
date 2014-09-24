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
public class Customer extends User {
  
  /**
   * This customer's phone number.
   */
  private String phoneNumber;
  
  /**
   * This customer's drivers license number.
   */
  private int driverLicense;

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getDriverLicense() {
    return driverLicense;
  }

  public void setDriverLicense(int driverLicense) {
    this.driverLicense = driverLicense;
  }  
}
