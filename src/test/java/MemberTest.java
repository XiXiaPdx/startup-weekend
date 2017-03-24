import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {
    private Member newMember;

    @Before
    public void createNewTeamAutoAndClear(){
    //  Team.clearTeamInstances();
     newMember = new Member ("Sera");
    }

    @Test
    public void createMemberInstance_true (){
      assertTrue(newMember instanceof Member);
    }
    @Test
    public void getMemberName_Sera (){
      assertEquals("Sera", newMember.getMemberName());
    }



}
