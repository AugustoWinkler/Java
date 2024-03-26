
package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
    public Connection recuperarConexao(){
        try {
            String url = "jdbc:mysql://localhost:3306/byte_bank?user=root&password=";
            
            return DriverManager.getConnection(url);
            
            
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
 
}
