/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaa
 */
public class Series extends Item implements Discountable{
    //data field
    private int season;

   
    //The constructor of series class
    public Series(String name, double price, int season) {
        super(name, price);
        super.setPrice(calculateDisPrice());
        this.season = season;
        
    }

   @Override
    public String toString() {
        return super.toString() + "\r\nSeason: " + season;
    }    

    @Override
    public double calculateDisPrice() {
        // calculate the price:
        return (super.getPrice() - super.getPrice()*discountRate);    
    }
}
