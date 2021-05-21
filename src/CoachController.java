import java.io.File;
import java.util.ArrayList;

public class CoachController {
  Ui ui = new Ui();
  ArrayList<Member> juniorCompetitors = new ArrayList<>();
  ArrayList<Member> seniorCompetitors = new ArrayList<>();
  ArrayList<Competitor> crawlSwimmersJunior = new ArrayList<>();
  ArrayList<Competitor> breastSwimmersJunior = new ArrayList<>();
  ArrayList<Competitor> backCrawlSwimmersJunior = new ArrayList<>();
  ArrayList<Competitor> butterflySwimmersJunior = new ArrayList<>();
  ArrayList<Competitor> crawlSwimmersSenior = new ArrayList<>();
  ArrayList<Competitor> breastSwimmersSenior = new ArrayList<>();
  ArrayList<Competitor> backCrawlSwimmersSenior = new ArrayList<>();
  ArrayList<Competitor> butterflySwimmersSenior = new ArrayList<>();
  Competitor competitor = new Competitor();
  Competition competition = new Competition();

  public void coachInitializer(ArrayList<Member> activeMember, Menu menu) {
    competition.sortTeamsByAge(activeMember, juniorCompetitors, seniorCompetitors);
    competition.assignSwimTeams(juniorCompetitors, competitor, crawlSwimmersJunior, backCrawlSwimmersJunior, breastSwimmersJunior, butterflySwimmersJunior);
    competition.assignSwimTeams(seniorCompetitors, competitor, crawlSwimmersSenior, backCrawlSwimmersSenior, breastSwimmersSenior, butterflySwimmersSenior);

    coachController(menu);
  }

  public void coachController(Menu menu) {

    String choice;
    boolean isRunning = true;
    do {
      menu.printCoachMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      switch (choice) {
        case "1" -> top5Controller(ui, menu);
        case "2" -> {
          competition.printSeniors(seniorCompetitors, ui);
          competition.printJuniors(juniorCompetitors, ui);
        }
        case "3" -> System.out.println("test");
        case "9" -> isRunning = false;
      }
    } while (isRunning);

  }

  public void top5Controller(Ui ui, Menu menu) {

    String choice;
    boolean isRunning = true;
    do {
      menu.printTop5Menu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      switch (choice) {
        case "1" -> competition.printBackCrawl(ui, backCrawlSwimmersJunior);
        case "2" -> competition.printBreast(ui, breastSwimmersJunior);
        case "3" -> competition.printButterfly(ui, butterflySwimmersJunior);
        case "4" -> competition.printCrawl(ui, crawlSwimmersJunior);
        case "5" -> competition.printBackCrawl(ui, backCrawlSwimmersSenior);
        case "6" -> competition.printBreast(ui, breastSwimmersSenior);
        case "7" -> competition.printButterfly(ui, butterflySwimmersSenior);
        case "8" -> competition.printCrawl(ui, crawlSwimmersSenior);
        case "9" -> isRunning = false;
      }
    } while (isRunning);
  }
}
