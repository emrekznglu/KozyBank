package database.transactions;

import database.DbDataCenter;
import database.InformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class AccountInformations extends DbDataCenter implements InformationController {
    
    private static AccountInformations accountInformations = null;
    
    // Singleton
    
    public static AccountInformations getInstance(){
        
        if(accountInformations == null){
            accountInformations = new AccountInformations();
        }
        return accountInformations;
    }

    @Override
    public boolean isInformationsValid() {
       return!(super.userId==0);
    }

    @Override
    public AccountInformations getAccountInformations() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public void loginUp(String customerId){
        this.getUser(customerId);
        this.takeBalance();
        this.takeBills();
    }
    
    public void logout(){
        super.userId=0;
        super.nameSurname=null;
        super.tcIdNo=null;
        super.phoneNo=null;
        super.customerNo=null;
        super.balance=0;
        super.ebill=0;
        super.wbill=0;
        super.ngbill=0;
        super.ibill=0;
    }
    
    private void getUser(String customerId){
       String query = "SELECT * FROM users WHERE "
                + "tc_id_no = '" + customerId + "'"
                + " OR "
                + "customer_no = '" + customerId + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                super.userId = rs.getInt("user_id");
                super.nameSurname = rs.getNString("name_surname");
                super.tcIdNo = rs.getNString("tc_id_no");
                super.phoneNo = rs.getNString("phone_no");
                super.customerNo = rs.getNString("customer_no");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountInformations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void takeBalance(){
        if(this.isInformationsValid()){
            String query = "SELECT * FROM user_balance"
                    + " WHERE "
                    + "user_id = '" + super.getUserId()+ "'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                   super.balance = rs.getDouble("balance");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountInformations.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }
    
    private void takeBills(){
        if(this.isInformationsValid()){
           String query = "SELECT * FROM user_bills"
                    + " WHERE "
                    + "user_id= '" + super.getUserId()+ "'";
         try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                   super.ebill = rs.getDouble("ebill");
                   super.wbill = rs.getDouble("wbill");
                   super.ngbill = rs.getDouble("ngbill");
                   super.ibill = rs.getDouble("ibill");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountInformations.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
        }
    }
    
}
