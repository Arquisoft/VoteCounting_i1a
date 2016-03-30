package Dao;

import java.sql.*;
import java.util.List;

public class JDBCDatabaseResults implements DBResultsDAO{
	
	private Connection conn;

    private static final String DB_URL = "jdbc:hsqldb:hsql://localhost";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";
	
	public JDBCDatabaseResults()
	{
		 try {
            Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public void updateResults()
	{
		  
	}
}