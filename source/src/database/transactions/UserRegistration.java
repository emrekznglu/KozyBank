package database.transactions;

import database.DbConnection;
import database.InformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import settings.TextSettings;


public class UserRegistration extends DbConnection implements InformationController{
    
    //Registration Informations
    
    private String nameSurname=null,tcIDNo=null,phoneNo=null;
    private String securityQuestion =null,securityAnswer=null;
    
    //Informations that are given by system
    
    private String customerNo =null;
    private String password=null;
    
    public boolean wasYourRegistrationAccepted(){
        
        if (this.isInformationsValid()) {
            
            if(isThereSameIdNo()){
                return false;
            } else {
                this.acceptRegistration();
                return true;
            }
            
        } else{
            
            return false;
        }
        
        
    }
    
    private boolean isThereSameIdNo(){
        
        String query = "SELECT tc_id_no FROM users WHERE tc_id_no = '"+ this.tcIDNo+"'" ;
        try {
            super.statement=super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; // if there is a data in table it will return true
    }
    
    private void acceptRegistration(){
      
        
String query = "INSERT INTO users(customer_no,password,"
                + "name_surname,tc_id_no,phone_no,security_question,security_answer)"
                + " VALUES("
                + "'" + this.customerNo + "',"
                + "'" + this.password + "',"
                + "'" + this.nameSurname + "',"
                + "'" + this.tcIDNo + "',"
                + "'" + this.phoneNo + "',"
                + "'" + this.securityQuestion + "',"
                + "'" + this.securityAnswer + "'"
                + ")";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isThereSameCustomerNo(){
        String query = "SELECT customer_no FROM users WHERE customer_no = '" + this.customerNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean isInformationsValid() {
        return !(
                this.nameSurname == null
                || this.tcIDNo == null
                || this.phoneNo == null
                || this.securityQuestion == null
                || this.securityAnswer== null
                || this.password == null
                || TextSettings.isLengthShorter(11, this.tcIDNo)
                || TextSettings.isLengthShorter(11, this.phoneNo)
                );
    }

    @Override
    public AccountInformations getAccountInformations() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getTcIDNo() {
        return tcIDNo;
    }

    public void setTcIDNo(String tcIDNo) {
        this.tcIDNo = tcIDNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
    
    
    
    
}
