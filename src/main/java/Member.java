import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mMemberName;
  private static List<Member> instances = new ArrayList<Member>();

  public Member (String name){
    mMemberName = name;
    instances.add(this);
  }
  public String getMemberName(){
    return mMemberName;
  }
  public static List<Member> getMemberInstances(){
    return instances;
  }
  public static void clearMemberInstances(){
    instances.clear();
  }
  public static Member findMember(int id){
    return instances.get(id -1);
  }

}
