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
public class Deposit extends DbConnection implements InformationController {
    
    private int depositAmount = 0 ;
    
     public boolean isMoneyDeposited(){
        if(isInformationsValid()){
            String query = "UPDATE user_balance "
                    + "SET balance = balance + '" + this.depositAmount + "'"
                    + " WHERE user_id = '" + getAccountInformations().getUserId()+ "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getAccountInformations().setBalance(getAccountInformations().getBalance()+ this.depositAmount);
            } catch (SQLException ex) {
                Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isInformationsValid() {
        return !(this.depositAmount == 0);
    }

    @Override
    public AccountInformations getAccountInformations() {
                return AccountInformations.getInstance();
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }    
}
