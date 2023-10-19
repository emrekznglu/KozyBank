package database.transactions;

import database.DbConnection;
import database.InformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emrek
 */
public class BillsPayment extends DbConnection implements InformationController {
    
    private String billName=null;
    private double billAmount=0;
    
    public boolean isItOk(){
        if(isInformationsValid()) {
            String query = "UPDATE user_bills "
                    + "SET " + this.billName + " = 0 "
                    + "WHERE user_id = '" + getAccountInformations().getUserId()+ "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                this.decreaseBalance();
                this.resetBills();
            } catch (SQLException ex) {
                Logger.getLogger(BillsPayment.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            return true;
        } else {
            return false;
        }
    }
    
    private void decreaseBalance(){
        String query = "UPDATE user_balance SET balance = balance - '"+this.billAmount+"' WHERE user_id = '"+getAccountInformations().getUserId()+"'";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
            getAccountInformations().setBalance(getAccountInformations().getBalance()- this.billAmount);
        } catch (SQLException ex) {
            Logger.getLogger(BillsPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void resetBills() {
        if(isInformationsValid()) {
            switch(this.billName) {
                case "ebill":
                    getAccountInformations().setEbill(0);
                    break;
                case "wbill":
                    getAccountInformations().setWbill(0);
                    break;
                case "ngbill":
                    getAccountInformations().setNgbill(0);
                    break;
                case "ibill":
                    getAccountInformations().setIbill(0);
                    break;
            } 
        }
    }
    
    @Override
    public boolean isInformationsValid() {
        return !(this.billName == null || billAmount ==0 || getAccountInformations().getBalance() < this.billAmount);
    }

    @Override
    public AccountInformations getAccountInformations() {
        return AccountInformations.getInstance();
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }  
}
