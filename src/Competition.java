import java.util.ArrayList;

public class Competition {


  public void sortTeamsByAge(ArrayList<Member> activeMember, ArrayList<Member> juniorCompetitor, ArrayList<Member> seniorCompetitor) {
    for (int i = 0; i < activeMember.size(); i++) {
      if (activeMember.get(i).getAge() < 18) {
        juniorCompetitor.add(activeMember.get(i));
      } else if (activeMember.get(i).getAge() > 18) {
        seniorCompetitor.add(activeMember.get(i));
      }

    }
  }

  public void printSeniors(ArrayList<Member> seniorCompetitors, Ui ui) {
    for (int i = 0; i < seniorCompetitors.size(); i++) {
      ui.printFormatLines();
      //To Fix indentation: i+1
      ui.display("MemberNR: " + (i + 1) + " " + seniorCompetitors.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void printJuniors(ArrayList<Member> juniorCompetitors, Ui ui) {
    for (int i = 0; i < juniorCompetitors.size(); i++) {
      ui.printFormatLines();
      //To Fix indentation: i+1
      ui.display("MemberNR: " + (i + 1) + " " + juniorCompetitors.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void assignSwimTeams(Ui ui,ArrayList<Member> juniorCompetitors, ArrayList<Member> seniorCompetiors, Competitor competitor, ArrayList<Competitor> crawl, ArrayList<Competitor> backCrawl, ArrayList<Competitor> breast, ArrayList<Competitor> butterfly) {
    for (int i = 0; i < juniorCompetitors.size(); i++) {
      competitor.setName(juniorCompetitors.get(i).getName());
      competitor.setID(juniorCompetitors.get(i).getID());
      competitor.setDiscipline(competitor.randomizeDiscipline());

      if (competitor.getDiscipline().equals("Crawl")) {
        ui.display("Added to Crawl Team");
        crawl.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(),competitor.getTimer()));
      } else if(competitor.getDiscipline().equals("BackCrawl")){
        ui.display("Added");

      }


    }
  }
}
