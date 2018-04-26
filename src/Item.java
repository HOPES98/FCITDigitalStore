/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaa
 */
public  class Item {
    private String name;// name of the digital item
    private double Price;// The price of the digital item

    // full-argument constructor
    public Item(String name, double Price) {
        this.name = name;
        this.Price = Price;
    }
    //Getters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return Price;
    }


    //Setter
    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
    @Override
    public String toString() {
        return  "Name: " + name + "\r\nPrice: " + Price + "\r\n";
    }
}

