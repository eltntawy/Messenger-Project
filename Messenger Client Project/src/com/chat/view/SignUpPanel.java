/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.view;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.chat.controller.SignUpClientController;
import com.chat.model.User;

/**
 *
 * @author eltntawy
 */
public class SignUpPanel extends javax.swing.JPanel {
    private JFrame parentFrame;
    private SignUpClientController signUpController;
    private int female;
    private int male;
    private User user;
    private int gender;

    /**
     * Creates new form TempletePanel
     */
    public SignUpPanel(JFrame parentFrame, SignUpClientController signUpController) {
	this.parentFrame = parentFrame;
	this.signUpController = signUpController;
	initComponents();
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imgIconRegisteration = new javax.swing.JLabel();
        lblRegisterHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        lblCheckUserName = new javax.swing.JLabel();
        lblCheckPassword = new javax.swing.JLabel();
        lblCheckconfirmPassword = new javax.swing.JLabel();
        lblCheckMail = new javax.swing.JLabel();
        lblCheckfieldsl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblSecondName = new javax.swing.JLabel();
        txtSecondName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        radiobtnMale = new javax.swing.JRadioButton();
        radiobtnFemale = new javax.swing.JRadioButton();
        lblMail = new javax.swing.JLabel();
        TxtMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        TxtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Sign Up"));
        setMaximumSize(new java.awt.Dimension(300, 800));
        setMinimumSize(new java.awt.Dimension(300, 800));
        setPreferredSize(new java.awt.Dimension(300, 800));

        jPanel2.setMaximumSize(new java.awt.Dimension(315, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(315, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(315, 600));

        imgIconRegisteration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chat/view/resource/img/SignUp.png"))); // NOI18N

        lblRegisterHeader.setText("<html><h3>Hi There ! </h3>\n<ul>\n<li>Easy steps to become a member </li>\n<li>Enjoy your time with your friends </li>\n</ul></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imgIconRegisteration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegisterHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgIconRegisteration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblRegisterHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tell us about your self ?");

        btnCreateAccount.setText("Create My Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        lblCheckUserName.setForeground(new java.awt.Color(255, 51, 51));
        lblCheckUserName.setText("*");
        lblCheckUserName.setEnabled(false);

        lblCheckPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblCheckPassword.setText("*");
        lblCheckPassword.setEnabled(false);

        lblCheckconfirmPassword.setForeground(new java.awt.Color(255, 0, 0));
        lblCheckconfirmPassword.setText("*");
        lblCheckconfirmPassword.setEnabled(false);

        lblCheckMail.setForeground(new java.awt.Color(255, 51, 0));
        lblCheckMail.setText("*");
        lblCheckMail.setEnabled(false);

        lblCheckfieldsl.setForeground(new java.awt.Color(255, 51, 0));
        lblCheckfieldsl.setText("* Please , check your entries");
        lblCheckfieldsl.setEnabled(false);

        jPanel3.setLayout(new java.awt.GridLayout(7, 3, 10, 10));

        lblFirstName.setText("First Name");
        jPanel3.add(lblFirstName);
        jPanel3.add(txtFirstName);
        jPanel3.add(jLabel2);

        lblSecondName.setText("Second Name");
        jPanel3.add(lblSecondName);
        jPanel3.add(txtSecondName);
        jPanel3.add(jLabel3);

        lblGender.setText("Gender");
        jPanel3.add(lblGender);

        radiobtnMale.setText("Male");
        jPanel3.add(radiobtnMale);

        radiobtnFemale.setText("Female");
        jPanel3.add(radiobtnFemale);

        lblMail.setText("E-mail");
        jPanel3.add(lblMail);
        jPanel3.add(TxtMail);
        jPanel3.add(jLabel4);

        lblUserName.setText("User Name");
        jPanel3.add(lblUserName);
        jPanel3.add(TxtUserName);
        jPanel3.add(jLabel5);

        lblPassword.setText("Password");
        jPanel3.add(lblPassword);
        jPanel3.add(txtPassword);
        jPanel3.add(jLabel6);

        lblConfirmPassword.setText("Confirm Password");
        jPanel3.add(lblConfirmPassword);
        jPanel3.add(txtConfirmPassword);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCheckfieldsl, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblCheckUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCheckPassword))
                                        .addComponent(lblCheckMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblCheckconfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCheckMail)
                        .addGap(43, 43, 43)
                        .addComponent(lblCheckUserName)
                        .addGap(43, 43, 43)
                        .addComponent(lblCheckPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblCheckconfirmPassword))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCheckfieldsl)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateAccount)
                            .addComponent(btnBack))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        signUpController.showSignIn();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCreateAccountActionPerformed
	// TODO add your handling code here:

	if (TxtUserName.getText().equals("")) {
	    lblCheckUserName.setEnabled(true);
	}

	if (TxtMail.getText().equals("")) {
	    lblCheckMail.setEnabled(true);
	}

	if (txtPassword.getText().equals("")) {
	    lblCheckPassword.setEnabled(true);
	}

	if (txtConfirmPassword.getText().equals("")) {
	    lblCheckconfirmPassword.setEnabled(true);
	}

	if (!(txtPassword.getText().equals(txtConfirmPassword.getText()))) {
	    lblCheckPassword.setEnabled(true);
	    lblCheckconfirmPassword.setEnabled(true);
	}
	if (lblCheckMail.isEnabled() || lblCheckPassword.isEnabled() || lblCheckUserName.isEnabled() || lblCheckconfirmPassword.isEnabled()) {
	    lblCheckfieldsl.setEnabled(true);
	}

	try {
	    if (signUpController.doSignup(getData()) == 1)
	    	JOptionPane.showMessageDialog(this, "you sign up successfully !!");
	    else
		JOptionPane.showMessageDialog(this, "please choose an other user name or email !!");
	    	    
	}catch (SQLException ex ) {
	    JOptionPane.showMessageDialog(this, "please choose an other user name or email !!");
	} catch (RemoteException | NotBoundException e) {
	    // TODO Auto-generated catch block
	    JOptionPane.showMessageDialog(this, "Sorry server may be not started yet !!");
	    e.printStackTrace();
	}

    }// GEN-LAST:event_btnCreateAccountActionPerformed

    private void radiobtnMaleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_radiobtnMaleActionPerformed
	if (radiobtnMale.isSelected()) {
	    male = 1;
	}
    }// GEN-LAST:event_radiobtnMaleActionPerformed

    private void radiobtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_radiobtnFemaleActionPerformed
	if (radiobtnFemale.isSelected()) {
	    female = 1;
	}
    }// GEN-LAST:event_radiobtnFemaleActionPerformed

    public String getFirstName() {
	return txtFirstName.getText();
    }

    public String getSecondName() {
	return txtSecondName.getText();
    }

    public int getGender() // return 1 if male and 0 if female
    {
	if (male == 1) {
	    return 1;
	} else {
	    return 0;
	}
    }

    public String getEmail() {
	return TxtMail.getText();
    }

    public String getUserName() {
	return TxtUserName.getText();
    }

    public String getPassword() {
	return txtPassword.getText();
    }

    public User getData() {

	user = new User();
	user.setUserFirstName(getFirstName());

	user.setUserSecondName(getSecondName());
	user.setStatus(User.SIGNOUT);
	gender = getGender();
	if (gender == 1) {
	    user.setUserGender("male");
	} else if (gender == 0) {
	    user.setUserGender("female");

	}
	user.setUserEmail(getEmail());

	user.setUserName(getUserName());

	user.setPassword(getPassword());

	return user;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtMail;
    private javax.swing.JTextField TxtUserName;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JLabel imgIconRegisteration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCheckMail;
    private javax.swing.JLabel lblCheckPassword;
    private javax.swing.JLabel lblCheckUserName;
    private javax.swing.JLabel lblCheckconfirmPassword;
    private javax.swing.JLabel lblCheckfieldsl;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegisterHeader;
    private javax.swing.JLabel lblSecondName;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JRadioButton radiobtnFemale;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSecondName;
    // End of variables declaration//GEN-END:variables
}
