package gui;

import database.InformationController;
import database.transactions.AccountInformations;
import database.transactions.BillsPayment;
import settings.ActionSettings;
import settings.ButtonSettings;
import settings.Edits;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import settings.Dialogs;

public class PaymentsScreen extends javax.swing.JFrame implements Edits, InformationController {
    
    private BillsPayment billsPaymentObject = null;
    
    public PaymentsScreen() {
        initComponents();
        getEdits();
    }

    @Override
    public boolean isInformationsValid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AccountInformations getAccountInformations() {
        return AccountInformations.getInstance();
    }

    public BillsPayment getBillsPaymentObject() {
        if(this.billsPaymentObject==null){
            billsPaymentObject = new BillsPayment();
        }
        return billsPaymentObject;
    }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentsScreen = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        balanceLabel2 = new javax.swing.JLabel();
        ElectricLabel = new javax.swing.JLabel();
        eDebtLabel = new javax.swing.JLabel();
        ePayButton = new javax.swing.JButton();
        nGasLabel = new javax.swing.JLabel();
        nGDebtLabel = new javax.swing.JLabel();
        nGPayButton = new javax.swing.JButton();
        wLabel = new javax.swing.JLabel();
        wDebtLabel = new javax.swing.JLabel();
        wPayButton = new javax.swing.JButton();
        iLabel = new javax.swing.JLabel();
        iDebtLabel = new javax.swing.JLabel();
        iPayButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PAYMENTS - KOZY BANK");

