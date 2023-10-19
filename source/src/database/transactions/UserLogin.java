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
public class UserLogin extends DbConnection implements InformationController {

    private String customerId = null;
    private String password = null;
    
    public boolean isLoginInformationsValid(){
        if(isInformationsValid()){
            if(isLoginSuccessful()){
                this.getAccountInformations().loginUp(customerId);
                return true;
            } else{
                return false;
            }
        }else{
            return false;
        }
        
    }
    
    @Override
    public boolean isInformationsValid() {
       return !(this.customerId == null || this.password==null);
    }
    
    private boolean isLoginSuccessful(){
        String query = "SELECT tc_id_no,customer_no,password FROM users"
                + " WHERE "
                + "(tc_id_no = '" + this.customerId + "'"
                + " OR "
                + "customer_no = '" + this.customerId + "')"
                + " AND "
                + "password = '" + this.password + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    @Override
    public AccountInformations getAccountInformations() {
       return AccountInformations.getInstance();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
}
