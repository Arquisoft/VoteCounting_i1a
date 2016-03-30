package CountVotes;

import java.util.List;

import Dao.*;

public class Counter {
	
	private List<String> PPList; // Political Party list
	private List<int> countList; // Sum of votes
	
	
  public Counter()
  {
	  
  }
  
  public void Count()
  {
	  // Pretty much uses readVotes and updateResults.
  }

  public void readVotes()
  {
	  // Goes to Database_Votes and reads the data inside 
	  // Lists all political parties and then performs a preparedStatement in order to 
	  // 	extract and store the sum of all the results for the specific political party
	  //	SQL stuff done in DBVotesDAO
  }
  
  public void updateResults()
  {
	  // Updates the Database_Results with the sum of the votes found.
	  //	SQL stuff done in DBResultsDAO
  }
}