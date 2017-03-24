import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.List;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String newTeamName = request.queryParams("newTeam");
      Team newTeam = new Team (newTeamName);
      model.put ("teams", Team.getTeamInstances());
      model.put("template", "templates/teams.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put ("teams", Team.getTeamInstances());
      model.put("template", "templates/teams.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team team = Team.findTeam(Integer.parseInt(request.params(":id")));
      String newMemberName = request.queryParams("newMember");
      Member newMember = new Member (newMemberName);
      team.addTeamMember(newMember);
      model.put ("members", team.getTeamMembers());
      model.put("team", team);
      model.put("template", "templates/team.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team team = Team.findTeam(Integer.parseInt(request.params(":id")));
      model.put("team", team);
      model.put ("members", team.getTeamMembers());
      model.put("template", "templates/team.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams/:id1/member/:id2", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team team = Team.findTeam(Integer.parseInt(request.params(":id1")));
      Member member = team.getTeamMembers().get(Integer.parseInt(request.params(":id2")));
      model.put ("member", member);
      model.put("team", team);
      model.put("template", "templates/member.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // post("/search", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   String searchTeam = request.queryParams("searchTeam");
    //   if (Team.getTeamInstances().size()==0){
    //     model.put ("teams", Team.getTeamInstances());
    //   } else {
    //     List<Team> foundTeam = new ArrayList<Team>();
    //     for (Team team : Team.getTeamInstances()){
    //       if (searchTeam.equals(team.getTeamName())){
    //         foundTeam = foundTeam.add(team);
    //       }
    //     }
    //     model.put("teams", foundTeam);
    //   }
    //   model.put("template", "templates/teams.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }
}
