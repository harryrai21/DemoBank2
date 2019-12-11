package demobank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlcon {
    
   private Connection connect(){
       String u = "jdbc:sqlite:urdb.db";
       Connection c=null;
       
         try {c = DriverManager.getConnection(u);}
         catch (SQLException e){} 

    return c;
}
 

    public void insd(long acn,String f_nm,String l_nm,long m,String PAN){
    
        String q = "INSERT INTO UserInformation (AccountNumber,FirstName,LastName,Mobile,PAN)VALUES("+acn+",'"+f_nm+"','"+l_nm+"',"+m+",'"+PAN+"')";
        Statement s = null;
        try{Connection conn = this.connect();s = conn.createStatement();s.executeUpdate(q);s.close();conn.close();} catch (SQLException e){}  
    }  
    
    
         
}
