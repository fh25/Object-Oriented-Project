/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import java.util.Date;

/**
 *
 * @author fhj
 */
public class Transaction {
  
  /**
   * This transaction's customer id number.
   */
  private int customerId;
  
  /**
   * This transaction's vehicle VIN.
   */
  private String vin;
  
  /**
   * This transaction's sale date.
   */
  private Date saleDate;
  
  /**
   * This transaction's final sales price.
   */
  private float salePrice;
  
  /**
   * This transaction's employee identification.
   */
  private int employeeId;

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Date getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(Date saleDate) {
    this.saleDate = saleDate;
  }

  public float getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(float salePrice) {
    this.salePrice = salePrice;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }
  
  
}
