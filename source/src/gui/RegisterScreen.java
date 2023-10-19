package gui;

import database.InformationController;
import database.transactions.AccountInformations;
import database.transactions.UserRegistration;
import settings.ActionSettings;
import settings.ButtonSettings;
import settings.Edits;
import settings.TextSettings;
import java.awt.Color;
import settings.Dialogs;

public class RegisterScreen extends javax.swing.JFrame implements Edits,InformationController{


    private UserRegistration userRegistrationObject = null;
    
    public RegisterScreen() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        goBackButton = new javax.swing.JLabel();
        registerLabel = new javax.swing.JLabel();
        personalLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        securityLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        questionComboBox = new javax.swing.JComboBox<>();
        answerLabel = new javax.swing.JLabel();
        answerText = new javax.swing.JTextField();
        signupButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRATION - KOZY BANK");

        registerPanel.setBackground(new java.awt.Color(51, 51, 51));
        registerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/goBackIcon.png"))); // NOI18N
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButtonMouseClicked(evt);
            }
        });
        registerPanel.add(goBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        registerLabel.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLabel.setText(" REGISTRATION ");
        registerLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registerPanel.add(registerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        personalLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        personalLabel.setForeground(new java.awt.Color(204, 204, 204));
        personalLabel.setText(" PERSONAL DETAİLS ");
        personalLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerPanel.add(personalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 40));

        nameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText(" NAME - SURNAME");
        nameLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 175, 40));

        idLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(204, 204, 204));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLabel.setText(" T.C. ID NUMBER");
        idLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerPanel.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 175, 40));

        phoneLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(204, 204, 204));
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        phoneLabel.setText(" PHONE NUMBER");
        phoneLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerPanel.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 175, 40));

        nameText.setBackground(new java.awt.Color(60, 63, 65));
        nameText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nameText.setForeground(new java.awt.Color(204, 204, 204));
        nameText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameText.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        registerPanel.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 500, 40));

        idText.setBackground(new java.awt.Color(60, 63, 65));
        idText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        idText.setForeground(new java.awt.Color(204, 204, 204));
        idText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idText.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        registerPanel.add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 500, 40));

        phoneText.setBackground(new java.awt.Color(60, 63, 65));
        phoneText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        phoneText.setForeground(new java.awt.Color(204, 204, 204));
        phoneText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneText.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        registerPanel.add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 500, 40));

        securityLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        securityLabel.setForeground(new java.awt.Color(204, 204, 204));
        securityLabel.setText(" SECURITY DETAİLS ");
        securityLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerPanel.add(securityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 40));

        questionLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(204, 204, 204));
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        questionLabel.setText(" SECURITY QUESTION");
        questionLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerPanel.add(questionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 175, 40));

        questionComboBox.setBackground(new java.awt.Color(60, 63, 65));
        questionComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        questionComboBox.setForeground(new java.awt.Color(204, 204, 204));
        questionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was your favorite school teacher’s name?", "What was your first car?", "What city were you born in?", "In what city or town did your parents meet?", "Use your special keywords." }));
        questionComboBox.setToolTipText("");
        questionComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerPanel.add(questionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 500, 40));

        answerLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        answerLabel.setForeground(new java.awt.Color(204, 204, 204));
        answerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        answerLabel.setText(" SECURITY ANSWER");
        answerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerPanel.add(answerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 175, 40));

        answerText.setBackground(new java.awt.Color(60, 63, 65));
        answerText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        answerText.setForeground(new java.awt.Color(204, 204, 204));
        answerText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        answerText.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        registerPanel.add(answerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 500, 40));

        signupButton.setBackground(new java.awt.Color(60, 63, 65));
        signupButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(204, 204, 204));
        signupButton.setText("Signup");
        signupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupButtonMouseExited(evt);
            }
        });
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        registerPanel.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, 150, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.jpg"))); // NOI18N
        registerPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     -------------------------------------------------------------------------
    Buttons' Color Settings
    */
    private void signupButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButtonMouseEntered

        ButtonSettings.setBgFg(signupButton, Color.black, Color.white);
    }//GEN-LAST:event_signupButtonMouseEntered

    private void signupButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButtonMouseExited

        ButtonSettings.setOriginalBg(signupButton);
    }//GEN-LAST:event_signupButtonMouseExited

    /*
     -------------------------------------------------------------------------
    Buttons' Action Settings
    */
    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed

        if(this.isInformationsValid()){
            this.performRegistration();
        }else{
           Dialogs.showCannotBeEmptyMessage(this);
        }

    }//GEN-LAST:event_signupButtonActionPerformed

    private void performRegistration(){
        
        //Personal Informations
        this.getUserRegistrationObject().setNameSurname(this.nameText.getText().trim());
        this.getUserRegistrationObject().setTcIDNo(this.idText.getText().trim());
        this.getUserRegistrationObject().setPhoneNo(this.phoneText.getText().trim());
        
        //Security Informations
        this.getUserRegistrationObject().setSecurityQuestion(String.valueOf(this.questionComboBox.getSelectedItem()));
        this.getUserRegistrationObject().setSecurityAnswer(this.answerText.getText().trim());
        
        //Informations that are given by system
        this.getUserRegistrationObject().setCustomerNo(this.randomCustomerNo());
        this.getUserRegistrationObject().setPassword(this.randomPassword());
        
        if (this.getUserRegistrationObject().wasYourRegistrationAccepted()) {
            //Default Message
        Dialogs.showDefaultMessage(this, "Your registration was accepted.\n"
                + "Your customer number: "+this.getUserRegistrationObject().getCustomerNo()
                + "\nYour password: "+this.getUserRegistrationObject().getPassword());
            ActionSettings.setVisible(this, new FirstScreen());
        } else{
            Dialogs.showDefaultMessage(this, "Your registration was rejected.\nPlease check your informations.");

        }

    }
        
        private String randomCustomerNo() {
         String customerNo;
       do{
         customerNo = String.valueOf(100000+(int)(Math.random()*9000000));
       } while (this.getUserRegistrationObject().isThereSameCustomerNo());
       return customerNo;
        }
        
         private String randomPassword() {
         String password;
         password = String.valueOf(1000+(int)(Math.random()*9000));
         return password;
        }
    
    
    
    private void goBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButtonMouseClicked

        ActionSettings.setVisible(this, new FirstScreen());
    }//GEN-LAST:event_goBackButtonMouseClicked

    
   

    @Override
    public void getEdits() {
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         TextSettings.setOnlyAlphabetic(nameText);
         TextSettings.setOnlyNumber(idText);
         TextSettings.setOnlyNumber(phoneText);
         TextSettings.setMaxLimit(idText, 11);
         TextSettings.setMaxLimit(phoneText, 11);
    }
    
    

    public UserRegistration getUserRegistrationObject() {
        if(this.userRegistrationObject==null){
           userRegistrationObject = new UserRegistration();
        }
        return userRegistrationObject;
    }

    @Override
    public boolean isInformationsValid() {

        return TextSettings.isTextAreaFill(registerPanel);
    }

    @Override
    public AccountInformations getAccountInformations() {
        return AccountInformations.getInstance();
    }

    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerLabel;
    private javax.swing.JTextField answerText;
    private javax.swing.JLabel background;
    private javax.swing.JLabel goBackButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel personalLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JComboBox<String> questionComboBox;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel securityLabel;
    private javax.swing.JButton signupButton;
    // End of variables declaration//GEN-END:variables
}
