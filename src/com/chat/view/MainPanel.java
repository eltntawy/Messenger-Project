/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

import com.chat.model.Status;
import com.chat.model.User;
import com.chat.view.model.ListComboBoxModel;
import com.chat.view.model.TxtContacSearchtListener;
import com.chat.view.renderer.ContactListCellRender;
import com.chat.view.renderer.StatusListCellRender;
import com.chat.view.resource.Resource;

/**
 *
 * @author eltntawy
 */
public class MainPanel extends javax.swing.JPanel {

    JFrame parentFrame ;
    /**
     * Creates new form TempletePanel
     */
    public MainPanel(JFrame parentFrame) {
	
	this.parentFrame = parentFrame;
        initComponents();
        initStatusCbBox();
        addSimpleContact();
        txtContactSearch.addKeyListener(new TxtContacSearchtListener(listContact));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblUserImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbBoxUserStatus = new javax.swing.JComboBox();
        contactPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listContact = new javax.swing.JList();
        btnAddContact = new javax.swing.JButton();
        txtContactSearch = new javax.swing.JTextField();
        adPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(350, 600));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new java.awt.BorderLayout());

        userPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("User Profile"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Photo"));

        lblUserImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chat/view/resource/img/messenger.png"))); // NOI18N
        jPanel1.add(lblUserImage);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("User Name");

        cbBoxUserStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Busy", "Away" }));

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addGap(68, 68, 68))
                    .addComponent(cbBoxUserStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbBoxUserStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbBoxUserStatus.setRenderer(new StatusListCellRender());

        add(userPanel, java.awt.BorderLayout.PAGE_START);

        contactPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Contacts"));
        contactPanel.setMinimumSize(new java.awt.Dimension(300, 600));
        contactPanel.setPreferredSize(new java.awt.Dimension(300, 600));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listContact.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listContact);
        listContact.setCellRenderer(new ContactListCellRender());

        btnAddContact.setText("+");

        txtContactSearch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtContactSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddContact, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddContact, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtContactSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout contactPanelLayout = new javax.swing.GroupLayout(contactPanel);
        contactPanel.setLayout(contactPanelLayout);
        contactPanelLayout.setHorizontalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contactPanelLayout.setVerticalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 114, Short.MAX_VALUE))
        );

        add(contactPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout adPanelLayout = new javax.swing.GroupLayout(adPanel);
        adPanel.setLayout(adPanelLayout);
        adPanelLayout.setHorizontalGroup(
            adPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        adPanelLayout.setVerticalGroup(
            adPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(adPanel, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adPanel;
    private javax.swing.JButton btnAddContact;
    private javax.swing.JComboBox cbBoxUserStatus;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserImage;
    private javax.swing.JList listContact;
    private javax.swing.JTextField txtContactSearch;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables

    public void addSimpleContact() {
        if (listContact != null) {

            ListComboBoxModel<User> listModel = new ListComboBoxModel<User>();

            listModel.addElement(new User("Mohamed Refaat", "Password", "Mohamed Refaat", Resource.IMAGE_DEFAULT_USER, User.BUSY));
            listModel.addElement(new User("Ahmed Mahmoud", "Password", "Ahmed Mahmoud", Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            listModel.addElement(new User("mohamed ismaiel", "Password", "mohamed ismaiel", Resource.IMAGE_DEFAULT_USER, User.OFFLINE));
            listModel.addElement(new User("Marwa Ibrahem", "Password", "Marwa Ibrahem", Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            listModel.addElement(new User("Yassmin Moamen", "Password", "Yassmin Moamen", Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            listModel.addElement(new User("Youmna Naser", "Password", "Youmna Naser", Resource.IMAGE_DEFAULT_USER, User.AWAY));
            listModel.addElement(new User("Marwa", "Password", "Marwa", Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            listModel.addElement(new User("Khaled Mohamed", "Password", "Khaled Mohamed", Resource.IMAGE_DEFAULT_USER, User.BUSY));
            listModel.addElement(new User("Yassmin Mansour", "Password", "Yassmin Mansour", Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            listModel.addElement(new User("Waled Madkor", "Password", "Waled Madkor", Resource.IMAGE_DEFAULT_USER, User.OFFLINE));

            listContact.setModel(listModel);
            //comboBoxContactSearch.setModel(listModel);
        }
    }

    public void initStatusCbBox() {
        if (cbBoxUserStatus != null) {

            DefaultComboBoxModel<Status> listModel = new DefaultComboBoxModel<Status>();
            listModel.addElement(new Status(Resource.IMAGE_AVAILABLE_SMALL, "Avilable", User.AVAILABLE));
            listModel.addElement(new Status(Resource.IMAGE_AWAY_SMALL, "Away", User.AWAY));
            listModel.addElement(new Status(Resource.IMAGE_BUSY_SMALL, "Busy", User.BUSY));
            listModel.addElement(new Status(Resource.IMAGE_OFFLINE_SMALL, "Offline", User.OFFLINE));

            cbBoxUserStatus.setModel(listModel);
        }
    }

}
