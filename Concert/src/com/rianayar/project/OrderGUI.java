package com.rianayar.project;

import java.awt.*;

public class OrderGUI extends javax.swing.JFrame {

        public OrderGUI() {
            initComponents();
        }

    /**
     * This method is called from within the constructor to initialize the frame.
     */
    private void initComponents() {

        // initialize and declare all necessary components
        jPanel1 = new javax.swing.JPanel();
        pageTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        confirmationArea = new javax.swing.JTextArea();
        quantityField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeField = new javax.swing.JTextField();
        promptsLabel = new javax.swing.JLabel();
        standardLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        summaryArea = new javax.swing.JTextArea();
        orderButton = new javax.swing.JButton();
        cardLabel = new javax.swing.JLabel();
        cardField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();

        // close when hit X
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // following lines format and and edit components to initial default values for aesthetic and functional purposes
        // sets initial values and states for buttons, text fields, and text areas
        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        pageTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        pageTitle.setText("Ticket Ordering Screen");

        confirmationArea.setColumns(20);
        confirmationArea.setRows(5);
        jScrollPane1.setViewportView(confirmationArea);
        confirmationArea.setEditable(false);

        quantityLabel.setText("Ticket Quantity");

        typeLabel.setText("Ticket Type (standard, premium, vip):");

        promptsLabel.setText("Please follow these prompts to order tickets.");

        standardLabel.setText("Standard tickets are base price. Premium tickets are 1.5x price. VIP tickets are 2x price.");

        summaryArea.setColumns(20);
        summaryArea.setRows(5);
        jScrollPane2.setViewportView(summaryArea);
        summaryArea.setEditable(false);
        summaryArea.setText("Please enter ID, quantity, and ticket type for your order confirmation before attempting to order.");

        orderButton.setText("ORDER");
        orderButton.setEnabled(false);
        orderButton.addActionListener(this::orderButtonActionPerformed);

        cardLabel.setText("Card Number");
        cardField.setEnabled(false);

        idLabel.setText("Enter event ID for selected event from previous screen");

        enterButton.setText("ENTER");
        enterButton.addActionListener(this::enterButtonActionPerformed);

        // creates the layout for the panel to ensure all components appear as desires
        // used apache netbeans and youtube tutorials to understand horizontal and vertical groups
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pageTitle)
                                .addGap(233, 233, 233))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(promptsLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(286, 286, 286)
                                                .addComponent(enterButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(cardLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cardField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(orderButton)
                                                                .addGap(55, 55, 55))
                                                        .addComponent(standardLabel)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jScrollPane2)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(idLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(typeLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                                                .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(promptsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(standardLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLabel)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(quantityLabel)
                                        .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(typeLabel)
                                        .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cardLabel)
                                        .addComponent(cardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // when event button is clicked, data validation occurs and order confirmation is printed out
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // checks that event ID is an integer
        int a;
        try {
            a = Integer.parseInt(idField.getText());
        }
        catch (NumberFormatException e) {
            a = -1;
        }
        // checks that ticket quantity is an integer
        int b;
        try {
            b = Integer.parseInt(quantityField.getText());
        }
        catch (NumberFormatException e) {
            b = -1;
        }

        // if either ID or quantity aren't integers or ticket type is entered incorrectly
        if(a < 0 || b < 0 || !(typeField.getText().equalsIgnoreCase("vip") || typeField.getText().equalsIgnoreCase("standard") || typeField.getText().equalsIgnoreCase("premium")))
        {
            confirmationArea.setText("Invalid input. Please search again.");
            // user is unable to order or enter card information
            orderButton.setEnabled(false);
            cardField.setEnabled(false);
            summaryArea.setText("Please enter ID, quantity, and ticket type for your order confirmation before attempting to order.");
        }
        else
        {
            String out = FindEvent.confirmTicket(Integer.parseInt(idField.getText()), Integer.parseInt(quantityField.getText()), typeField.getText());
            confirmationArea.setText(out);
            // user is able to order and enter card information
            cardField.setEnabled(true);
            orderButton.setEnabled(true);
            summaryArea.setText("");
        }
    }

    // when order button is clicked, data validation occurs and order summary is printed out (digital receipt)
    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // checks to see if event id is integer
        int a;
        try {
            a = Integer.parseInt(idField.getText());
        }
        catch (NumberFormatException e) {
            a = -1;
        }
        // checks to see if ticket quantity is integer
        int b;
        try {
            b = Integer.parseInt(quantityField.getText());
        }
        catch (NumberFormatException e) {
            b = -1;
        }

        // if id and quantity aren't integers, card number is invalid, or ticket type is incorrectly entered
        if(a < 0 || b < 0 || cardField.getText().length() != 16 || !(typeField.getText().equalsIgnoreCase("vip") || typeField.getText().equalsIgnoreCase("standard") || typeField.getText().equalsIgnoreCase("premium")))
        {
            summaryArea.setText("Invalid input. Please check your inputs and try ordering again. Card number should be 16 digits long.");
        }
        else
        {
            String order = FindEvent.orderTickets(Integer.parseInt(idField.getText()), Integer.parseInt(quantityField.getText()), typeField.getText(), cardField.getText());
            summaryArea.setText(order);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new OrderGUI().setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField cardField;
    private javax.swing.JLabel cardLabel;
    private javax.swing.JTextArea confirmationArea;
    private javax.swing.JButton enterButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton orderButton;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JLabel promptsLabel;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel standardLabel;
    private javax.swing.JTextArea summaryArea;
    private javax.swing.JTextField typeField;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration
}
