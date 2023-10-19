
package gui;

import database.InformationController;
import database.transactions.AccountInformations;
import settings.ActionSettings;
import settings.ButtonSettings;
import settings.Edits;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import settings.Dialogs;


public class AccountScreen extends javax.swing.JFrame implements Edits,InformationController{


    public AccountScreen() {
        initComponents();
        getEdits();
    }

 
    @SuppressWarnings("unchecked")



/*
 --------------------------------------------------------------------------------------------
 Button Settings
 Color Settings
*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountPanel = new javax.swing.JPanel();
        logoutButton = new javax.swing.JLabel();
        settingsButton = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        usdIcon = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        withdrawIcon = new javax.swing.JLabel();
        withdrawButton = new javax.swing.JButton();
        bankCaseIcon = new javax.swing.JLabel();
        depositButton = new javax.swing.JButton();
        moneyTransferIcon = new javax.swing.JLabel();
        transfersButton = new javax.swing.JButton();
        paymentsIcon = new javax.swing.JLabel();
        paymentsButton = new javax.swing.JButton();
        emrekzngluEMarkLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU - KOZY BANK");

        accountPanel.setBackground(new java.awt.Color(51, 51, 51));
        accountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quitIcon.png"))); // NOI18N
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        accountPanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settingsIcon.png"))); // NOI18N
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
        });
        accountPanel.add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 6, 50, 50));

        welcomeLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(204, 204, 204));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("WELCOME TO THE KOZY BANK");
        accountPanel.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        nameLabel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("[NAME SURNAME]");
        accountPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 430, -1));

        usdIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        usdIcon.setForeground(new java.awt.Color(204, 204, 204));
        usdIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usdIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usdIcon.png"))); // NOI18N
        accountPanel.add(usdIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 300, 100, 100));

        balanceLabel.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(204, 204, 204));
        balanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceLabel.setText("[BALANCE]");
        balanceLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        accountPanel.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 270, 100));

        withdrawIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        withdrawIcon.setForeground(new java.awt.Color(204, 204, 204));
        withdrawIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        withdrawIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/withdrawIcon.png"))); // NOI18N
        accountPanel.add(withdrawIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 495, 125, 125));

        withdrawButton.setBackground(new java.awt.Color(60, 63, 65));
        withdrawButton.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        withdrawButton.setForeground(new java.awt.Color(204, 204, 204));
        withdrawButton.setText("Withdraw");
        withdrawButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withdrawButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                withdrawButtonMouseExited(evt);
            }
        });
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });
        accountPanel.add(withdrawButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 640, 125, 50));

        bankCaseIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        bankCaseIcon.setForeground(new java.awt.Color(204, 204, 204));
        bankCaseIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bankCaseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bankCaseIcon.png"))); // NOI18N
        accountPanel.add(bankCaseIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 495, 125, 125));

        depositButton.setBackground(new java.awt.Color(60, 63, 65));
        depositButton.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        depositButton.setForeground(new java.awt.Color(204, 204, 204));
        depositButton.setText("Deposit");
        depositButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depositButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depositButtonMouseExited(evt);
            }
        });
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });
        accountPanel.add(depositButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 640, 125, 50));

        moneyTransferIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        moneyTransferIcon.setForeground(new java.awt.Color(204, 204, 204));
        moneyTransferIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneyTransferIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/moneyTransferIcon.png"))); // NOI18N
        accountPanel.add(moneyTransferIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 495, 125, 125));

        transfersButton.setBackground(new java.awt.Color(60, 63, 65));
        transfersButton.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        transfersButton.setForeground(new java.awt.Color(204, 204, 204));
        transfersButton.setText("Transfers");
        transfersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transfersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transfersButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transfersButtonMouseExited(evt);
            }
        });
        transfersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfersButtonActionPerformed(evt);
            }
        });
        accountPanel.add(transfersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 640, 125, 50));

        paymentsIcon.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        paymentsIcon.setForeground(new java.awt.Color(204, 204, 204));
        paymentsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymentsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/creditCardIcon.png"))); // NOI18N
        accountPanel.add(paymentsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 495, 125, 125));

        paymentsButton.setBackground(new java.awt.Color(60, 63, 65));
        paymentsButton.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        paymentsButton.setForeground(new java.awt.Color(204, 204, 204));
        paymentsButton.setText("Payments");
        paymentsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paymentsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentsButtonMouseExited(evt);
            }
        });
        paymentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentsButtonActionPerformed(evt);
            }
        });
        accountPanel.add(paymentsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 640, 125, 50));

        emrekzngluEMarkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emrekzngluEMark.png"))); // NOI18N
        emrekzngluEMarkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emrekzngluEMarkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emrekzngluEMarkLabelMouseClicked(evt);
            }
        });
        accountPanel.add(emrekzngluEMarkLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 727, 101, 35));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.jpg"))); // NOI18N
        accountPanel.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawButtonMouseEntered

        ButtonSettings.setBgFg(withdrawButton, Color.black, Color.white);
    }//GEN-LAST:event_withdrawButtonMouseEntered

    private void withdrawButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawButtonMouseExited

        ButtonSettings.setOriginalBg(withdrawButton);
    }//GEN-LAST:event_withdrawButtonMouseExited

    private void depositButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositButtonMouseEntered

         ButtonSettings.setBgFg(depositButton, Color.black, Color.white);
    }//GEN-LAST:event_depositButtonMouseEntered

    private void depositButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositButtonMouseExited

        ButtonSettings.setOriginalBg(depositButton);
    }//GEN-LAST:event_depositButtonMouseExited

    private void transfersButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transfersButtonMouseEntered

         ButtonSettings.setBgFg(transfersButton, Color.black, Color.white);
    }//GEN-LAST:event_transfersButtonMouseEntered

    private void transfersButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transfersButtonMouseExited

        ButtonSettings.setOriginalBg(transfersButton);
    }//GEN-LAST:event_transfersButtonMouseExited

    private void paymentsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsButtonMouseEntered

         ButtonSettings.setBgFg(paymentsButton, Color.black, Color.white);
    }//GEN-LAST:event_paymentsButtonMouseEntered

    private void paymentsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsButtonMouseExited

        ButtonSettings.setOriginalBg(paymentsButton);
    }//GEN-LAST:event_paymentsButtonMouseExited

    /*
    --------------------------------------------------------------------------------------------
    Action Settings
    */
    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked

