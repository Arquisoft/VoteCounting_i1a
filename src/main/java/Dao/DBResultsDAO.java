package Dao;


public interface DBResultsDAO {
  
  public void updateResults(String PoliticalParty, int totalVotes);

  public void addResults(String PoliticalParty, int totalVotes);
  
}