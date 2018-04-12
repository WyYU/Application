package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	
	
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    private static final String DB_URL = "jdbc:mysql://111.231.59.79:3306/access_control?autoReconnect=true&useUnicode=true&characterEncoding=utf-8&useSSL=false";
 
    private static final String USER = "control";
    private static final String PASS = "billy583245126";
    
    static {
    	try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
    
	public static Connection getConnection() {
		
		try {
			Class.forName(JDBC_DRIVER);
			return  DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		;
		return null;
	}

}
