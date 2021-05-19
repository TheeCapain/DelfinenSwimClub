import java.util.ArrayList;

public class CoachController {

  ArrayList<Competitor> crawlSwimmers = new ArrayList<>();
  ArrayList<Competitor> breastSwimmers = new ArrayList<>();
  ArrayList<Competitor> backCrawlSwimmers = new ArrayList<>();
  ArrayList<Competitor> butterflySwimmers = new ArrayList<>();
  Competitor competitor = new Competitor();
  Competition competition = new Competition();

  public void coachInitializer(Ui ui, ArrayList<Member> activeMember, Menu menu,ArrayList<Member>juniorCompetitors,ArrayList<Member>seniorCompetitors) {
    competition.sortTeamsByAge(activeMember, juniorCompetitors, seniorCompetitors);
    competition.assignJuniorSwimTeams(ui, juniorCompetitors, seniorCompetitors, competitor, crawlSwimmers,backCrawlSwimmers,breastSwimmers,butterflySwimmers);
    coachController(ui, juniorCompetitors, seniorCompetitors, menu);
  }

  public void coachController(Ui ui, ArrayList<Member> juniorCompetitors, ArrayList<Member> seniorCompetitors, Menu menu) {
    String choice;
    boolean isRunning = true;


    do {
      menu.printCoachMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      switch (choice) {
        case "1" -> competition.printBackCrawl(ui, backCrawlSwimmers);
        case "2" -> competition.printButterfly(ui,butterflySwimmers);
        case "3" -> competition.printCrawl(ui,crawlSwimmers);
        case "4" -> competition.printBreast(ui,breastSwimmers);
        case "9" -> isRunning = false;
      }
    } while (isRunning);

  }

  public void top5Controller(Ui ui) {
    String choice;
    boolean isRunning = true;
    ui.display("Enter number:");

    do {
      choice = ui.scanString();
      switch (choice) {
        case "1" -> System.out.println("asd");
        case "2" -> ui.display("test");
        case "3" -> ui.display("asfasf");
        case "4" -> ui.display("hdfh");
        case "9" -> isRunning = false;
      }
    } while (isRunning);
  }
}
