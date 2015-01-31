/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.chat.controller.MessengerClientController;
import com.chat.controller.StatusCLientController;
import com.chat.model.Status;
import com.chat.model.User;
import com.chat.rmi.ChatClientService;
import com.chat.view.imageFileChooser.MyFilter;
import com.chat.view.imageFileChooser.MyView;
import com.chat.view.model.ListComboBoxModel;
import com.chat.view.renderer.ContactListCellRender;
import com.chat.view.renderer.StatusListCellRender;
import com.chat.view.resource.Resource;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author eltntawy
 */
public class MainPanel extends javax.swing.JPanel {

    JFrame parentFrame;
    MessengerClientController messengerController;
    boolean img;

    /**
     * Creates new form TempletePanel
     */
    public MainPanel(JFrame parentFrame, MessengerClientController messengerController) {

        try {
            this.parentFrame = parentFrame;
            this.messengerController = messengerController;

            initComponents();
            initStatusCbBox();
            initContactList();
            txtContactSearch.addKeyListener(new TxtContacSearchtListener(listContact, btnAddSearchContact));
            parentFrame.setJMenuBar(new AppMenuBarMenuBar(parentFrame, messengerController));

            jLabel1.setText(messengerController.getUser().getUserName());
            Icon imgicon = messengerController.getUser().getUserPicture();
            cbBoxUserStatus.setSelectedIndex(changeStatusCbBox());
            lblUserImage.setIcon(imgicon);
            System.out.println(lblUserImage.getWidth() + "     " + lblUserImage.getHeight());
        } catch (RemoteException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private int changeStatusCbBox() {
        try {
            switch (messengerController.getUser().getStatus()) {

                case 1:
                    return 0;

                case 2:
                    return 2;

                case 3:
                    return 1;

                case 0:
                    return 3;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    private Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
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
        btnAddSearchContact = new javax.swing.JButton();
        txtContactSearch = new javax.swing.JTextField();
        adPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(350, 600));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new java.awt.BorderLayout());

        userPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("User Profile"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Photo"));

        lblUserImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chat/view/resource/img/messenger.png"))); // NOI18N
        lblUserImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserImageMouseClicked(evt);
            }
        });
        lblUserImage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblUserImageKeyPressed(evt);
            }
        });
        jPanel1.add(lblUserImage);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("User Name");

        cbBoxUserStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBoxUserStatusItemStateChanged(evt);
            }
        });

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
        listContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listContactMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(listContact);
        listContact.setCellRenderer(new ContactListCellRender());

        btnAddSearchContact.setIcon(Resource.getImage("addContact.png"));
        btnAddSearchContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSearchContactActionPerformed(evt);
            }
        });

        txtContactSearch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtContactSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddSearchContact, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddSearchContact, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
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

    private void lblUserImageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblUserImageKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_lblUserImageKeyPressed

    private void lblUserImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserImageMouseClicked
        // TODO add your handling code here:
        lblUserImage.setCursor(new Cursor(Cursor.HAND_CURSOR));
        MyFilter filter = new MyFilter();
        MyView view = new MyView();
        JFileChooser fc = new JFileChooser();
        BufferedImage bImg = null;

        fc.setFileHidingEnabled(true);
        fc.addChoosableFileFilter(filter);
        fc.setFileView(view);
        int x = fc.showOpenDialog(null);
        try {
            String fileName = fc.getSelectedFile().getName();
            String Path = fc.getSelectedFile().getPath();
            System.out.println(Path);

            if (x == JFileChooser.APPROVE_OPTION) {

                Image img10 = Toolkit.getDefaultToolkit().getImage(Path).getScaledInstance(lblUserImage.getWidth(), lblUserImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon img2 = new ImageIcon(img10);
                lblUserImage.setIcon(img2);
                try {
                    messengerController.updateUserImage(Path);
                } catch (SQLException ex) {
                    Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (RemoteException ex) {
                    Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(parentFrame, "the file Name is " + fileName);
                System.out.println(lblUserImage.getWidth() + "     " + lblUserImage.getHeight());
            }
        } catch (NullPointerException n) {

            JOptionPane.showMessageDialog(parentFrame, "please choose File to open first");
        }
    }//GEN-LAST:event_lblUserImageMouseClicked

    private void cbBoxUserStatusItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbBoxUserStatusItemStateChanged

        // TODO add your handling code here:
        try {
            messengerController.doChangeStaus((Status) cbBoxUserStatus.getSelectedItem());

            if (((Status) evt.getItem()).getStatus() == User.SIGNOUT) {
                messengerController.doSignOut();
                parentFrame.setJMenuBar(null);
                parentFrame.revalidate();
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(this, "can not change status right now");
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "can not change status right now");
            e.printStackTrace();
        }

    }// GEN-LAST:event_cbBoxUserStatusItemStateChanged

    private void listContactMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_listContactMousePressed
        // TODO add your handling code here:
        evt.consume();
        if (evt.getClickCount() == 2) {
            User reciever = (User) listContact.getSelectedValue();
            messengerController.showChatFrameWith(reciever);
        }

        if (evt.getClickCount() == 3) {
            try {
                if (messengerController.checkUserId((User) listContact.getSelectedValue())) {
                    ConfirmRemoveFriendDialoge1 confirm = new ConfirmRemoveFriendDialoge1(parentFrame, true, (User) listContact.getSelectedValue());
                    
                    
                    confirm.setVisible(true);

                    boolean flag = confirm.getPressedbutton();

                    if (flag) {
                        try {
                            User user = (User) listContact.getSelectedValue();
                            messengerController.DeleteContactFromUser(user);
                            ((ListComboBoxModel<User>)listContact.getModel()).removeElement(listContact.getSelectedValue());
                            initContactList();
                        } catch (RemoteException ex) {
                            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {

                    }
                } else {
                    errMessage();
                    txtContactSearch.setText("");
                }

            } catch (RemoteException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }// GEN-LAST:event_listContactMousePressed

    private void btnAddSearchContactActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddSearchContactActionPerformed
        // TODO add your handling code here:
        int dialogebox = 0;
        if (listContact.getModel().getSize() > 0 && img) {
            if (!listContact.isSelectionEmpty()) {
                try {
                    System.out.println(listContact.getSelectedValue().toString());
                    //  dialogebox = JOptionPane.showConfirmDialog(parentFrame, "Are u sure u want to add  \n" + listContact.getSelectedValue());
                    if (messengerController.checkUserId((User) listContact.getSelectedValue())) {
                        ConfirmAddFriendDialoge confirm = new ConfirmAddFriendDialoge(parentFrame, true, (User) listContact.getSelectedValue());
                        confirm.setVisible(true);

                        boolean flag = confirm.getPressedbutton();

                        if (flag) {
                            try {
                                messengerController.addRequestContact((User) listContact.getSelectedValue());
                            } catch (RemoteException ex) {
                                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {

                        }
                    } else {
                        errMessage();
                        txtContactSearch.setText("");
                    }
                } catch (RemoteException ex) {
                    Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }// GEN-LAST:event_btnAddSearchContactActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adPanel;
    private javax.swing.JButton btnAddSearchContact;
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
    public void initContactList() {
        if (listContact != null) {

            ListComboBoxModel<User> listModel = new ListComboBoxModel<User>();

            List<User> list = null;
            try {
                list = messengerController.getContactListOfCurrentUser();
            } catch (RemoteException | SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            if (list != null) {
                for (User user : list) {
                    listModel.addElement(user);
                }
            }
            // listModel.addElement(new User("Mohamed Refaat", "Password",
            // "Mohamed Refaat", Resource.IMAGE_DEFAULT_USER, User.BUSY));
            // listModel.addElement(new User("Ahmed Mahmoud", "Password",
            // "Ahmed Mahmoud", Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            // listModel.addElement(new User("mohamed ismaiel", "Password",
            // "mohamed ismaiel", Resource.IMAGE_DEFAULT_USER, User.OFFLINE));
            // listModel.addElement(new User("Marwa Ibrahem", "Password",
            // "Marwa Ibrahem", Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            // listModel.addElement(new User("Yassmin Moamen", "Password",
            // "Yassmin Moamen", Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            // listModel.addElement(new User("Youmna Naser", "Password",
            // "Youmna Naser", Resource.IMAGE_DEFAULT_USER, User.AWAY));
            // listModel.addElement(new User("Marwa", "Password", "Marwa",
            // Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            // listModel.addElement(new User("Khaled Mohamed", "Password",
            // "Khaled Mohamed", Resource.IMAGE_DEFAULT_USER, User.BUSY));
            // listModel.addElement(new User("Yassmin Mansour", "Password",
            // "Yassmin Mansour", Resource.IMAGE_DEFAULT_USER, User.AVAILABLE));
            // listModel.addElement(new User("Waled Madkor", "Password",
            // "Waled Madkor", Resource.IMAGE_DEFAULT_USER, User.OFFLINE));

            listContact.setModel(listModel);
            // comboBoxContactSearch.setModel(listModel);
        }
    }

    public void initStatusCbBox() {
        if (cbBoxUserStatus != null) {

            DefaultComboBoxModel<Status> listModel = new DefaultComboBoxModel<Status>();
            listModel.addElement(new Status(Resource.IMAGE_AVAILABLE_SMALL, "Available", User.AVAILABLE));
            listModel.addElement(new Status(Resource.IMAGE_AWAY_SMALL, "Away", User.AWAY));
            listModel.addElement(new Status(Resource.IMAGE_BUSY_SMALL, "Busy", User.BUSY));
            listModel.addElement(new Status(Resource.IMAGE_OFFLINE_SMALL, "Offline", User.OFFLINE));
            listModel.addElement(new Status(Resource.IMAGE_SIGNOUT, "Sign out", User.SIGNOUT));

            cbBoxUserStatus.setModel(listModel);
        }
    }

    public void errMessage() {
        JOptionPane.showMessageDialog(parentFrame, "Sorry you cannot add yourSelf ");
    }

    public  void initRequestContactList() {

        List<User> list = null;
        try {
            list = messengerController.getRequestContactList();
        } catch (RemoteException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (User user : list) {
            NotifyFriendRequestJDialoge notify = new NotifyFriendRequestJDialoge(parentFrame, true, user);
            notify.setVisible(true);
            System.out.println(user);

            int flag = notify.getPressedbutton();

            if (flag == 1) {
                try {
                    // add to friend list
                    messengerController.addFriend(user);
                    initContactList();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (RemoteException ex) {
                    ex.printStackTrace();
                }
            } else if (flag == -1) {
                try {
                    messengerController.deleteFriendRequest(user);
                    // remove from friend Request
                } catch (RemoteException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

    public JTextField getitemFocus() {
        return txtContactSearch;
    }

    class TxtContacSearchtListener extends KeyAdapter {

        JList<User> filterList;
        ListComboBoxModel<User> oldModel;
        ListComboBoxModel<User> model;
        JButton btnAddSearch;

        public TxtContacSearchtListener(JList<User> filterList, JButton btnAddSearch) {
            this.filterList = filterList;
            this.btnAddSearch = btnAddSearch;

            oldModel = new ListComboBoxModel<User>();
            model = (ListComboBoxModel<User>) filterList.getModel();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getSource() instanceof JTextField) {
                int index = filterList.getSelectedIndex();

                JTextField txtField = (JTextField) e.getSource();

                if (filterList.getModel().getSize() <= 0) {
                    btnAddSearch.setIcon(Resource.getImage("addContact.png"));
                    //set boolean with treue
                    img = true;

                } else {
                    btnAddSearch.setIcon(Resource.getImage("search.png"));
                    //set boolean with false
                    img = false;
                }

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // TODO fire action to open chat with current contact

                    if (0 < filterList.getModel().getSize()) {
                        // TODO create chat frame
                        User reciever = (User) filterList.getSelectedValue();
                        messengerController.showChatFrameWith(reciever);
                    } else {
                        // TODO search for name on server contacts
                        try {
                            List<User> searchContactList = messengerController.getContactOfNameOrEmailOrUseName(txtField.getText());
                            for (User user : searchContactList) {
                                ((ListComboBoxModel<User>) filterList.getModel()).addElement(user);
                            }
                            if (filterList.getModel().getSize() > 0) {
                                filterList.setSelectedIndex(0);
                            }

                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        } catch (RemoteException ex) {
                            ex.printStackTrace();
                        }
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (0 < index) {
                        filterList.setSelectedIndex(index - 1);
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (index < filterList.getModel().getSize()) {
                        filterList.setSelectedIndex(index + 1);
                    }
                } else {
                    listFilter(txtField.getText());
                }
            }
        }

        public void listFilter(String enteredText) {
            java.util.List<User> filterArray = new ArrayList<User>();
            for (int i = 0; i < model.getSize(); i++) {
                String name = ((User) model.getElementAt(i)).getFullName();
                String userName = ((User) model.getElementAt(i)).getUserName();

                if (name.toLowerCase().contains(enteredText.toLowerCase())) {

                    filterArray.add((User) model.getElementAt(i));

                }

            }
            if (filterArray.size() >= 0) {
                filterList.setModel(new ListComboBoxModel<User>(filterArray));

                if (filterArray.size() > 0) {
                    filterList.setSelectedValue(filterArray.get(0), true);
                }
            }
        }
    }

}
