package statsproject;

import java.util.ArrayList;
/** class that holds all the teams and matches in an event, multiple could be made in future versions*/
public class EventManager{
	ArrayList<Team> eventTeams;
	ArrayList<MatchData> matchList; 
	// constructor for EventManager creates arraylists
	public EventManager(){
		eventTeams= new ArrayList<Team>();
		matchList = new ArrayList<MatchData>();
	}
	// adds team to list of teams at event
	public void addTeam(Team team){
		eventTeams.add(team);
	}
	// adds match to list of matches at event 
	public void addMatch(MatchData matchData){
		// this method of data entry sucks so i should find a more effiecient way
		matchList.add(matchData);
	}
	// removes a team from the event
	public void removeTeam(int teamIndex){
		eventTeams.remove(teamIndex);
	}
	// removes a match from the event
	public void removeMatch(int matchIndex){
		matchList.get(matchIndex).prepareForRemoval();
		matchList.remove(matchIndex);
	}
	// calculates the OPR of all teams based on all matches played 
	//innacurate if most teams have <6-7 matches played
	public void calculateOPR(){
		for(Team i: eventTeams){
			i.resetOPR();
		}
		for(int n=0;n<100;n++){	
		// calculation repeated 100 times to get opr accurate enough
			for(MatchData i: matchList){
				i.calculateMatchError();
			}
			for(Team i: eventTeams){
				i.recaluclateOPR();
				i.resetError();
			}
		}
	}
	// prints every teams index, team number and OPR, does not update OPR before printing
	public void printTeams(){
		for(Team i: eventTeams){
			System.out.println(eventTeams.indexOf(i)+ "|" + i.teamNumber+"-"+i.getOPR());
		}
	}
	// prints every matches index, all teams in the match and the score of each alliance in each match
	public void printMatches(){
		for(MatchData i: matchList){
			System.out.println(matchList.indexOf(i) + "|"+ "Red:" + i.redScore + "Blue:"+i.blueScore +
			"Red Teams:" + i.redTeam1.teamNumber +","+ i.redTeam2.teamNumber +","+i.redTeam3.teamNumber+
			"Blue Teams:"+ i.blueTeam1.teamNumber +","+i.blueTeam2.teamNumber+","+i.blueTeam3.teamNumber);
		}
	}
	
}
