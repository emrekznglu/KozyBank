package database.transactions;

import database.DbConnection;
import database.InformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import settings.TextSettings;

/**
 *
 * @author emrek
 */
public class PhoneNoRenew extends DbConnection implements InformationController {
    
    private String phoneNo = null;
    
    public boolean isItOk(){
    if(isInformationsValid()){
        String query = "UPDATE users SET phone_no = '"+this.phoneNo+"' WHERE user_id = '"+getAccountInformations().getUserId()+"'";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
            getAccountInformations().setPhoneNo(phoneNo);
        } catch (SQLException ex) {
            Logger.getLogger(PhoneNoRenew.class.getName()).log(Level.SEVERE, null, ex);
        }
    return true;
    }
    return false;
    }
    
    @Override
    public boolean isInformationsValid() {
        return !(this.phoneNo == null || TextSettings.isLengthShorter(11, phoneNo) || this.phoneNo.equals(getAccountInformations().getPhoneNo()));
    }

    @Override
    public AccountInformations getAccountInformations() {
        return AccountInformations.getInstance();
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
