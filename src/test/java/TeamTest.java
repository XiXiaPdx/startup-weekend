import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {
  @Test
  public void createTeamInstance_true (){
    Team newTeam = new Team ("Kodiak");
    assertTrue(newTeam instanceof Team);
  }

}