        paymentsScreen.setBackground(new java.awt.Color(51, 51, 51));
        paymentsScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/goBackIcon.png"))); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        paymentsScreen.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        nameLabel.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText("Dear [NAME SURNAME]");
        paymentsScreen.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        balanceLabel.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(204, 204, 204));
        balanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        balanceLabel.setText("BALANCE :");
        paymentsScreen.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        balanceLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        balanceLabel2.setForeground(new java.awt.Color(204, 204, 204));
        balanceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceLabel2.setText("[BALANCE]");
        balanceLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paymentsScreen.add(balanceLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 270, 45));

        ElectricLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        ElectricLabel.setForeground(new java.awt.Color(204, 204, 204));
        ElectricLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ElectricLabel.setText("Electricity Bill :");
        paymentsScreen.add(ElectricLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 390, 250, 45));

        eDebtLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        eDebtLabel.setForeground(new java.awt.Color(204, 204, 204));
        eDebtLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eDebtLabel.setText("[DEBT]");
        eDebtLabel.setToolTipText("");
        paymentsScreen.add(eDebtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 390, 150, 45));

        ePayButton.setBackground(new java.awt.Color(60, 63, 65));
        ePayButton.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        ePayButton.setForeground(new java.awt.Color(204, 204, 204));
        ePayButton.setText("Pay");
        ePayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ePayButton.setPreferredSize(new java.awt.Dimension(129, 45));
        ePayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ePayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ePayButtonMouseExited(evt);
            }
        });
        ePayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ePayButtonActionPerformed(evt);
            }
        });
        paymentsScreen.add(ePayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 100, -1));

        nGasLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        nGasLabel.setForeground(new java.awt.Color(204, 204, 204));
        nGasLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nGasLabel.setText("Natural Gas Bill :");
        paymentsScreen.add(nGasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 460, 250, 45));

        nGDebtLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        nGDebtLabel.setForeground(new java.awt.Color(204, 204, 204));
        nGDebtLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nGDebtLabel.setText("[DEBT]");
        paymentsScreen.add(nGDebtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 460, 150, 45));

        nGPayButton.setBackground(new java.awt.Color(60, 63, 65));
        nGPayButton.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        nGPayButton.setForeground(new java.awt.Color(204, 204, 204));
        nGPayButton.setText("Pay");
        nGPayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nGPayButton.setPreferredSize(new java.awt.Dimension(129, 45));
        nGPayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nGPayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nGPayButtonMouseExited(evt);
            }
        });
        nGPayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nGPayButtonActionPerformed(evt);
            }
        });
        paymentsScreen.add(nGPayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 100, -1));

        wLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        wLabel.setForeground(new java.awt.Color(204, 204, 204));
        wLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        wLabel.setText("Water Bill :");
        paymentsScreen.add(wLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 530, 250, 45));

        wDebtLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        wDebtLabel.setForeground(new java.awt.Color(204, 204, 204));
        wDebtLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        wDebtLabel.setText("[DEBT]");
        paymentsScreen.add(wDebtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 530, 150, 45));

        wPayButton.setBackground(new java.awt.Color(60, 63, 65));
        wPayButton.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        wPayButton.setForeground(new java.awt.Color(204, 204, 204));
        wPayButton.setText("Pay");
        wPayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wPayButton.setPreferredSize(new java.awt.Dimension(129, 45));
        wPayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wPayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wPayButtonMouseExited(evt);
            }
        });
        wPayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wPayButtonActionPerformed(evt);
            }
        });
        paymentsScreen.add(wPayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 100, -1));

        iLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        iLabel.setForeground(new java.awt.Color(204, 204, 204));
        iLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iLabel.setText("Internet Bill :");
        paymentsScreen.add(iLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 600, 250, 45));

        iDebtLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        iDebtLabel.setForeground(new java.awt.Color(204, 204, 204));
        iDebtLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iDebtLabel.setText("[DEBT]");
        paymentsScreen.add(iDebtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 600, 150, 45));

        iPayButton.setBackground(new java.awt.Color(60, 63, 65));
        iPayButton.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        iPayButton.setForeground(new java.awt.Color(204, 204, 204));
        iPayButton.setText("Pay");
        iPayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iPayButton.setPreferredSize(new java.awt.Dimension(129, 45));
        iPayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iPayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iPayButtonMouseExited(evt);
            }
        });
        iPayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iPayButtonActionPerformed(evt);
            }
        });
        paymentsScreen.add(iPayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, 100, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.jpg"))); // NOI18N
        paymentsScreen.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentsScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentsScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setBgFg(Component c) {
       
        ButtonSettings.setBgFg((JButton) c, Color.black, Color.white);
    }
    
    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked

        ActionSettings.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_backButtonMouseClicked

    private void ePayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ePayButtonMouseEntered

        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_ePayButtonMouseEntered

    private void ePayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ePayButtonMouseExited

        ButtonSettings.setOriginalBg(ePayButton);
    }//GEN-LAST:event_ePayButtonMouseExited

    private void ePayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ePayButtonActionPerformed

        double electricityAmount = getAccountInformations().getEbill();
        if(this.hasAlreadyPaid(electricityAmount)){
            Dialogs.showDefaultMessage(this,"Your electricity debt has already been paid.");
        } else {
           this.payBill("ebill",electricityAmount);
           
        }
    }//GEN-LAST:event_ePayButtonActionPerformed

    private void nGPayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nGPayButtonMouseEntered

        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_nGPayButtonMouseEntered

    private void nGPayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nGPayButtonMouseExited
        
        ButtonSettings.setOriginalBg(nGPayButton);
    }//GEN-LAST:event_nGPayButtonMouseExited

    private void nGPayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nGPayButtonActionPerformed
        
        double naturalGasAmount = getAccountInformations().getNgbill();
        if(this.hasAlreadyPaid(naturalGasAmount)){
            Dialogs.showDefaultMessage(this,"Your natural gas debt has already been paid.");
        } else {
           this.payBill("ngbill",naturalGasAmount);
           
        }
    }//GEN-LAST:event_nGPayButtonActionPerformed

    private void wPayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wPayButtonMouseEntered
        
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_wPayButtonMouseEntered

    private void wPayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wPayButtonMouseExited
        
        ButtonSettings.setOriginalBg(wPayButton);
    }//GEN-LAST:event_wPayButtonMouseExited

    private void wPayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wPayButtonActionPerformed
        
        double waterAmount = getAccountInformations().getWbill();
        if(this.hasAlreadyPaid(waterAmount)){
            Dialogs.showDefaultMessage(this,"Your water debt has already been paid.");
        } else {
           this.payBill("wbill",waterAmount);
           
        }
    }//GEN-LAST:event_wPayButtonActionPerformed

    private void iPayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPayButtonMouseEntered
        
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_iPayButtonMouseEntered

    private void iPayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPayButtonMouseExited
        
        ButtonSettings.setOriginalBg(iPayButton);
    }//GEN-LAST:event_iPayButtonMouseExited

    private void iPayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iPayButtonActionPerformed
        
        double internetAmount = getAccountInformations().getIbill();
        if(this.hasAlreadyPaid(internetAmount)){
            Dialogs.showDefaultMessage(this,"Your internet debt has already been paid.");
        } else {
           this.payBill("ibill",internetAmount);
           
        }
    }//GEN-LAST:event_iPayButtonActionPerformed