        String question = "Do you want to logout from your account?";
        if (Dialogs.showAcceptMessage(this, question) == 1) {
            AccountInformations.getInstance().logout();
            ActionSettings.setVisible(this, new FirstScreen());
        }
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked

        ActionSettings.setVisible(this,new SettingsScreen());
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed

        ActionSettings.setVisible(this, new WithdrawScreen());
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed

         ActionSettings.setVisible(this,new DepositScreen());
    }//GEN-LAST:event_depositButtonActionPerformed

    private void transfersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfersButtonActionPerformed

        ActionSettings.setVisible(this, new TransfersScreen());
    }//GEN-LAST:event_transfersButtonActionPerformed

    private void paymentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentsButtonActionPerformed

        ActionSettings.setVisible(this, new PaymentsScreen());
    }//GEN-LAST:event_paymentsButtonActionPerformed

    private void emrekzngluEMarkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emrekzngluEMarkLabelMouseClicked
       String question = "A GitHub page will open in your browser. Do you want to be referred?";
        if (Dialogs.showAcceptMessage(this, question) == 1) {
           try {
               Desktop.getDesktop().browse(new URL(getAccountInformations().getMyGitHubAccount()).toURI());
           } catch (Exception ex) {
               Logger.getLogger(AccountScreen.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_emrekzngluEMarkLabelMouseClicked

    /*
    --------------------------------------------------------------------------------------------
    
    */
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        accountPanel.setFocusable(true);
        this.nameLabel.setText(getAccountInformations().getNameSurname());
        this.balanceLabel.setText(String.valueOf(getAccountInformations().getBalance()));
    }

    @Override
    public boolean isInformationsValid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AccountInformations getAccountInformations() {
        return AccountInformations.getInstance();
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
            java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountPanel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel bankCaseIcon;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel emrekzngluEMarkLabel;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel moneyTransferIcon;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton paymentsButton;
    private javax.swing.JLabel paymentsIcon;
    private javax.swing.JLabel settingsButton;
    private javax.swing.JButton transfersButton;
    private javax.swing.JLabel usdIcon;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JLabel withdrawIcon;
    // End of variables declaration//GEN-END:variables
}
