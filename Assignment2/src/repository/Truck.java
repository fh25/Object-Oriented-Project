/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

/**
 *
 * @author fhj
 */
public class Truck extends Vehicle {
  
  /**
   * This truck's weight.
   */
  private float weight;
  
  /**
   * This truck's length.
   */
  private float length;

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public float getLength() {
    return length;
  }

  public void setLength(float length) {
    this.length = length;
  }
  
}
