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
public class Transfers extends DbConnection implements InformationController {

    private int transferAmount =0;
    private String toWho = null; // Customer No
    
    public boolean isItOk() {
        if(isInformationsValid()){
            String query = "UPDATE user_balance SET balance = balance - '"+this.transferAmount+"'"
                    + " WHERE user_id = '" +getAccountInformations().getUserId()+"'";
            
            String query2 = "UPDATE user_balance SET balance = '"+this.transferAmount+"'"
                    + "WHERE customer_no = '"+this.toWho+ "'";
            
            try {
                super.statement = super.connection.createStatement();
                if (statement.executeUpdate(query2)==1) {
                    statement.executeUpdate(query);
                    getAccountInformations().setBalance(getAccountInformations().getBalance()-this.transferAmount);
                    return true;
                } else{
                   return false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Transfers.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            }
        } else {
            return false;
        }
    }
    
    @Override
    public boolean isInformationsValid() {
        return !( transferAmount ==0 || this.toWho ==null
                || this.transferAmount > getAccountInformations().getBalance()
                || this.toWho.equals(getAccountInformations().getCustomerNo()));
    }

    @Override
    public AccountInformations getAccountInformations() {
       return AccountInformations.getInstance();
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }

    public String getToWho() {
        return toWho;
    }

    public void setToWho(String toWho) {
        this.toWho = toWho;
    }

    
}
