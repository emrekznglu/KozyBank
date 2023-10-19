package database.transactions;

import database.DbConnection;
import database.InformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author emrek
 */
public class Withdraw extends DbConnection implements InformationController {

    private int withdrawAmount = 0;
    
    public boolean isMoneyWithdrawned(){
        if(isInformationsValid()){
            String query = "UPDATE user_balance "
                    + "SET balance = balance - '" + this.withdrawAmount + "'"
                    + " WHERE user_id = '" + getAccountInformations().getUserId()+ "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getAccountInformations().setBalance(getAccountInformations().getBalance()- this.withdrawAmount);
            } catch (SQLException ex) {
                Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean isInformationsValid() {
        return !(this.withdrawAmount == 0 || getAccountInformations().getBalance()< this.withdrawAmount);
    }

    @Override
    public AccountInformations getAccountInformations() {
        return AccountInformations.getInstance();
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    
    
    
}
