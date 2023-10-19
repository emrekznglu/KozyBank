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
public class PasswordRenew extends DbConnection implements InformationController {

    private String tcIdNo = null;
    private String phoneNo = null;
    private String securityAnswer = null;
    private String oldPw = null;
    private String newPw = null;
    
    public boolean isPasswordRenewed(){
        if (isInformationsValid()) {          
            String query = "UPDATE users SET password = '" + this.newPw + 
                    "' WHERE tc_id_no = '" + this.tcIdNo + "' AND phone_no = '"+ this.phoneNo + "' AND security_answer = '" + this.securityAnswer+ "'";
            
            if (this.oldPw !=null) {
                query+= " AND password = '" + this.oldPw + "'";
            }
            try {
                super.statement = super.connection.createStatement();
                return statement.executeUpdate(query) == 1;
            } catch (SQLException ex) {
                Logger.getLogger(PasswordRenew.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }

        return false;
    }
    
    @Override
    public boolean isInformationsValid() {
        return !(this.tcIdNo == null || this.phoneNo == null || this.securityAnswer == null || this.newPw == null);
    }

    @Override
    public AccountInformations getAccountInformations() {
        return AccountInformations.getInstance();
    }
// ----------------------------------------------------------------------- Getters & Setters
    public String getTcIdNo() {
        return tcIdNo;
    }

    public void setTcIdNo(String tcIdNo) {
        this.tcIdNo = tcIdNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getOldPw() {
        return oldPw;
    }

    public void setOldPw(String oldPw) {
        this.oldPw = oldPw;
    }

    public String getNewPw() {
        return newPw;
    }

    public void setNewPw(String newPw) {
        this.newPw = newPw;
    }
}
