
package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectionDB {
   
    public static void main(String... x){
        
        try {
            String url = "jdbc:mysql://localhost:3306/byte_bank?user=root&password=";
            
            Connection connection = DriverManager.getConnection(url);
            
            System.out.println("Recover Conection");
            
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        
    }
}
