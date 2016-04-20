package Dao;

import java.util.List;

public interface DBVotesDAO {
	
  public List<String> getParties();
  
  public int countTotal(String party);
}