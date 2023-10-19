package gui;

import database.InformationController;
import database.transactions.AccountInformations;
import database.transactions.PasswordRenew;
import java.awt.Color;
import javax.swing.JPasswordField;
import settings.ActionSettings;
import settings.ButtonSettings;
import settings.Dialogs;
import settings.Edits;
import settings.TextSettings;


public class PasswordChangeScreen extends javax.swing.JFrame implements Edits,InformationController {

    private PasswordRenew passwordRenewObject = null;
    
    public PasswordChangeScreen() {
        initComponents();
        getEdits();
    }

    private boolean isEnabledOldPwField() {
        return this.getOldPwField().isEnabled();
    }
    @Override
    public boolean isInformationsValid() {
        return TextSettings.isTextAreaFill(this.paswordChangePanel);
    }

    @Override
    public AccountInformations getAccountInformations() {
       return  AccountInformations.getInstance();
    }

    public PasswordRenew getPasswordRenewObject() {
       if(passwordRenewObject == null){
           passwordRenewObject = new PasswordRenew();
       }
        return passwordRenewObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paswordChangePanel = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idNoLabel = new javax.swing.JLabel();
        idNoText = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        securityQLabel = new javax.swing.JLabel();
        securityQText = new javax.swing.JTextField();
        oldPwLabel = new javax.swing.JLabel();
        oldPwField = new javax.swing.JPasswordField();
        newPwLabel = new javax.swing.JLabel();
        newPwField = new javax.swing.JPasswordField();
        newPwRepeatLabel = new javax.swing.JLabel();
        newPwRepeatField = new javax.swing.JPasswordField();
        renewButton = new javax.swing.JButton();
        background800x600Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PASSWORD CHANGE - KOZY BANK");

        paswordChangePanel.setBackground(new java.awt.Color(51, 51, 51));
        paswordChangePanel.setPreferredSize(new java.awt.Dimension(800, 600));
        paswordChangePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/goBackIcon.png"))); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        paswordChangePanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        nameLabel.setFont(new java.awt.Font("Verdana", 0, 32)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText("PASSWORD RENEW");
        paswordChangePanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, -1, 50));

        idNoLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        idNoLabel.setForeground(new java.awt.Color(204, 204, 204));
        idNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idNoLabel.setText("T.C. ID Number : ");
        paswordChangePanel.add(idNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 360, 50));

        idNoText.setBackground(new java.awt.Color(70, 80, 82));
        idNoText.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        idNoText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        paswordChangePanel.add(idNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 140, 220, 50));

        phoneNumberLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        phoneNumberLabel.setForeground(new java.awt.Color(204, 204, 204));
        phoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNumberLabel.setText("Phone Number : ");
        paswordChangePanel.add(phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 360, 50));

        phoneNumberText.setBackground(new java.awt.Color(70, 80, 82));
        phoneNumberText.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        phoneNumberText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        paswordChangePanel.add(phoneNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 210, 220, 50));

        securityQLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        securityQLabel.setForeground(new java.awt.Color(204, 204, 204));
        securityQLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        securityQLabel.setText("Security Question's Answer : ");
        paswordChangePanel.add(securityQLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 360, 50));

        securityQText.setBackground(new java.awt.Color(70, 80, 82));
        securityQText.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        securityQText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        paswordChangePanel.add(securityQText, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 280, 220, 50));

        oldPwLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        oldPwLabel.setForeground(new java.awt.Color(204, 204, 204));
        oldPwLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        oldPwLabel.setText("Old Password : ");
        paswordChangePanel.add(oldPwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 360, 50));

        oldPwField.setBackground(new java.awt.Color(70, 80, 82));
        oldPwField.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        oldPwField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        oldPwField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        paswordChangePanel.add(oldPwField, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 350, 220, 50));

        newPwLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        newPwLabel.setForeground(new java.awt.Color(204, 204, 204));
        newPwLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        newPwLabel.setText("New Password : ");
        paswordChangePanel.add(newPwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 360, 50));

        newPwField.setBackground(new java.awt.Color(70, 80, 82));
        newPwField.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        newPwField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        newPwField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        paswordChangePanel.add(newPwField, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 420, 220, 50));

        newPwRepeatLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        newPwRepeatLabel.setForeground(new java.awt.Color(204, 204, 204));
        newPwRepeatLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        newPwRepeatLabel.setText("New Password Repeat : ");
        paswordChangePanel.add(newPwRepeatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 360, 50));

        newPwRepeatField.setBackground(new java.awt.Color(70, 80, 82));
        newPwRepeatField.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        newPwRepeatField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        newPwRepeatField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        paswordChangePanel.add(newPwRepeatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 490, 220, 50));

        renewButton.setBackground(new java.awt.Color(60, 63, 65));
        renewButton.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        renewButton.setForeground(new java.awt.Color(204, 204, 204));
        renewButton.setText("Renew");
        renewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        renewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                renewButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                renewButtonMouseExited(evt);
            }
        });
        renewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewButtonActionPerformed(evt);
            }
        });
        paswordChangePanel.add(renewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 550, 110, 37));

        background800x600Label.setBackground(new java.awt.Color(70, 80, 82));
        background800x600Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background800x600.jpg"))); // NOI18N
        paswordChangePanel.add(background800x600Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paswordChangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paswordChangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked

        if(this.isEnabledOldPwField()){
        ActionSettings.setVisible(this, new SettingsScreen());
        } else {
        ActionSettings.setVisible(this, new FirstScreen());
        }
    }//GEN-LAST:event_backButtonMouseClicked
    private void renewButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renewButtonMouseEntered

        ButtonSettings.setBgFg(renewButton, Color.black, Color.white);
    }//GEN-LAST:event_renewButtonMouseEntered

    private void renewButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renewButtonMouseExited
        ButtonSettings.setOriginalBg(renewButton);
    }//GEN-LAST:event_renewButtonMouseExited

    private void renewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewButtonActionPerformed

        if(this.isInformationsValid()){
            this.renewThePassword();
        } else {
            Dialogs.showCannotBeEmptyMessage(this);
        }
    }//GEN-LAST:event_renewButtonActionPerformed

    private void renewThePassword(){
        String newPw = String.valueOf(this.newPwField.getPassword());
        String newPwRepeat = String.valueOf(this.newPwRepeatField.getPassword());
        if(newPw.equals(newPwRepeat)){
           if(String.valueOf(this.oldPwField.getPassword()).equals(newPw)) {
            Dialogs.showDefaultMessage(this, "Your old and new passwords cannot be same.");
        } else{
                this.acceptPw();
           }
        } else {
            Dialogs.showDefaultMessage(this, "Your new passwords aren't same.");
        }
    }
    
    private void acceptPw(){
        this.getPasswordRenewObject().setTcIdNo(this.idNoText.getText());
        this.getPasswordRenewObject().setPhoneNo(this.phoneNumberText.getText());
        this.getPasswordRenewObject().setSecurityAnswer(this.securityQText.getText());
        if (this.isEnabledOldPwField()) {
            this.getPasswordRenewObject().setOldPw(String.valueOf(this.oldPwField.getPassword()));
        }
        this.getPasswordRenewObject().setNewPw(String.valueOf(this.newPwField.getPassword()));
     if(this.getPasswordRenewObject().isPasswordRenewed()){
           if(this.isEnabledOldPwField()){
           Dialogs.showDefaultMessage(this,"Your password renewed.\nPlease re-login with your new password.");
           } else{
           Dialogs.showDefaultMessage(this,"Your password recovered.\nPlease login with your new password.");
           }
           ActionSettings.setVisible(this, new FirstScreen());
           getAccountInformations().logout();
     } else {
           Dialogs.showDefaultMessage(this,"Your password was not renew.\nPlease check your informations.");
       }
    }
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        paswordChangePanel.setFocusable(true);
        TextSettings.setOnlyNumber(idNoText);
        TextSettings.setMaxLimit(idNoText, 11);
        TextSettings.setOnlyNumber(phoneNumberText);
        TextSettings.setMaxLimit(phoneNumberText, 11);
        if (getAccountInformations().getUserId() == 0) {
            this.oldPwField.setEnabled(false);
        }
        
        
    }

    public JPasswordField getOldPwField() {
        return oldPwField;
    }
    
    

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PasswordChangeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordChangeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordChangeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordChangeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordChangeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel background800x600Label;
    private javax.swing.JLabel idNoLabel;
    private javax.swing.JTextField idNoText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField newPwField;
    private javax.swing.JLabel newPwLabel;
    private javax.swing.JPasswordField newPwRepeatField;
    private javax.swing.JLabel newPwRepeatLabel;
    private javax.swing.JPasswordField oldPwField;
    private javax.swing.JLabel oldPwLabel;
    private javax.swing.JPanel paswordChangePanel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JButton renewButton;
    private javax.swing.JLabel securityQLabel;
    private javax.swing.JTextField securityQText;
    // End of variables declaration//GEN-END:variables
}
