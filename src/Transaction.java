/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaa
 */
import java.util.ArrayList;
public class Transaction implements Comparable<Transaction>{
      private int tranID;
    private Customer customer;
    private Item item;
    private double cost;
   
    
    public Transaction(int tranID, Customer customer, Item item) {
        this.tranID = tranID;
        this.customer = customer;
        this.item =  item;
        cost = calculateCost();
        this.newPoints();
    }
    
    public Transaction(int tranID, Customer customer) {
        this.tranID = tranID;
        this.customer = customer;
        this.newPoints();
    }
    
    private double calculateCost(){
        return this.item.getPrice();
    }
    /*
  if the transaction total cost is greater than 100,
then the user will gain an extra 10 points, which will be added to his rewarded points. 
    */

    private void newPoints(){
        if (cost>100 && customer.getId()!=-999)
            customer.addRewardPoints(10);
    }

    public int getTranID() {
        return tranID;
    }

    public void setTranID(int tranID) {
        this.tranID = tranID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    //override the compareto method
    /*
    The Transaction class must implement the comparable interface and override the
compareTo method in order to sort the transactions according to their ids. 
    */
   @Override
    public String toString() {
        String s = "Transaction ID: " + tranID  + "\tTotal Cost: " +cost;
        return s;
    }
    
    
    @Override
    public int compareTo(Transaction t) {
    if(tranID>t.tranID)
    return 1;
    else if(tranID<t.tranID)
    return -1;
    else return 0;
        }
    
}
