

import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaa
 */
public class FCIT_DigitalStore_Frame extends javax.swing.JFrame {
     public static ArrayList<Customer> customersList = new ArrayList<>();
    public static ArrayList<Item> digitalItems = new ArrayList<>();

    /**
     * Creates new form FCIT_DigitalStore_Frame
     */
    public FCIT_DigitalStore_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBExit = new javax.swing.JButton();
        jBClear = new javax.swing.JButton();
        jBSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTPoints = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Welcome to FCIT Digital Store System");

        jLabel2.setText("Customer ID:");

        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jBExit.setText("Exit");
        jBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitActionPerformed(evt);
            }
        });

        jBClear.setText("Clear");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });

        jBSearch.setText("Search");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExit)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExit)
                    .addComponent(jBClear)
                    .addComponent(jBSearch))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel3.setText("Custoemer Name:");

        jTName.setEnabled(false);

        jLabel4.setText("Rewarded Points:");

        jTPoints.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDActionPerformed

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        // TODO add your handling code here:
        boolean Customer= false ;
        int i = 0;
       
        if(jTID.getText()==null){//message to fill emty field
        JOptionPane.showMessageDialog(null, "Enter a vustomer ID","Error",JOptionPane.ERROR_MESSAGE);
        jTID.requestFocus();
        
        }else{
                
        for ( i = 0; i <customersList.size(); i++) {
            if(jTID.getText().equals(customersList.get(i).getId())){
            Customer = true;
            break;
            }
            else{
            JOptionPane.showMessageDialog(null, "Customer no Found","Error",JOptionPane.ERROR_MESSAGE);
            jTID.requestFocus();
            return;
            
            }
            
        }
        }
        
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        // TODO add your handling code here:
        jTName.setText("");
        jTPoints.setText("");
        jTID.setText("");
    }//GEN-LAST:event_jBClearActionPerformed

    private void jBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FCIT_DigitalStore_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCIT_DigitalStore_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCIT_DigitalStore_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCIT_DigitalStore_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCIT_DigitalStore_Frame().setVisible(true);
            }
        });
        
        File inputFile = new File("input.txt");//openinning unput file to read from
        // ONE: basic preparatioins for programming:
        //a.check the existence of files
        if (!inputFile.exists()) {
            System.out.println("The File does not exist...");
            System.exit(0);
        }
        //b.create scanner for the input file
        Scanner input = new Scanner(inputFile);
        
        //c.PrintWriter for both Command output and transactions prints
        PrintWriter output1 = new PrintWriter("Commandsoutput1.txt");
        PrintWriter output2 = new PrintWriter("Transactions.txt");
        
        //TWO: start reading the files and store data..
         while (input.hasNext()) {
            switch (input.next()) {
                case "Add_Customer":{
                    output1.println("******** COMMAND: ADD_CUSTOMER ********");
                    String fisrtName = input.next();
                    String lastName = input.next();
                    int customerId = Integer.parseInt(input.next());
                    int customerAge = Integer.parseInt(input.next());
                    int points = Integer.parseInt(input.next());
                    Customer customer = new Customer(fisrtName, lastName, customerId, customerAge, points);                    
                    customersList.add(customer);
                    output1.println(customer.toString());
                    output1.println("---------------------------------------------------------------------");
                }
                    break;
                
                case "Add_Movie":{
                    output1.println("******** COMMAND: ADD_MOVIE ********");
                    String movieName = input.next();
                    int moviePrice = Integer.parseInt(input.next());
                    Movie movie = new Movie(movieName, moviePrice);
                    digitalItems.add(movie);
                    output1.println(movie.toString());
                    output1.println("---------------------------------------------------------------------");
                }
                    break;
                case "Add_Documentary":{
                    output1.println("******** COMMAND: ADD_DOCUMENTARY ********");
                    String documentaryName = input.next();
                    int documentaryPrice = Integer.parseInt(input.next());
                    Documentary documantary = new Documentary(documentaryName, documentaryPrice);
                    digitalItems.add(documantary);
                    output1.println(documantary.toString());
                    output1.println("---------------------------------------------------------------------");
                }
                    break;
                case "Add_Series":{
                    output1.println("******** COMMAND: ADD_SERIES ********");
                    String seriesName = input.next();
                    int seriesPrice = Integer.parseInt(input.next());
                    int season = Integer.parseInt(input.next());
                    Series s = new Series(seriesName, seriesPrice, season);
                    digitalItems.add(s);
                    output1.println(s.toString());
                    output1.println("---------------------------------------------------------------------");
                }
                    break;
                case "Order_Series":{
                    int seriesOrderId = Integer.parseInt(input.next());
                    String seriesOrderName = input.next();
                    int customerSeriesId = Integer.parseInt(input.next());
                    int seasonSeries = Integer.parseInt(input.next());
                    

                    for (int i = 0; i < digitalItems.size(); i++) {//itrating items array to search
                        if (digitalItems.get(i).getName().equalsIgnoreCase(seriesOrderName)) {
                            for (int j = 0; j < customersList.size(); j++) {
                                int id = customersList.get(j).getId();
                                if (id == customerSeriesId) {
                                    //crearting new movie order to validate 
                                    Transaction movieOrder = new Transaction(seriesOrderId, customersList.get(j), digitalItems.get(i));
                                    try {
                                        customersList.get(j).addTransaction(movieOrder);
                                        output1.println("******** COMMAND: ORDER_SERIES ********");
                                        output1.println(customersList.get(j).toString());
                                        output1.println(movieOrder.toString());
                                        output1.println("---------------------------------------------------------------------");
                                    } catch (UnderAgeException exception) {
                                        output1.println("******** COMMAND: ORDER_SERIES ********");
                                        output1.println(exception.getMessage());
                                        output1.println("---------------------------------------------------------------------");
                                    }
                                }
                            }
                        }
                    }
                }
                    break;
                case "Order_Movie":
                    int movieTransactionId = Integer.parseInt(input.next());
                    String movieNameTransaction = input.next();
                    int movieCustomerId = Integer.parseInt(input.next());
                    for (int i = 0; i < digitalItems.size(); i++) {
                        if (digitalItems.get(i).getName().equalsIgnoreCase(movieNameTransaction)) {
                            for (int j = 0; j < customersList.size(); j++) {
                                int id = customersList.get(j).getId();
                                if (id == movieCustomerId) {
                                    Transaction movieOrder = new Transaction(movieTransactionId, customersList.get(j), digitalItems.get(i));
                                    try {
                                        customersList.get(j).addTransaction(movieOrder);
                                        output1.println("******** COMMAND: ORDER_MOVIE ********");
                                        output1.println(customersList.get(j).toString());
                                        output1.println(movieOrder.toString());
                                        output1.println("---------------------------------------------------------------------");
                                    } catch (UnderAgeException exception) {
                                        output1.println("******** COMMAND: ORDER_MOVIE ********");
                                        output1.println(exception.getMessage());
                                        output1.println("---------------------------------------------------------------------");
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
                                    output1.println("******** COMMAND: ORDER_DOCUMENTARY********");
                                    output1.println(customersList.get(j).toString());
                                    output1.println(movieOrder.toString());
                                    output1.println("---------------------------------------------------------------------");

                                }
                            }
                        }
                    }
                    break;
                case "Print_Transactions":
                    output2.println("******** COMMAND: PRINT_TRANSACTIONS ********");
                    output2.println("######################################################################");
                    Collections.sort(customersList);
                    for (int i = 0; i < customersList.size(); i++) {
                        Collections.sort(customersList.get(i).getTranList());
                        output2.println(customersList.get(i).toString());
                        if (customersList.get(i).getTranList().isEmpty()) {
                            output2.println("NONE...");
                        } else {
                            for (int j = 0; j < customersList.get(i).getTranList().size(); j++) {
                                output2.println("Transaction ID: " + customersList.get(i).getTranList().get(j).getTranID() + "	Total Cost: " + customersList.get(i).getTranList().get(j).getCost());
                            }
                        }
                        output2.println("######################################################################");
                    }
                    break;
                case "END":
                    output1.println("Thanks for using FCIT Digital System..");
                    input.close();
                    output1.close();
                    output2.close();

            }
        }
        input.close();
        output1.close();
        output2.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBExit;
    private javax.swing.JButton jBSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTName;
    private javax.swing.JTextField jTPoints;
    // End of variables declaration//GEN-END:variables
}
