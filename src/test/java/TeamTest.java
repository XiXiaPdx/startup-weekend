import org.junit.*;
import static org.junit.Assert.*;


public class TeamTest {
  private Team newTeam;

  @Before
  public void createNewTeamAutoAndClear(){
   newTeam.clearTeamInstances();
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
    assertEquals(1, newTeam.getTeamInstances().size());
  }

  @Test
  public void getTeamID_2(){
    Team newTeam2 = new Team ("Borelo");
    assertEquals(2, newTeam2.getTeamID());
  }

}
