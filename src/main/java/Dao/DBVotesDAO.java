package Dao;


public interface DBVotesDAO {
	
  public List<String> getParties();
  
  public int countTotal(String party);
}