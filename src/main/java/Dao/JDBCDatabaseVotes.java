package Dao;

import java.sql.*;
import java.util.List;

public class JDBCDatabaseVotes implements DBVotesDAO{
	
	private Connection conn;
	
    private static final String DB_URL = "jdbc:hsqldb:hsql://localhost";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";
	
	public JDBCDatabaseVotes()
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
	public List<String> getParties()
	{
		List<String> PPList = new ArrayList<String>();
		
		String sql = "SELECT POLITICAL_PARTY FROM VOTES";
		
		try {
            PreparedStatement statement = conn.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            if (!resultSet.next())
				PPList.add(resultSet.getString("POLITICAL_PARTY"));
                return null;
			
            resultSet.close();

            return PPList;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
	}
	
	@Override
	public int countTotal(String party)
	{
		String sql = "SELECT COUNT(*) FROM VOTES WHERE POLITICAL_PARTY = ?";
        
		int count = 0;
		
		try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, party);

            ResultSet resultSet = statement.executeQuery();

            if (!resultSet.next())
                return null;

            count = Integer.parseInt(resultSet.getString(1));
			
            resultSet.close();

            return count;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
	}
}