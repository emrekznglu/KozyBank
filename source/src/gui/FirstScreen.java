package gui;

import database.DbConnection;
import database.InformationController;
import database.transactions.AccountInformations;
import database.transactions.UserLogin;
import settings.ActionSettings;
import settings.ButtonSettings;
import settings.Edits;
import settings.TextSettings;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import settings.Dialogs;

public final class FirstScreen extends javax.swing.JFrame implements Edits, InformationController{
    
    private UserLogin userLoginObject = null;
    private final String ID_TEXT_ORIGINAL = "T.C ID NUMBER / CUSTOMER NUMBER";
    private final String PW_TEXT_ORIGINAL = "******";
    
    public FirstScreen() {
        initComponents();
        getEdits();
        new DbConnection();
    }

    @Override
    public boolean isInformationsValid() {
    return !(this.idNoText.getText().equals(this.ID_TEXT_ORIGINAL)
                || String.valueOf(this.pwText.getPassword()).equals(this.PW_TEXT_ORIGINAL));
    }

    @Override
    public AccountInformations getAccountInformations() {
       return AccountInformations.getInstance();
    }

    public UserLogin getUserLoginObject() {
        if(this.userLoginObject == null){
            userLoginObject = new UserLogin();
        }
        return userLoginObject;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstScreenPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        idNoText = new javax.swing.JTextField();
        pwText = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        forgetPwLabel = new javax.swing.JLabel();
        forgetPwButton = new javax.swing.JButton();
        registerLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        emrekzngluEMarkLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KOZY  BANK");

        firstScreenPanel.setBackground(new java.awt.Color(51, 51, 51));
        firstScreenPanel.setPreferredSize(new java.awt.Dimension(1024, 768));
        firstScreenPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Goudy Old Style", 3, 56)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/kozyBankIcon.png"))); // NOI18N
        titleLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        firstScreenPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 520, 90));

        idNoText.setBackground(new java.awt.Color(70, 80, 82));
        idNoText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        idNoText.setForeground(new java.awt.Color(204, 204, 204));
        idNoText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idNoText.setToolTipText("");
        idNoText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        idNoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idNoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idNoTextFocusLost(evt);
            }
        });
        firstScreenPanel.add(idNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 281, 400, 54));

        pwText.setBackground(new java.awt.Color(70, 80, 82));
        pwText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        pwText.setForeground(new java.awt.Color(204, 204, 204));
        pwText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pwText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwTextFocusLost(evt);
            }
        });
        firstScreenPanel.add(pwText, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 353, 400, 54));

        loginButton.setBackground(new java.awt.Color(60, 63, 65));
        loginButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(204, 204, 204));
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        firstScreenPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 419, 150, 45));

        forgetPwLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        forgetPwLabel.setForeground(new java.awt.Color(255, 255, 255));
        forgetPwLabel.setText("Did you forget your password?");
        firstScreenPanel.add(forgetPwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 200, 26));

        forgetPwButton.setBackground(new java.awt.Color(60, 63, 65));
        forgetPwButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        forgetPwButton.setForeground(new java.awt.Color(204, 204, 204));
        forgetPwButton.setText("Recover it");
        forgetPwButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgetPwButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgetPwButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgetPwButtonMouseExited(evt);
            }
        });
        forgetPwButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPwButtonActionPerformed(evt);
            }
        });
        firstScreenPanel.add(forgetPwButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 100, 26));

        registerLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLabel.setText("Are you still not our customer?");
        firstScreenPanel.add(registerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 200, 26));

        registerButton.setBackground(new java.awt.Color(60, 63, 65));
        registerButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(204, 204, 204));
        registerButton.setText("Sign up");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        firstScreenPanel.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 100, 26));

        emrekzngluEMarkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emrekzngluEMark.png"))); // NOI18N
        emrekzngluEMarkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emrekzngluEMarkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emrekzngluEMarkLabelMouseClicked(evt);
            }
        });
        firstScreenPanel.add(emrekzngluEMarkLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 727, 101, 35));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.jpg"))); // NOI18N
        firstScreenPanel.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        firstScreenPanel.setFocusable(true);
        idNoText.setText(ID_TEXT_ORIGINAL);
        pwText.setText(PW_TEXT_ORIGINAL);
       TextSettings.setOnlyNumber(idNoText);
       
    }
    
   
    
    /*
     -------------------------------------------------------------------------
    Texts Focuses
    */
    
    private void idNoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idNoTextFocusGained

        TextSettings.checkTheTextFocusGained(idNoText, ID_TEXT_ORIGINAL);

    }//GEN-LAST:event_idNoTextFocusGained

    private void idNoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idNoTextFocusLost

        TextSettings.checkTheTextFocusLost(idNoText);
    }//GEN-LAST:event_idNoTextFocusLost

    private void pwTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwTextFocusGained

        TextSettings.checkTheTextFocusGained(pwText, PW_TEXT_ORIGINAL);
        
    }//GEN-LAST:event_pwTextFocusGained

    private void pwTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwTextFocusLost

        TextSettings.checkTheTextFocusLost(pwText);
    }//GEN-LAST:event_pwTextFocusLost

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered

        ButtonSettings.setBgFg(loginButton, Color.black, Color.white);
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited

        ButtonSettings.setOriginalBg(loginButton);
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        if(this.isInformationsValid()){
           String customerId = this.idNoText.getText().trim();
           String password =  String.valueOf(this.pwText.getPassword());
           this.login(customerId,password);
        } else {
            Dialogs.showCannotBeEmptyMessage(this);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

           private void login(String customerId,String password){
            this.getUserLoginObject().setCustomerId(customerId);
            this.getUserLoginObject().setPassword(password);
            
            if(getUserLoginObject().isLoginInformationsValid()){
                ActionSettings.setVisible(this, new AccountScreen());
                
            }
            else{
                Dialogs.showDefaultMessage(this, "You did wrong or missing keystroke.\nPlease check your keystrokes.");
            }
           }
    
    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered

        ButtonSettings.setBgFg(registerButton, Color.black, Color.white);
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited

        ButtonSettings.setOriginalBg(registerButton);
    }//GEN-LAST:event_registerButtonMouseExited

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed

        ActionSettings.setVisible(this, new RegisterScreen());
    }//GEN-LAST:event_registerButtonActionPerformed

    private void forgetPwButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPwButtonMouseEntered

        ButtonSettings.setBgFg(forgetPwButton, Color.black, Color.white);
    }//GEN-LAST:event_forgetPwButtonMouseEntered

    private void forgetPwButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPwButtonMouseExited

        ButtonSettings.setOriginalBg(forgetPwButton);
    }//GEN-LAST:event_forgetPwButtonMouseExited

    private void forgetPwButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPwButtonActionPerformed
        ActionSettings.setVisible(this, new PasswordChangeScreen());
    }//GEN-LAST:event_forgetPwButtonActionPerformed

    private void emrekzngluEMarkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emrekzngluEMarkLabelMouseClicked

         String question = "A GitHub page will open in your browser. Do you want to be referred?";
        if (Dialogs.showAcceptMessage(this, question) == 1) {
        try {
            Desktop.getDesktop().browse(new URL(getAccountInformations().getMyGitHubAccount()).toURI());
        } catch (Exception ex) {
            Logger.getLogger(FirstScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_emrekzngluEMarkLabelMouseClicked

    /*
     -------------------------------------------------------------------------
    
    */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FirstScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel emrekzngluEMarkLabel;
    private javax.swing.JPanel firstScreenPanel;
    private javax.swing.JButton forgetPwButton;
    private javax.swing.JLabel forgetPwLabel;
    private javax.swing.JTextField idNoText;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField pwText;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
