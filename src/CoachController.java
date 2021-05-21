import java.util.ArrayList;

public class CoachController {
  Ui ui = new Ui();
  ArrayList<Member> juniorCompetitors = new ArrayList<>();
  ArrayList<Member> seniorCompetitors = new ArrayList<>();
  ArrayList<Competitor> crawlSwimmers = new ArrayList<>();
  ArrayList<Competitor> breastSwimmers = new ArrayList<>();
  ArrayList<Competitor> backCrawlSwimmers = new ArrayList<>();
  ArrayList<Competitor> butterflySwimmers = new ArrayList<>();
  Competitor competitor = new Competitor();
  Competition competition = new Competition();

  public void coachInitializer(ArrayList<Member> activeMember, Menu menu) {
    competition.sortTeamsByAge(activeMember, juniorCompetitors, seniorCompetitors);
    competition.assignSwimTeams(juniorCompetitors, competitor, crawlSwimmers, backCrawlSwimmers, breastSwimmers, butterflySwimmers);

    coachController(menu,juniorCompetitors);
  }

  public void coachController(Menu menu, ArrayList<Member>junior) {

    String choice;
    boolean isRunning = true;
    do {
      menu.printCoachMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      switch (choice) {
        case "1" -> competition.printJuniors(junior,ui);
        case "2" -> competition.printButterfly(ui, butterflySwimmers);
        case "3" -> competition.printCrawl(ui, crawlSwimmers);
        case "4" -> top5Controller(ui,menu);
        case "9" -> isRunning = false;
      }
    } while (isRunning);

  }

  public void top5Controller(Ui ui,Menu menu) {

    String choice;
    boolean isRunning = true;
    do {
      menu.printTop5Menu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      switch (choice) {
        case "1" -> competition.printBackCrawl(ui,backCrawlSwimmers);
        case "2" -> competition.printBreast(ui,breastSwimmers);
        case "3" -> competition.printButterfly(ui, butterflySwimmers);
        case "4" -> competition.printCrawl(ui,crawlSwimmers);
        case "9" -> isRunning = false;
      }
    } while (isRunning);
  }
}
