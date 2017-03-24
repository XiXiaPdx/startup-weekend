import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mTeamName;
  private static List<Team> instances = new ArrayList<Team> ();
  private int mTeamID;

  public Team (String name) {
    mTeamName = name;
    instances.add(this);
    mTeamID = instances.size();
  }
  public String getTeamName () {
    return mTeamName;
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
