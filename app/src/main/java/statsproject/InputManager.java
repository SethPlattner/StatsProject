package statsproject;

import java.util.Scanner;

public class InputManager{
    public EventManager eventManager;
    // might make another scanner for text files at some point
	public Scanner inputScanner;
    // constructor for input manager
	public InputManager(){
        eventManager = new EventManager();
        inputScanner =  new Scanner(System.in);
        commandList();
        takeInput();
		// the take input method has infinite recursion so it should never have the line after it executed
        throw new IllegalStateException("the program stopped taking inputs");
    }
    // takes the users input and outputs a command as a result, currently only works for 1 event, might make it work for more in the future depending
    public void takeInput(){
        System.out.println("enter a command type H for complete command list");
        char userInput = inputScanner.next().charAt(0);
        switch(userInput){
            case 'H' :
                commandList();
            break;
            case 'M' : 
                eventManager.printMatches();
            break;
            case 'T' :
                eventManager.printTeams();
            break;
            case 'C' :
                eventManager.calculateOPR();
            break;
            case 'A' :
                System.out.println("type T to add a team and M to add a match");
                switch(inputScanner.next().charAt(0)){
                    case 'M':
                        addMatch();
                    break;
                    case 'T':
                        addTeam();
                    break;
                    default:
                        System.out.println("invalid input");
                    break;
                }
            break;
            case 'R':
                System.out.println("type T to remove a team and M to remove a match");
                switch(inputScanner.next().charAt(0)){
                    case 'M':
                    removeMatch();
                    break;
                    case 'T':
                    removeTeam();
                    break;
                    default:
                        System.out.println("invalid input");
                    break;
            }
            default:
                System.out.println("invalid input");
                commandList();
            break;
        }
        takeInput();
    }
	// method that explains the available commands for the user to use
    public static void commandList(){
        System.out.println("type H for command list, type T for a the full list of teams with their OPR's, type M for a full list of matches, type C to calculate the OPR of teams,type A to add a team or match, type R to remove a team or match");
    }
	// method adds a match, requires a lot of inputs, feasible at events but needs alternative for prescouting data entry
    public void addMatch(){
        System.out.println("adding a match requires you to know the the indexes of all the teams in said match if you do not have it pulled up already i would ");
        System.out.print("would you like to cancel match creation [Y/N]");
        if(inputScanner.next().charAt(0) == 'N'){
            System.out.print("enter the index of the first red team");
            int redTeam1 = inputScanner.nextInt();
            System.out.print("enter the index of the second red team");
            int redTeam2 = inputScanner.nextInt();
            System.out.print("enter the index of the third red team");
            int redTeam3 = inputScanner.nextInt();
            System.out.print("enter the index of the first blue team");
            int blueTeam1 = inputScanner.nextInt();
            System.out.print("enter the index of the second blue team");
            int blueTeam2 = inputScanner.nextInt();
            System.out.print("enter the index of the third blue team");
            int blueTeam3 = inputScanner.nextInt();
            System.out.print("enter the score of the red team excluding foul points");
            double redScore = inputScanner.nextDouble();
            System.out.print("enter the score of the blue team excluding foul points");
            double blueScore = inputScanner.nextDouble();
            eventManager.addMatch(new MatchData(eventManager.eventTeams.get(redTeam1), eventManager.eventTeams.get(redTeam2),eventManager.eventTeams.get(redTeam3), eventManager.eventTeams.get(blueTeam1), eventManager.eventTeams.get(blueTeam2), eventManager.eventTeams.get(blueTeam3), redScore, blueScore));
        }
        else{
            System.out.println("match creation successfully canceled");
        }
    }
	// adds a team to the event
    public void addTeam(){
        System.out.print("enter the team you would like to add's number");
        try{
            eventManager.addTeam(new Team(inputScanner.nextInt()));
            System.out.println("team added successfully");
        }catch(IllegalArgumentException e){
            System.out.println("team could not be added, make sure you entered an integer for the team number");
        }
    }
	//removes a match from the event
    public void removeMatch(){
        System.out.print("please enter the index of the match you wish to remove (if you don't know the index you can find on the far left of the list of matches");
        try{
            int matchIndex = inputScanner.nextInt();
            eventManager.removeMatch(matchIndex);
            System.out.println("match "+ matchIndex +" has been removed successfully");
        }catch(IllegalArgumentException e){
            System.out.println("Match could not be removed, make sure you entered an integer and that the integer was an index of a real match");
        }
    }
	//removes a team from the event
    public void removeTeam(){
        System.out.print("please enter the index of the team you wish to remove (if you don't know the index you can find on the far left of the list of teams");
        try{
            int teamIndex = inputScanner.nextInt();
            eventManager.removeMatch(teamIndex);
            System.out.println("Team "+ teamIndex +" has been removed successfully");
        }catch(IllegalArgumentException e){
            System.out.println("Team could not be removed, make sure you entered an integer and that the int was an index of a real team");
        }
    }


}

