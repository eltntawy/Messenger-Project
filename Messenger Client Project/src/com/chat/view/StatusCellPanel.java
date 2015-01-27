/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.view;

import javax.swing.Icon;

/**
 *
 * @author eltntawy
 */
public class StatusCellPanel extends javax.swing.JPanel {

    
    

    public Icon getStatusIcon() {
        if(lblStatusIcon != null)
        return lblStatusIcon.getIcon();
        return null;
    }

    public void setStatusIcon(Icon statusIcon) {
        if(lblStatusIcon != null)
            lblStatusIcon.setIcon(statusIcon);
    }

    public String getStatusText() {
        if(lblStatusText != null)
            return lblStatusText.getText();
        return null;
    }

    public void setStatusText(String statusText) {
        if(lblStatusText != null )
            lblStatusText.setText(statusText);
    }
    
    /**
     * Creates new form StatusCellPanel
     */
    public StatusCellPanel() {
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

        lblStatusIcon = new javax.swing.JLabel();
        lblStatusText = new javax.swing.JLabel();

        lblStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chat/view/resource/img/status_online_small.png"))); // NOI18N

        lblStatusText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblStatusText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStatusText.setText("Status");
        lblStatusText.setToolTipText("User Status");
        lblStatusText.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatusIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStatusText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatusText)
                    .addComponent(lblStatusIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblStatusIcon;
    private javax.swing.JLabel lblStatusText;
    // End of variables declaration//GEN-END:variables
}