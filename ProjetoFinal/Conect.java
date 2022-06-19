package ProjetoFinal;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conect {
	
	private final String url = ""; //url qualquer 
	 private final String user = ""; //nome do user
	 private final String password = ""; // senha do server do banco 
	 Connection conect ;

	 
	 public Statement start() {
	        try {
	            Class.forName("org.postgresql.Driver");
	            conect = DriverManager.getConnection(url, user, password);
	            Statement statement = conect.createStatement();
	            return statement;
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return null;
	        }
	    }

	    public void end() {
	        try {
	            conect.close();
	        } catch (Exception ex2) {
	            ex2.printStackTrace();
	        }
	    }

}
