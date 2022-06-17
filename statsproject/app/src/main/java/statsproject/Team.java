package statsproject;
/** class that holds the OPR and the tools to calculate the OPR of a team*/
public class Team {
    private double predictedOPR;
    private double OPRError;
    private int matchesPlayed;
	public int teamNumber;
    // increases matches played for if matches are added
	public void increaseMatchesPlayed(){
        matchesPlayed++;
    }
	// decreases matches played for if matches are deleted
    public void decreaseMatchesPlayed(){
        matchesPlayed--;
	}
	//constructor for team takes a team number for easy human identification of teams
    public Team(int teamNumber){
        this.teamNumber = teamNumber;
		matchesPlayed= 0;
        predictedOPR = 0;
    }
	//updates OPR relative to all error calculated from matches
    public void recaluclateOPR(){                                                       
        // 3 is the number of teams per alliance
        predictedOPR += OPRError/matchesPlayed/3;
    }
	// updates the Error that determines the change in OPR
	public void updateError(double matchError){
		OPRError += matchError;
	}
	// resets error for reevaluation of matches with updated OPRs, should be used with similar data to increase accuracy of OPR
	public void resetError(){
		OPRError = 0;
	}    
	// resets OPR for recalculation, only called when data is changed
	public void resetOPR(){
		predictedOPR = 0;
		OPRError = 0;
	}
	// returns calculated OPR of team
    public double getOPR(){
		return predictedOPR;
	}
}
