package gui;

import database.InformationController;
import database.transactions.AccountInformations;
import database.transactions.PhoneNoRenew;
import java.awt.Color;
import javax.swing.Icon;
import settings.ActionSettings;
import settings.Dialogs;
import settings.Edits;
import settings.TextSettings;


public class SettingsScreen extends javax.swing.JFrame implements Edits,InformationController {
    
    private PhoneNoRenew phoneNoRenewObject = null;
    private String oldPhoneNumber = getAccountInformations().getPhoneNo();
    
    public SettingsScreen() {
        initComponents();
        getEdits();
    }

    @Override
    public boolean isInformationsValid() {
        return !(this.numberText.getText().equals(""));
    }

    @Override
    public AccountInformations getAccountInformations() {
        return AccountInformations.getInstance();
    }

    public PhoneNoRenew getPhoneNoRenewObject() {
        if (this.phoneNoRenewObject == null) {
            phoneNoRenewObject = new PhoneNoRenew();
        }
        return phoneNoRenewObject;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        numberText = new javax.swing.JTextField();
        phoneNoGuideLabel = new javax.swing.JLabel();
        numberUpdateIcon = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        passwordUpdateIcon = new javax.swing.JLabel();
        passwordGuideLabel = new javax.swing.JLabel();
        background800x600Label = new javax.swing.JLabel();
        tickIconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SETTINGS - KOZY BANK");

        settingsPanel.setBackground(new java.awt.Color(51, 51, 51));
        settingsPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        settingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/goBackIcon.png"))); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        settingsPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        nameLabel.setFont(new java.awt.Font("Verdana", 0, 32)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText("Dear [NAME SURNAME]");
        settingsPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, -1, 50));

        numberLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(204, 204, 204));
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numberLabel.setText("Phone Number : ");
        settingsPanel.add(numberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 50));

        numberText.setBackground(new java.awt.Color(70, 80, 82));
        numberText.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        numberText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        numberText.setEnabled(false);
        settingsPanel.add(numberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 220, 50));

        phoneNoGuideLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        phoneNoGuideLabel.setForeground(new java.awt.Color(204, 204, 204));
        phoneNoGuideLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        phoneNoGuideLabel.setText("Your new phone number has to be like (05XXXXXXXXX) and 11 digits.");
        settingsPanel.add(phoneNoGuideLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 307, -1, 16));

        numberUpdateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/updateIcon.png"))); // NOI18N
        numberUpdateIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberUpdateIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberUpdateIconMouseClicked(evt);
            }
        });
        settingsPanel.add(numberUpdateIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLabel.setText("Password : ");
        settingsPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 203, 50));

        passwordField.setBackground(new java.awt.Color(70, 80, 82));
        passwordField.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        passwordField.setText("***********");
        passwordField.setEnabled(false);
        settingsPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 220, 50));

        passwordUpdateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/updateIcon.png"))); // NOI18N
        passwordUpdateIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordUpdateIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordUpdateIconMouseClicked(evt);
            }
        });
        settingsPanel.add(passwordUpdateIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        passwordGuideLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        passwordGuideLabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordGuideLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordGuideLabel.setText("For changing your password press update button, you will go to the password renew screen.");
        settingsPanel.add(passwordGuideLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 417, 590, 16));

        background800x600Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background800x600.jpg"))); // NOI18N
        settingsPanel.add(background800x600Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        tickIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tickIcon.png"))); // NOI18N
        settingsPanel.add(tickIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked

        ActionSettings.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_backButtonMouseClicked
    private Icon numberUpdateOriginalIcon;
    private int clickCounter = 0;
    private void numberUpdateIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberUpdateIconMouseClicked

        if(this.clickCounter ==0){
       
       this.numberText.setEnabled(true);
       this.numberText.setBackground(Color.DARK_GRAY);
       numberUpdateOriginalIcon=numberUpdateIcon.getIcon();
       numberUpdateIcon.setIcon(tickIconLabel.getIcon());
       clickCounter++;
        }
        else{
            this.numberText.setEnabled(false);
            this.phoneNoRenew();
            numberUpdateIcon.setIcon(numberUpdateOriginalIcon);
            clickCounter=0;
        }
    }//GEN-LAST:event_numberUpdateIconMouseClicked

    private void phoneNoRenew(){
        if(this.isInformationsValid()){
            String newPhoneNo= this.numberText.getText().trim();
            getPhoneNoRenewObject().setPhoneNo(newPhoneNo);
             if (getPhoneNoRenewObject().isItOk()) {
             Dialogs.showDefaultMessage(this, "Your phone number update process is completed.\nYour phone number from "+
             this.oldPhoneNumber +" has been updated to "+newPhoneNo+".");
             ActionSettings.setVisible(this, new SettingsScreen());
                }else if(this.oldPhoneNumber.equals(newPhoneNo)){
                Dialogs.showDefaultMessage(this, "Your old and new phone numbers cannot be the same.");
                this.numberText.setText(oldPhoneNumber);
                ActionSettings.setVisible(this, new SettingsScreen());
                }else if(TextSettings.isLengthShorter(11, newPhoneNo)){
                Dialogs.showDefaultMessage(this,"Your new phone number has to be 11 digits.\nTry again.");
                this.numberText.setText(oldPhoneNumber);
                ActionSettings.setVisible(this, new SettingsScreen()); 
                }else {
                Dialogs.showDefaultMessage(this,"Something went wrong!\n Try again or re-login your account.");
                this.numberText.setText(oldPhoneNumber);
                ActionSettings.setVisible(this, new SettingsScreen());
                }
            }else {
            Dialogs.showCannotBeEmptyMessage(this);
            this.numberText.setText(oldPhoneNumber);
            ActionSettings.setVisible(this, new SettingsScreen());
        }
    
    }
    
    private void passwordUpdateIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordUpdateIconMouseClicked
        this.passwordField.setEnabled(true);
        ActionSettings.setVisible(this, new PasswordChangeScreen());
    }//GEN-LAST:event_passwordUpdateIconMouseClicked

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        settingsPanel.setFocusable(true);
        TextSettings.setOnlyNumber(numberText);
        TextSettings.setMaxLimit(numberText, 11);
        this.nameLabel.setText("Dear "+getAccountInformations().getNameSurname());
        this.numberText.setText(oldPhoneNumber);
        
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
            java.util.logging.Logger.getLogger(SettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel background800x600Label;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberText;
    private javax.swing.JLabel numberUpdateIcon;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordGuideLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordUpdateIcon;
    private javax.swing.JLabel phoneNoGuideLabel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel tickIconLabel;
    // End of variables declaration//GEN-END:variables
}
