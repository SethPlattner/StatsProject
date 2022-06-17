package statsproject;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
// a test to compare the OPR that this calcualtor produces with a different OPR calcualtor to see how accurate it is
public class EventManagerTest {
    @Test void OPRIsAccurate(){
        EventManager classUnderTest = new EventManager();
        classUnderTest.addTeam(new Team(492));//0
        classUnderTest.addTeam(new Team(1778));//1
        classUnderTest.addTeam(new Team(1899));//2
        classUnderTest.addTeam(new Team(2412));//3
        classUnderTest.addTeam(new Team(2522));//4
        classUnderTest.addTeam(new Team(2903));//5
        classUnderTest.addTeam(new Team(2910));//6
        classUnderTest.addTeam(new Team(2928));//7
        classUnderTest.addTeam(new Team(2930));//8
        classUnderTest.addTeam(new Team(2980));//9
        classUnderTest.addTeam(new Team(3070));//10
        classUnderTest.addTeam(new Team(3219));//11
        classUnderTest.addTeam(new Team(3268));//12
        classUnderTest.addTeam(new Team(3663));//13
        classUnderTest.addTeam(new Team(3681));//14
        classUnderTest.addTeam(new Team(4089));//15
        classUnderTest.addTeam(new Team(4131));//16
        classUnderTest.addTeam(new Team(4173));//17
        classUnderTest.addTeam(new Team(4180));//18
        classUnderTest.addTeam(new Team(4205));//19
        classUnderTest.addTeam(new Team(4309));//20
        classUnderTest.addTeam(new Team(4512));//21
        classUnderTest.addTeam(new Team(4682));//22
        classUnderTest.addTeam(new Team(4911));//23
        classUnderTest.addTeam(new Team(5588));//24
        classUnderTest.addTeam(new Team(5827));//25
        classUnderTest.addTeam(new Team(5941));//26
        classUnderTest.addTeam(new Team(6350));//27
        classUnderTest.addTeam(new Team(7461));//28
        classUnderTest.addTeam(new Team(7627));//29
        classUnderTest.addTeam(new Team(8032));//30
        classUnderTest.addTeam(new Team(8051));//31
        classUnderTest.addTeam(new Team(8248));//32
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(31), classUnderTest.eventTeams.get(1), classUnderTest.eventTeams.get(9), classUnderTest.eventTeams.get(11), classUnderTest.eventTeams.get(19),classUnderTest.eventTeams.get(5), 44, 10));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(7), classUnderTest.eventTeams.get(30), classUnderTest.eventTeams.get(32), classUnderTest.eventTeams.get(27), classUnderTest.eventTeams.get(8),classUnderTest.eventTeams.get(17), 15, 36));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(25), classUnderTest.eventTeams.get(12), classUnderTest.eventTeams.get(18), classUnderTest.eventTeams.get(26), classUnderTest.eventTeams.get(15),classUnderTest.eventTeams.get(0), 14, 70));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(4), classUnderTest.eventTeams.get(24), classUnderTest.eventTeams.get(2), classUnderTest.eventTeams.get(21), classUnderTest.eventTeams.get(3),classUnderTest.eventTeams.get(14), 28, 4));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(23), classUnderTest.eventTeams.get(22), classUnderTest.eventTeams.get(16), classUnderTest.eventTeams.get(10), classUnderTest.eventTeams.get(20),classUnderTest.eventTeams.get(6), 25, 64));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(13), classUnderTest.eventTeams.get(29), classUnderTest.eventTeams.get(30), classUnderTest.eventTeams.get(1), classUnderTest.eventTeams.get(28),classUnderTest.eventTeams.get(31), 13, 43));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(8), classUnderTest.eventTeams.get(9), classUnderTest.eventTeams.get(21), classUnderTest.eventTeams.get(3), classUnderTest.eventTeams.get(11),classUnderTest.eventTeams.get(24), 49, 5));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(5), classUnderTest.eventTeams.get(16), classUnderTest.eventTeams.get(25), classUnderTest.eventTeams.get(2), classUnderTest.eventTeams.get(6),classUnderTest.eventTeams.get(17), 21, 73));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(15), classUnderTest.eventTeams.get(22), classUnderTest.eventTeams.get(4), classUnderTest.eventTeams.get(1), classUnderTest.eventTeams.get(32),classUnderTest.eventTeams.get(29), 34, 23));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(18), classUnderTest.eventTeams.get(20), classUnderTest.eventTeams.get(13), classUnderTest.eventTeams.get(27), classUnderTest.eventTeams.get(19),classUnderTest.eventTeams.get(23), 42, 55));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(26), classUnderTest.eventTeams.get(10), classUnderTest.eventTeams.get(7), classUnderTest.eventTeams.get(14), classUnderTest.eventTeams.get(12),classUnderTest.eventTeams.get(28), 15, 28));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(25), classUnderTest.eventTeams.get(30), classUnderTest.eventTeams.get(0), classUnderTest.eventTeams.get(3), classUnderTest.eventTeams.get(17),classUnderTest.eventTeams.get(9), 52, 17));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(8	),classUnderTest.eventTeams.get(30), classUnderTest.eventTeams.get(23), classUnderTest.eventTeams.get(1	), classUnderTest.eventTeams.get(  2), classUnderTest.eventTeams.get(20	), 39,35));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(27	),classUnderTest.eventTeams.get(21), classUnderTest.eventTeams.get(10), classUnderTest.eventTeams.get(6	), classUnderTest.eventTeams.get(  19), classUnderTest.eventTeams.get(15),19,107));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(11	),classUnderTest.eventTeams.get(12), classUnderTest.eventTeams.get(22), classUnderTest.eventTeams.get(14), classUnderTest.eventTeams.get(	5), classUnderTest.eventTeams.get(24),5	 ,  9));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(28	),classUnderTest.eventTeams.get(7), classUnderTest.eventTeams.get(18), classUnderTest.eventTeams.get(26	), classUnderTest.eventTeams.get(  32), classUnderTest.eventTeams.get(4	), 48,46));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(16	),classUnderTest.eventTeams.get(13), classUnderTest.eventTeams.get(17), classUnderTest.eventTeams.get(29), classUnderTest.eventTeams.get(	15), classUnderTest.eventTeams.get(3),26,35));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(1	),classUnderTest.eventTeams.get(6), classUnderTest.eventTeams.get(21), classUnderTest.eventTeams.get(9	), classUnderTest.eventTeams.get(  27), classUnderTest.eventTeams.get(0	), 78,37));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(24	),classUnderTest.eventTeams.get(25), classUnderTest.eventTeams.get(28), classUnderTest.eventTeams.get(2	), classUnderTest.eventTeams.get(  22), classUnderTest.eventTeams.get(7	), 32,18));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(20	),classUnderTest.eventTeams.get(26), classUnderTest.eventTeams.get(11), classUnderTest.eventTeams.get(4	), classUnderTest.eventTeams.get(  30), classUnderTest.eventTeams.get(16),14,41));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(19	),classUnderTest.eventTeams.get(14), classUnderTest.eventTeams.get(29), classUnderTest.eventTeams.get(5	), classUnderTest.eventTeams.get(  23), classUnderTest.eventTeams.get(18),9	 , 37));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(3	),classUnderTest.eventTeams.get(10), classUnderTest.eventTeams.get(12), classUnderTest.eventTeams.get(8	), classUnderTest.eventTeams.get(  13), classUnderTest.eventTeams.get(32),32,53));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(24	),classUnderTest.eventTeams.get(9), classUnderTest.eventTeams.get(15), classUnderTest.eventTeams.get(7	), classUnderTest.eventTeams.get(  31), classUnderTest.eventTeams.get(6	), 77,62));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(22	),classUnderTest.eventTeams.get(29), classUnderTest.eventTeams.get(5), classUnderTest.eventTeams.get(30	), classUnderTest.eventTeams.get(  28), classUnderTest.eventTeams.get(27),14,46));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(21	),classUnderTest.eventTeams.get(16), classUnderTest.eventTeams.get(20), classUnderTest.eventTeams.get(2	), classUnderTest.eventTeams.get(  18), classUnderTest.eventTeams.get(32),27,31));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(12	),classUnderTest.eventTeams.get(4), classUnderTest.eventTeams.get(8	 ), classUnderTest.eventTeams.get(19), classUnderTest.eventTeams.get(	25), classUnderTest.eventTeams.get(1),65,35));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(3	),classUnderTest.eventTeams.get(23), classUnderTest.eventTeams.get(26), classUnderTest.eventTeams.get(17), classUnderTest.eventTeams.get(	0), classUnderTest.eventTeams.get(1	), 65,61));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(11	),classUnderTest.eventTeams.get(14), classUnderTest.eventTeams.get(2), classUnderTest.eventTeams.get(13	), classUnderTest.eventTeams.get(  22), classUnderTest.eventTeams.get(28),17,60));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(5	),classUnderTest.eventTeams.get(6), classUnderTest.eventTeams.get(9	 ), classUnderTest.eventTeams.get(30), classUnderTest.eventTeams.get(	8), classUnderTest.eventTeams.get(18),32,19));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(32	),classUnderTest.eventTeams.get(0), classUnderTest.eventTeams.get(23), classUnderTest.eventTeams.get(27 ), classUnderTest.eventTeams.get(	15), classUnderTest.eventTeams.get(3),41,44));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(17	),classUnderTest.eventTeams.get(20), classUnderTest.eventTeams.get(25), classUnderTest.eventTeams.get(24), classUnderTest.eventTeams.get(	13), classUnderTest.eventTeams.get(1),34,32));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(31	),classUnderTest.eventTeams.get(4), classUnderTest.eventTeams.get(11), classUnderTest.eventTeams.get(21 ), classUnderTest.eventTeams.get(	26), classUnderTest.eventTeams.get(1),32,12));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(1	),classUnderTest.eventTeams.get(7), classUnderTest.eventTeams.get(14), classUnderTest.eventTeams.get(16 ), classUnderTest.eventTeams.get(	10), classUnderTest.eventTeams.get(2),25,35));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(6	),classUnderTest.eventTeams.get(32), classUnderTest.eventTeams.get(22), classUnderTest.eventTeams.get(12), classUnderTest.eventTeams.get(	20), classUnderTest.eventTeams.get(0),75,26));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(21	),classUnderTest.eventTeams.get(23), classUnderTest.eventTeams.get(15), classUnderTest.eventTeams.get(26), classUnderTest.eventTeams.get(	17), classUnderTest.eventTeams.get(5),63,15));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(30	),classUnderTest.eventTeams.get(1), classUnderTest.eventTeams.get(3	 ), classUnderTest.eventTeams.get(29), classUnderTest.eventTeams.get(	18), classUnderTest.eventTeams.get(2),16,13));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(10	),classUnderTest.eventTeams.get(8), classUnderTest.eventTeams.get(14), classUnderTest.eventTeams.get(25 ), classUnderTest.eventTeams.get(	27), classUnderTest.eventTeams.get(3),42,10));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(9	),classUnderTest.eventTeams.get(2), classUnderTest.eventTeams.get(16), classUnderTest.eventTeams.get(19	), classUnderTest.eventTeams.get(  4), classUnderTest.eventTeams.get(28	), 34,50));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(13	),classUnderTest.eventTeams.get(11), classUnderTest.eventTeams.get(1), classUnderTest.eventTeams.get(7	), classUnderTest.eventTeams.get(  17), classUnderTest.eventTeams.get(12),40,32));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(18	),classUnderTest.eventTeams.get(31), classUnderTest.eventTeams.get(26), classUnderTest.eventTeams.get(22), classUnderTest.eventTeams.get(	25), classUnderTest.eventTeams.get(3),15,41));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(19	),classUnderTest.eventTeams.get(24), classUnderTest.eventTeams.get(8), classUnderTest.eventTeams.get(16	), classUnderTest.eventTeams.get(  28), classUnderTest.eventTeams.get(32),39,55));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(20	),classUnderTest.eventTeams.get(27), classUnderTest.eventTeams.get(7), classUnderTest.eventTeams.get(4  ), classUnderTest.eventTeams.get(	21), classUnderTest.eventTeams.get(2),19,67));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(15	),classUnderTest.eventTeams.get(13), classUnderTest.eventTeams.get(10), classUnderTest.eventTeams.get(30), classUnderTest.eventTeams.get(	9), classUnderTest.eventTeams.get(14),26,26));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(0	),classUnderTest.eventTeams.get(2 ), classUnderTest.eventTeams.get(5), classUnderTest.eventTeams.get(6  ), classUnderTest.eventTeams.get(	11), classUnderTest.eventTeams.get(2),42,79));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(31	),classUnderTest.eventTeams.get(32), classUnderTest.eventTeams.get(21), classUnderTest.eventTeams.get(12), classUnderTest.eventTeams.get(	16), classUnderTest.eventTeams.get(1),29,28));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(8	),classUnderTest.eventTeams.get(28), classUnderTest.eventTeams.get(20), classUnderTest.eventTeams.get(24), classUnderTest.eventTeams.get(	27), classUnderTest.eventTeams.get(2),64,16));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(15	),classUnderTest.eventTeams.get(2), classUnderTest.eventTeams.get(25), classUnderTest.eventTeams.get(23 ), classUnderTest.eventTeams.get(	7), classUnderTest.eventTeams.get(9	), 63,54));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(11	),classUnderTest.eventTeams.get(18), classUnderTest.eventTeams.get(10), classUnderTest.eventTeams.get(13), classUnderTest.eventTeams.get(	5), classUnderTest.eventTeams.get(3	), 36,65));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(17	),classUnderTest.eventTeams.get(30), classUnderTest.eventTeams.get(19), classUnderTest.eventTeams.get(14), classUnderTest.eventTeams.get(	0), classUnderTest.eventTeams.get(22),24,40));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(29	),classUnderTest.eventTeams.get(6), classUnderTest.eventTeams.get(27), classUnderTest.eventTeams.get(4  ), classUnderTest.eventTeams.get(	1), classUnderTest.eventTeams.get(25),82,42));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(32	),classUnderTest.eventTeams.get(5), classUnderTest.eventTeams.get(12), classUnderTest.eventTeams.get(28 ), classUnderTest.eventTeams.get(	21), classUnderTest.eventTeams.get(2),6	 , 79));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(9	),classUnderTest.eventTeams.get(19), classUnderTest.eventTeams.get(13), classUnderTest.eventTeams.get(22), classUnderTest.eventTeams.get(	26), classUnderTest.eventTeams.get(8),16,29));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(18	),classUnderTest.eventTeams.get(14), classUnderTest.eventTeams.get(6), classUnderTest.eventTeams.get(7  ), classUnderTest.eventTeams.get(	29), classUnderTest.eventTeams.get(1),91,27));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(0	),classUnderTest.eventTeams.get(3 ), classUnderTest.eventTeams.get(16), classUnderTest.eventTeams.get(20), classUnderTest.eventTeams.get(	15), classUnderTest.eventTeams.get(3),39,46));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(31	),classUnderTest.eventTeams.get(17), classUnderTest.eventTeams.get(24), classUnderTest.eventTeams.get(23), classUnderTest.eventTeams.get(	10), classUnderTest.eventTeams.get(4),32,61));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(29	),classUnderTest.eventTeams.get(25), classUnderTest.eventTeams.get(26), classUnderTest.eventTeams.get(32), classUnderTest.eventTeams.get(	9), classUnderTest.eventTeams.get(11),39,32));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(20	),classUnderTest.eventTeams.get(3), classUnderTest.eventTeams.get(19), classUnderTest.eventTeams.get(5  ), classUnderTest.eventTeams.get(	7), classUnderTest.eventTeams.get(21),25,35));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(15	),classUnderTest.eventTeams.get(8), classUnderTest.eventTeams.get(1	 ), classUnderTest.eventTeams.get(17), classUnderTest.eventTeams.get(	18), classUnderTest.eventTeams.get(2),98,29));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(6	),classUnderTest.eventTeams.get(0 ), classUnderTest.eventTeams.get(4), classUnderTest.eventTeams.get(14 ), classUnderTest.eventTeams.get(	31), classUnderTest.eventTeams.get(1),90,10));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(2	),classUnderTest.eventTeams.get(12), classUnderTest.eventTeams.get(27), classUnderTest.eventTeams.get(10), classUnderTest.eventTeams.get(	24), classUnderTest.eventTeams.get(3),34,21));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(28	),classUnderTest.eventTeams.get(23), classUnderTest.eventTeams.get(17), classUnderTest.eventTeams.get(16), classUnderTest.eventTeams.get(	11), classUnderTest.eventTeams.get(8),68,43));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(22	),classUnderTest.eventTeams.get(1), classUnderTest.eventTeams.get(19), classUnderTest.eventTeams.get(25 ), classUnderTest.eventTeams.get(	21), classUnderTest.eventTeams.get(1),12,58));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(0	),classUnderTest.eventTeams.get(24), classUnderTest.eventTeams.get(7), classUnderTest.eventTeams.get(10 ), classUnderTest.eventTeams.get(	5), classUnderTest.eventTeams.get(31),25,26));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(32	),classUnderTest.eventTeams.get(14), classUnderTest.eventTeams.get(27), classUnderTest.eventTeams.get(9 ), classUnderTest.eventTeams.get(	4), classUnderTest.eventTeams.get(20),46,51));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(28	),classUnderTest.eventTeams.get(3), classUnderTest.eventTeams.get(6	 ), classUnderTest.eventTeams.get(18), classUnderTest.eventTeams.get(	16), classUnderTest.eventTeams.get(1),91,67));
        classUnderTest.addMatch(new MatchData(classUnderTest.eventTeams.get(12	),classUnderTest.eventTeams.get(26), classUnderTest.eventTeams.get(30), classUnderTest.eventTeams.get(23), classUnderTest.eventTeams.get(	29), classUnderTest.eventTeams.get(2),16,51));
        classUnderTest.calculateOPR();
        classUnderTest.printTeams();
		// testing 
        assertEquals(true,(classUnderTest.eventTeams.get(6).getOPR()>54 && classUnderTest.eventTeams.get(6).getOPR()<55)); 
    }
}
