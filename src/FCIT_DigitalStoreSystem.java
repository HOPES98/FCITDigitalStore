/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaa
 */
import java.util.*;
import java.io.*;

public class FCIT_DigitalStoreSystem {

    public static ArrayList<Customer> customersList = new ArrayList<>();
    public static ArrayList<Item> digitalItems = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //create a file (Use input file) and Created print file ... 
        File theFileInput = new File("input.txt");
        //-------------------------------------------
        // Check if fileInput file exists
        if (!theFileInput.exists()) {
            System.out.println("The File Dose not Exists ..");
            System.exit(0);
        }//if exists
        //-------------------------------------------
        //create input and output for the file
        Scanner input = new Scanner(theFileInput);
        PrintWriter output = new PrintWriter("CommandsOutput.txt");
        PrintWriter output1 = new PrintWriter("Transactions.txt");
        //------------------------------------------
        //start adding

         while (input.hasNext()) {
            switch (input.next()) {
                case "Add_Customer":
                    output.println("******** COMMAND: ADD_CUSTOMER ********");
                    String FirstName = input.next();
                    String LasttName = input.next();
                    int CustomerID = Integer.parseInt(input.next());
                    int CustomerAge = Integer.parseInt(input.next());
                    int RewardedPoints = Integer.parseInt(input.next());
                    Customer c = new Customer(FirstName, LasttName, CustomerID, CustomerAge, RewardedPoints);
                    customersList.add(c);
                    output.println(c.toString());
                    output.println("---------------------------------------------------------------------");
                    continue;
                case "Add_Movie":
                    output.println("******** COMMAND: ADD_MOVIE ********");
                    String MovieName = input.next();
                    int MoviePrice = Integer.parseInt(input.next());
                    Movie m = new Movie(MovieName, MoviePrice);
                    digitalItems.add(m);
                    output.println(m.toString());
                    output.println("---------------------------------------------------------------------");
                    break;
                case "Add_Documentary":
                    output.println("******** COMMAND: ADD_DOCUMENTARY ********");
                    String DocumentaryName = input.next();
                    int DocumentaryPrice = Integer.parseInt(input.next());
                    Documentary d = new Documentary(DocumentaryName, DocumentaryPrice);
                    digitalItems.add(d);
                    output.println(d.toString());
                    output.println("---------------------------------------------------------------------");
                    break;
                case "Add_Series":
                    output.println("******** COMMAND: ADD_SERIES ********");
                    String SeriesName = input.next();
                    int SeriesPrice = Integer.parseInt(input.next());
                    int SeasonNumber = Integer.parseInt(input.next());
                    Series s = new Series(SeriesName, SeriesPrice, SeasonNumber);
                    digitalItems.add(s);
                    output.println(s.toString());
                    output.println("---------------------------------------------------------------------");
                    break;
                case "Order_Series":
                    int TransactionID2 = Integer.parseInt(input.next());
                    String NameOfTheSeries = input.next();
                    int CustomerID2 = Integer.parseInt(input.next());
                    int Season = Integer.parseInt(input.next());
                    ///////////////////

                    for (int i = 0; i < digitalItems.size(); i++) {
                        if (digitalItems.get(i).getName().equalsIgnoreCase(NameOfTheSeries)) {
                            for (int j = 0; j < customersList.size(); j++) {
                                int id = customersList.get(j).getId();
                                if (id == CustomerID2) {
                                    Transaction movieOrder = new Transaction(TransactionID2, customersList.get(j), digitalItems.get(i));
                                    try {
                                        customersList.get(j).addTransaction(movieOrder);
                                        output.println("******** COMMAND: ORDER_SERIES ********");
                                        output.println(customersList.get(j).toString());
                                        output.println(movieOrder.toString());
                                        output.println("---------------------------------------------------------------------");
                                    } catch (UnderAgeException e) {
                                        output.println("******** COMMAND: ORDER_SERIES ********");
                                        output.println(e.getMessage());
                                        output.println("---------------------------------------------------------------------");
                                    }
                                }
                            }
                        }
                    }

                    break;
                case "Order_Movie":

                    int TransactionID = Integer.parseInt(input.next());
                    String NameOfTheMovie = input.next();
                    int CustomerID3 = Integer.parseInt(input.next());
                    for (int i = 0; i < digitalItems.size(); i++) {
                        if (digitalItems.get(i).getName().equalsIgnoreCase(NameOfTheMovie)) {
                            for (int j = 0; j < customersList.size(); j++) {
                                int id = customersList.get(j).getId();
                                if (id == CustomerID3) {
                                    Transaction movieOrder = new Transaction(TransactionID, customersList.get(j), digitalItems.get(i));
                                    try {
                                        customersList.get(j).addTransaction(movieOrder);
                                        output.println("******** COMMAND: ORDER_MOVIE ********");
                                        output.println(customersList.get(j).toString());
                                        output.println(movieOrder.toString());
                                        output.println("---------------------------------------------------------------------");
                                    } catch (UnderAgeException e) {
                                        output.println("******** COMMAND: ORDER_MOVIE ********");
                                        output.println(e.getMessage());
                                        output.println("---------------------------------------------------------------------");
                                    }
                                }
                            }
                        }
                    }
                    break;
                case "Order_Documentary":
                    int TransactionID1 = Integer.parseInt(input.next());
                    String NameOfTheDocumentary = input.next();
                    int CustomerID1 = Integer.parseInt(input.next());

                    for (int i = 0; i < digitalItems.size(); i++) {
                        if (digitalItems.get(i).getName().equalsIgnoreCase(NameOfTheDocumentary)) {
                            for (int j = 0; j < customersList.size(); j++) {
                                int id = customersList.get(j).getId();
                                if (id == CustomerID1) {
                                    Transaction movieOrder = new Transaction(TransactionID1, customersList.get(j), digitalItems.get(i));

                                    customersList.get(j).getTranList().add(movieOrder);
                                    output.println("******** COMMAND: ORDER_DOCUMENTARY********");
                                    output.println(customersList.get(j).toString());
                                    output.println(movieOrder.toString());
                                    output.println("---------------------------------------------------------------------");

                                }
                            }
                        }
                    }
                    break;
                case "Print_Transactions":
                    output1.println("******** COMMAND: PRINT_TRANSACTIONS ********");
                    output1.println("######################################################################");
                    Collections.sort(customersList);
                    for (int i = 0; i < customersList.size(); i++) {

                        Collections.sort(customersList.get(i).getTranList());
                        output1.println(customersList.get(i).toString());
                        if (customersList.get(i).getTranList().size() == 0) {
                            output1.println("NONE...");
                        } else {
                            for (int j = 0; j < customersList.get(i).getTranList().size(); j++) {
                                output1.println("Transaction ID: " + customersList.get(i).getTranList().get(j).getTranID() + "	Total Cost: " + customersList.get(i).getTranList().get(j).getCost());
                            }
                        }
                        output1.println("######################################################################");
                    }
                    break;
                case "END":
                    output.println("Thanks for using FCIT Digital System..");
                    input.close();
                    output.close();
                    output1.close();

            }
        }
        input.close();
        output.close();
        output1.close();

    }
}
