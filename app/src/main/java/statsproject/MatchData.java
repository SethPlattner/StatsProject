package statsproject;
// holds data for a match
public class MatchData {
    // index should be suffiecient sorting system because quantitative data doesn't work for non-qualifing matches
    private double blueError;
	private double redError;
    public Team redTeam1;
    public Team redTeam2;
    public Team redTeam3;
    public Team blueTeam1;
    public Team blueTeam2;
    public Team blueTeam3;
    public double redScore;
    public double blueScore;
	// constructor for a Match, note that it requires team objects so the list with the teams must be referenced, not just the teams index in said list
    public MatchData( Team redTeam1, Team redTeam2, Team redTeam3, Team blueTeam1, Team blueTeam2, Team blueTeam3, double redScore, double blueScore){
        
        this.redTeam1 = redTeam1;
        this.redTeam2 = redTeam2;
        this.redTeam3 = redTeam3;
        this.blueTeam1 = blueTeam1;
        this.blueTeam2 = blueTeam2;
        this.blueTeam3 = blueTeam3;
        this.redScore = redScore; 
        this.blueScore = blueScore;   
		
        redTeam1.increaseMatchesPlayed();
        redTeam2.increaseMatchesPlayed();
        redTeam3.increaseMatchesPlayed();
        blueTeam1.increaseMatchesPlayed();
        blueTeam2.increaseMatchesPlayed();
        blueTeam3.increaseMatchesPlayed();    
    }
	// removes a match played from all teams in this match so the match can be deleted without effecting data
    public void prepareForRemoval(){
        redTeam1.decreaseMatchesPlayed();
        redTeam2.decreaseMatchesPlayed();
        redTeam3.decreaseMatchesPlayed();
        blueTeam1.decreaseMatchesPlayed();
        blueTeam2.decreaseMatchesPlayed();
        blueTeam3.decreaseMatchesPlayed();
    }
	// calculates the error in the predicted contribution of each team in this match based difference from the actual value the sum of their added OPR's make up
	public void calculateMatchError(){
		blueError = 0;
		redError = 0;
		redError = redScore - (redTeam1.getOPR()+ redTeam2.getOPR() + redTeam3.getOPR());
		blueError = blueScore -(blueTeam1.getOPR() + blueTeam2.getOPR() + blueTeam3.getOPR());
		redTeam1.updateError(redError);
		redTeam2.updateError(redError);
		redTeam3.updateError(redError);
		blueTeam1.updateError(blueError);
		blueTeam2.updateError(blueError);
		blueTeam3.updateError(blueError);
	}
}
