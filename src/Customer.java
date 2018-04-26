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
public class Customer implements Comparable<Customer>{
     // private data fields
    private String fName, lName;
    private int id = -999;
    private int rewardPoints;
    private int age;
    private ArrayList<Transaction> tranList = new ArrayList();
    public Customer() {

    }

    // Full-argument constructors
    public Customer(String fName, String lName, int id, int age, int rewardPoints) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.age = age;
        this.rewardPoints = rewardPoints;
    }

    // Getters
    public String getFullName() {
        return fName + " " + lName;
    }

    public int getId() {
        return id;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Transaction> getTranList() {
        return tranList;
    }

    // Setters
    public void setFullName(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public void setAge(int age) {
        this.age = age;
    }
     // method to add reward points to a customer
    public void addRewardPoints(int rewardPoints) {
        //Add reward points to the record
        this.rewardPoints += rewardPoints;
    }

    // addTransaction method which throws underAgeException exception
    
    public void addTransaction(Transaction tran) throws UnderAgeException {
        
        if (this.age < 18) {
         throw new UnderAgeException("Exception: Sorry! Your are not allowed to watch this .");
        }
        else
            tranList.add(tran);
    }

 //override the compareto method
   
    public String printTransactions() {
        if (tranList.isEmpty()) {
            return "NONE...";
        } else {
            String s = "";
            for (Transaction t : tranList) {
                s += t.toString() + "\r\n";
            }
            return s;
        }
    }

    @Override
    public String toString() {
        String s = "";
        if (this.getId() != -999) {
            s = "Customer Name: " + this.getFullName() + "\r\nID: " + this.getId() + "\r\nAge: " + this.getAge()+
                    "\r\nReward Points: " + this.getRewardPoints();
        } else {
            s += "\r\nNon Registered Customer";
        }
        return s;
    }

 
    @Override
    public int compareTo(Customer t) {
    if(id>t.getId())
    return 1;
    else if(id<t.getId())
    return -1;
    else return 0;
        }
        
    }

   



