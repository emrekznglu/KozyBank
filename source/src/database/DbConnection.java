package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emrek
 */
public class DbConnection { //Super Class
    
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DATABASE_NAME="kozy_bank";
    private final String USER="root";
    private final String PASSWORD="";
    
    protected Connection connection =null;
    protected Statement statement=null;

    public DbConnection() {
        
        String url = "jdbc:mysql://" +this.HOST+":"+this.PORT+"/"+this.DATABASE_NAME;
        // jdbc:mysql://localhost:3306/kozy_bank
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.connection=DriverManager.getConnection(url,this.USER,this.PASSWORD);
        //    System.out.println("Connection accomplished.");
        } catch (SQLException ex) {
        //    System.out.println("Connection failed.");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
        }

    
    
    
    }    
}