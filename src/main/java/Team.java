import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mTeamName;
  private static List<Team> instances = new ArrayList<Team>();

  public Team (String name) {
    mTeamName = name;
    instances.add(this);
  }
  public String getTeamName () {
    return mTeamName;
  }
  public List<Team> getTeamInstances () {
    return instances;
  }
}
