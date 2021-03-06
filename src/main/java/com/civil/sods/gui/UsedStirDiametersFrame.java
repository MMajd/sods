package com.civil.sods.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Omnia Hussein
 * @author Esraa Salah
 * @author Abdullah Salama
 * @author Muhammad Abulmajd
 * @author Muhammad Medhat 
 */

public class UsedStirDiametersFrame extends javax.swing.JFrame implements IUsedDiametersFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form UsedLongDiameter
     */
    public UsedStirDiametersFrame() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (screenSize.getWidth() / 2 - this.getWidth() / 2); 
        int y = (int) (screenSize.getHeight() / 2 - this.getHeight() / 2); 
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jAddDiameter = new javax.swing.JButton();
        jRemoveSelected = new javax.swing.JButton();
        jResetDefaults = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDiameterTable = new javax.swing.JTable();

        setTitle("Stirrups Diameters");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(35, 86, 157));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu Condensed", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Used Stirrups Diameters");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 14, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 50));

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 30, 240));

        jPanel3.setBackground(new java.awt.Color(35, 86, 157));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 290, 530, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(240, 240, 240));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Remove or Add Wanted Diameters");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 20));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 20));

        jPanel7.setBackground(new java.awt.Color(240, 240, 240));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jAddDiameter.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jAddDiameter.setText("Add Diameter");
        jAddDiameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddDiameterActionPerformed(evt);
            }
        });
        jPanel7.add(jAddDiameter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        jRemoveSelected.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jRemoveSelected.setText("Remove Selected");
        jPanel7.add(jRemoveSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        jResetDefaults.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jResetDefaults.setText("Reset Defaults");
        jPanel7.add(jResetDefaults, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 170, 150));

        jDiameterTable.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jDiameterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Used Diameters"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jDiameterTable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 161, 150));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 470, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 320));
        jPanel1.getAccessibleContext().setAccessibleName("Stirrups Diameters");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAddDiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddDiameterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddDiameterActionPerformed

    @Override
    public ArrayList<Double> getSelectedDiameters() {
        ArrayList<Double> selectedDiameters = new ArrayList<>();

        int numOfDiameters = jDiameterTable.getRowCount();

        for (int rowDiameter = 0; rowDiameter < numOfDiameters; rowDiameter++) {
            selectedDiameters.add(Double.parseDouble(jDiameterTable.getValueAt(rowDiameter, 0).toString()));
        }

        return selectedDiameters;
    }

    @Override
    public void resetTableDefaultValues() {
        String[] defaultValues = {"8", "10", "12", "14", "16", "18"};

        DefaultTableModel dtm = (DefaultTableModel) jDiameterTable.getModel();

        dtm.setRowCount(0);

        for (int rowDiameter = 0; rowDiameter < defaultValues.length; rowDiameter++) {
            dtm.addRow(new String[1]);
            dtm.setValueAt(Double.parseDouble(defaultValues[rowDiameter]), rowDiameter, 0);
        }

        jDiameterTable.setModel(dtm);
    }

    @Override
    public void setAddDiameterActionListener(ActionListener listener) {
        jAddDiameter.addActionListener(listener);
    }

    @Override
    public void setRemoveSelectedActionListener(ActionListener listener) {
        jRemoveSelected.addActionListener(listener);
    }

    @Override
    public void setResetDefaultsActionListener(ActionListener listener) {
        jResetDefaults.addActionListener(listener);
    }

    @Override
    public JTable getjDiameterTable() {
        return jDiameterTable;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddDiameter;
    private javax.swing.JTable jDiameterTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jRemoveSelected;
    private javax.swing.JButton jResetDefaults;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
