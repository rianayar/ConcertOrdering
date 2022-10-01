package com.rianayar.project;

import java.awt.*;

public class SearchGUI extends javax.swing.JFrame {


    public SearchGUI() {
        initComponents();
    }

    Events tbltml = new Events("Tampa Bay Lightning vs. Toronto Maple Leafs", "05/12/2022", "7:00 PM", "Hockey Game", "The Tampa Bay Lightning face the Toronto Maple Leafs on May 12th, 2022", 90.00, 506790);
    Events kaneb = new Events("Kane Brown Blessed and Free Tour", "05/21/2022", "7:00 PM", "Concert", "Noted as the “future of Country” (Billboard) and one of “31 People Changing the South” (Time), chart-topping entertainer, Kane Brown, first broke through the country charts with his #1 self-titled debut, which spent a record-breaking 13 weeks at the top of the chart and made Brown the first artist in Billboard history to Top all five Billboard Country charts simultaneously.", 36.75, 521736);
    Events wwe = new Events("WWE Raw", "07/18/2022", "7:30 PM", "Wrestling", "WWE Raw returns to Tampa for the first time in 3 years!", 20.00, 718720);
    Events freeexp = new Events("Freestyle Explosion", "08/12/2022", "7:30 PM", "Throwback Jam", "Throwback Jam featuring featuring Lisa Lisa, Stevie B, The Jets and more", 39.50, 812739);
    Events gymnastics = new Events("2022 U.S. Gymnastics Championship", "08/18/2022", "2:30 PM", "Gymnastics", "The annual national championships for artistic gymnastics will take place August 18-21 and will determine the men’s and women’s junior and senior all-around and individual event national champions.", 95.00, 818295);
    Events shawnm = new Events("Shawn Mendes: Wonder World Tour", "10/11/2022", "7:00 PM", "Concert", "Shawn Mendes: Wonder World Tour with special guest Tate McRae", 59.50, 101176);


    /**
     * This method is called from within the constructor to initialize the frame.
     */
    private void initComponents() {

        // initialize and declare all necessary components
        jPanel1 = new javax.swing.JPanel();
        pageTitle = new javax.swing.JLabel();
        costField = new javax.swing.JTextField();
        costLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        instructions = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        // close when hit X
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // following lines are formatting and editing each component for aesthetic and functional purposes
        // also sets initial values for text boxes and button status
        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        outputArea.setEditable(false);
        outputArea.setText(FindEvent.generalSearch(1000000));

        pageTitle.setBackground(new java.awt.Color(204, 255, 255));
        pageTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        pageTitle.setText("Amalie Arena Events");

        costLabel.setText("Max Cost:");

        nextButton.setText("NEXT");
        nextButton.addActionListener(this::nextButtonActionPerformed);

        searchButton.setText("SEARCH");
        searchButton.addActionListener(this::searchButtonActionPerformed);

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        instructions.setText("Please note event ID before clicking the next button.");

        jLabel1.setText("Welcome to the Amalie Arena ticket ordering system.");

        jLabel2.setText("Enter a maximum cost to filter events and click search to populate results. Click NEXT when ready.");

        // creates the layout for the panel to ensure all components appear as desires
        // used apache netbeans and youtube tutorials to understand horizontal and vertical groups
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(134, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(instructions)
                                                .addGap(125, 125, 125)
                                                .addComponent(nextButton)
                                                .addGap(20, 20, 20))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(134, 134, 134)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(pageTitle))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(costLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(235, 235, 235))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(281, 281, 281)
                                                .addComponent(searchButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(172, 172, 172)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabel2)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pageTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(costLabel)
                                        .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nextButton)
                                        .addComponent(instructions))
                                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    // On click of NEXT button, new OrderGUI JFrame is shown in a new window.
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new OrderGUI().setVisible(true);
    }

    // On click of Search button, data validation occurs and search results are filtered.
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Data validation for cost text field to ensure it is a double
        double d;
        try {
            d = Double.parseDouble(costField.getText());
        } catch (NumberFormatException e) {
            // Use whatever default you like
            d = -1.0;
        }
        if (d < 0) {
            outputArea.setText("Invalid input. Please enter a positive number and search again.");
        } else {
            String relevantEvents = FindEvent.generalSearch(Double.parseDouble(costField.getText()));
            outputArea.setText(relevantEvents);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SearchGUI().setVisible(true);
    }

    // Variables declaration
    private javax.swing.JTextField costField;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel instructions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JButton searchButton;
}

