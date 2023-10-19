package gui;

import database.InformationController;
import database.transactions.AccountInformations;
import database.transactions.Deposit;
import java.awt.Color;
import settings.ActionSettings;
import settings.Edits;
import settings.TextSettings;
import settings.ButtonSettings;
import settings.Dialogs;

public class DepositScreen extends javax.swing.JFrame implements Edits, InformationController {

    private Deposit depositMoneyObject =null;
    private int depositMoney=0;

    public DepositScreen() {
        initComponents();
        getEdits();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        withdrawPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        balanceLabel2 = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        depositButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DEPOSIT - KOZY BANK");

        withdrawPanel.setBackground(new java.awt.Color(51, 51, 51));
        withdrawPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/goBackIcon.png"))); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        withdrawPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        nameLabel.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText("Dear [NAME SURNAME]");
        withdrawPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        warningLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(204, 204, 204));
        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        warningLabel.setText("You can deposit $10.000 or less in one time.");
        withdrawPanel.add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, -1, -1));

        balanceLabel.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(204, 204, 204));
        balanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        balanceLabel.setText("BALANCE :");
        withdrawPanel.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        balanceLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        balanceLabel2.setForeground(new java.awt.Color(204, 204, 204));
        balanceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceLabel2.setText("[BALANCE]");
        balanceLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        withdrawPanel.add(balanceLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 270, 45));

        amountLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(204, 204, 204));
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        amountLabel.setText("Deposit amount :");
        withdrawPanel.add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 353, 210, -1));

        amountText.setBackground(new java.awt.Color(70, 80, 82));
        amountText.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        amountText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        amountText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        amountText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        amountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountTextKeyReleased(evt);
            }
        });
        withdrawPanel.add(amountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 353, 300, -1));

        depositButton.setBackground(new java.awt.Color(60, 63, 65));
        depositButton.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
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
        withdrawPanel.add(depositButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.jpg"))); // NOI18N
        withdrawPanel.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(withdrawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(withdrawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public boolean isInformationsValid() {
        return !(this.amountText.getText().equals(""));
    }

    @Override
    public AccountInformations getAccountInformations() {
        return AccountInformations.getInstance();
    }
    
     public Deposit getDepositMoneyObject() {
        if(this.depositMoneyObject==null){
            depositMoneyObject = new Deposit();
        }
        return depositMoneyObject;
    }
    
    private void amountTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTextKeyReleased

       this.depositMoney = TextSettings.checkTheTextKeyReleased(amountText, 10000);
    }//GEN-LAST:event_amountTextKeyReleased

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked

        ActionSettings.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_backButtonMouseClicked

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
 if(this.isInformationsValid()){
           this.depositMoney();
        }
        else {
            Dialogs.showCannotBeEmptyMessage(this);
        }
    }//GEN-LAST:event_depositButtonActionPerformed

    private void depositMoney(){
        this.getDepositMoneyObject().setDepositAmount(depositMoney);
        if(getDepositMoneyObject().isMoneyDeposited()){            
            Dialogs.showDefaultMessage(this, "ACCOMPLISHED\nAmount of money deposited: $"+this.depositMoney);
            ActionSettings.setVisible(this, new AccountScreen());
        } else if(depositMoney==0){
            Dialogs.showDefaultMessage(this,"You cannot deposit 0$.");
        }
        else {
            Dialogs.showDefaultMessage(this,"Something went wrong!\n Try again or re-login your account.");
        }
    }
    private void depositButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositButtonMouseEntered
        ButtonSettings.setBgFg(depositButton, Color.black, Color.white);
    }//GEN-LAST:event_depositButtonMouseEntered

    private void depositButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositButtonMouseExited
        ButtonSettings.setOriginalBg(depositButton);
    }//GEN-LAST:event_depositButtonMouseExited

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        withdrawPanel.setFocusable(true);
        TextSettings.setOnlyNumber(amountText);
        TextSettings.setMaxLimit(amountText, 5);
        this.nameLabel.setText("Dear "+getAccountInformations().getNameSurname());
        this.balanceLabel2.setText(String.valueOf(getAccountInformations().getBalance())+" $");
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
            java.util.logging.Logger.getLogger(DepositScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountText;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel balanceLabel2;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JPanel withdrawPanel;
    // End of variables declaration//GEN-END:variables
}
