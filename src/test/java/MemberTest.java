import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {
    private Member newMember;
    
    @Before
    public void createNewTeamAutoAndClear(){
    Member.clearMemberInstances();
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
    @Test
    public void getMemberInstanceListSize_1 (){
      assertEquals(1, Member.getMemberInstances().size());
    }
    @Test
    public void getMemberID_1 (){
      assertEquals(1, newMember.getMemberID());
    }
}
