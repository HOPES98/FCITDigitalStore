/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaa
 */
public interface Discountable {
    /*
    Add a new Discountable interface which contains:
  A constant discountRate = 0.2
 An abstract method called calculateDisPrice
    */
   public double discountRate = 0.2;
    public double calculateDisPrice();
}

