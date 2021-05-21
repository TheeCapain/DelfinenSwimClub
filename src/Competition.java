import java.util.ArrayList;
import java.util.Collections;


public class Competition {
  //Compares and finds top 5
  public void compareTimes(ArrayList<Competitor> competitors) {
    Collections.sort(competitors);

  }


  //A lot of sorting
  public void sortTeamsByAge(ArrayList<Member> activeMember, ArrayList<Member> juniorCompetitor, ArrayList<Member> seniorCompetitor) {
    for (int i = 0; i < activeMember.size(); i++) {
      if (activeMember.get(i).getAge() < 18) {
        juniorCompetitor.add(activeMember.get(i));
      } else if (activeMember.get(i).getAge() > 18) {
        seniorCompetitor.add(activeMember.get(i));
      }
    }
  }

  public void assignSwimTeams(ArrayList<Member> Competitors, Competitor competitor, ArrayList<Competitor> crawl, ArrayList<Competitor> backCrawl, ArrayList<Competitor> breast, ArrayList<Competitor> butterfly) {
    for (int i = 0; i < Competitors.size(); i++) {
      competitor.setName(Competitors.get(i).getName());
      competitor.setID(Competitors.get(i).getID());
      competitor.setDiscipline(competitor.randomizeDiscipline());
      //@TODO Fix tidsformattering
      competitor.setLocalDateTime();
      //@TODO Fix laveste tid
      competitor.setTimer(competitor.getRandomTime());
      addToDiscipline(competitor,crawl,backCrawl,breast,butterfly);


    }
  }

  public void addToDiscipline(Competitor competitor,ArrayList<Competitor> crawl, ArrayList<Competitor> backCrawl, ArrayList<Competitor> breast, ArrayList<Competitor> butterfly) {
    switch (competitor.getDiscipline()) {
      case "Crawl" -> crawl.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "BackCrawl" -> backCrawl.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Breast" -> breast.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Butterfly" -> butterfly.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

    }
  }

  //A lot of printing
  public void printButterfly(Ui ui, ArrayList<Competitor> butterfly) {
    for (int i = 0; i < butterfly.size(); i++) {
      ui.printFormatLines();
      ui.display(butterfly.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void printCrawl(Ui ui, ArrayList<Competitor> crawl) {
    for (int i = 0; i < crawl.size(); i++) {
      ui.printFormatLines();
      ui.display(crawl.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void printBreast(Ui ui, ArrayList<Competitor> breast) {
    for (int i = 0; i < breast.size(); i++) {
      ui.printFormatLines();
      ui.display(breast.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void printBackCrawl(Ui ui, ArrayList<Competitor> BackCrawl) {
    for (int i = 0; i < BackCrawl.size(); i++) {
      ui.printFormatLines();
      ui.display(BackCrawl.get(i).toString());
      ui.printFormatLines();
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
}
