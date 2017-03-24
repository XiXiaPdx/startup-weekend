import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mTeamName;
  private static List<Team> instances = new ArrayList<Team> ();
  private int mTeamID;
  private List<Member> mTeamMembers;

  public Team (String name) {
    mTeamName = name;
    instances.add(this);
    mTeamID = instances.size();
    mTeamMembers = new ArrayList<Member> ();
  }
  public String getTeamName () {
    return mTeamName;
  }
  public List<Member> getTeamMembers () {
    return mTeamMembers;
  }
  public void addTeamMember (Member member) {
    mTeamMembers.add(member);
  }
  public int getTeamID() {
    return mTeamID;
  }
  public static List<Team> getTeamInstances () {
    return instances;
  }
  public static void clearTeamInstances () {
    instances.clear();
  }
  public static Team findTeam(int teamID) {
    return instances.get(teamID -1);
  }
}
