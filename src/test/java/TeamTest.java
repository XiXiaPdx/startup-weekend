import org.junit.*;
import static org.junit.Assert.*;


public class TeamTest {
  private Team newTeam;

  @Before
  public void createNewTeamAutoAndClear(){
   Team.clearTeamInstances();
   newTeam = new Team ("Kodiak");
  }
  @Test
  public void createTeamInstance_true (){
    assertTrue(newTeam instanceof Team);
  }
  @Test
  public void getTeamName_Kodiak(){
    assertEquals("Kodiak", newTeam.getTeamName());
  }
  @Test
  public void createTeamClassList_1(){
    assertEquals(1, Team.getTeamInstances().size());
  }
  @Test
  public void getTeamID_2(){
    Team newTeam2 = new Team ("Borelo");
    assertEquals(2, newTeam2.getTeamID());
  }
  @Test
  public void findTeam_Borelo(){
    Team newTeam2 = new Team ("Borelo");
    assertEquals("Borelo", (Team.findTeam(newTeam2.getTeamID())).getTeamName());
  }
  @Test
  public void getTeamMembersList_0(){
    assertEquals(0, newTeam.getTeamMembers().size());
  }
}
