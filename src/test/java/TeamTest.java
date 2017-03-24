import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {
  private Team newTeam;

  @Before
  public void createNewTeamAuto(){
   newTeam = new Team ("Kodiak");
  }

  @Test
  public void createTeamInstance_true (){
    assertTrue(newTeam instanceof Team);
  }

}