//------------------------------------------------------------------------------------------------------------
    private boolean hasAlreadyPaid(double billAmount){
        return billAmount ==0;        
    }

    private void payBill(String billName,double billAmount){
        this.getBillsPaymentObject().setBillName(billName);
        this.getBillsPaymentObject().setBillAmount(billAmount);
        if(getBillsPaymentObject().isItOk()){
            switch(billsPaymentObject.getBillName()) {
                case "ebill":
                    Dialogs.showDefaultMessage(this, "Your electricity bill has been paid."); 
                    break;
                case "wbill":
                    Dialogs.showDefaultMessage(this, "Your water bill has been paid."); 
                    break;
                case "ngbill":
                    Dialogs.showDefaultMessage(this, "Your natural gas bill has been paid."); 
                    break;
                case "ibill":
                    Dialogs.showDefaultMessage(this, "Your internet bill has been paid."); 
                    break;
            } 
            ActionSettings.setVisible(this, new PaymentsScreen());
        } else if(billsPaymentObject.getBillAmount()>getAccountInformations().getBalance()){
            Dialogs.showDefaultMessage(this,"You have not enough balance.\nYou need "+(this.getBillsPaymentObject().getBillAmount()-getAccountInformations().getBalance())+ "$ more.");
        } else{
            Dialogs.showDefaultMessage(this,"Something went wrong!\n Try again or re-login your account.");
        }
    }
 //-----------------------------------------------------------------------------------------------------------   
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        paymentsScreen.setFocusable(true);
        this.nameLabel.setText("Dear "+getAccountInformations().getNameSurname());
        this.balanceLabel2.setText(String.valueOf(getAccountInformations().getBalance())+" $");
        this.eDebtLabel.setText(String.valueOf(getAccountInformations().getEbill())+" $");
        this.nGDebtLabel.setText(String.valueOf(getAccountInformations().getNgbill())+" $");
        this.wDebtLabel.setText(String.valueOf(getAccountInformations().getWbill())+" $");
        this.iDebtLabel.setText(String.valueOf(getAccountInformations().getIbill())+" $");
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
            java.util.logging.Logger.getLogger(PaymentsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ElectricLabel;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel balanceLabel2;
    private javax.swing.JLabel eDebtLabel;
    private javax.swing.JButton ePayButton;
    private javax.swing.JLabel iDebtLabel;
    private javax.swing.JLabel iLabel;
    private javax.swing.JButton iPayButton;
    private javax.swing.JLabel nGDebtLabel;
    private javax.swing.JButton nGPayButton;
    private javax.swing.JLabel nGasLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel paymentsScreen;
    private javax.swing.JLabel wDebtLabel;
    private javax.swing.JLabel wLabel;
    private javax.swing.JButton wPayButton;
    // End of variables declaration//GEN-END:variables
}
