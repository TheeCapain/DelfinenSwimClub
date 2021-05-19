import java.util.ArrayList;

public class CoachController {

    public void coachController() {

    }
  ArrayList<Member> juniorCompetitors = new ArrayList<>();
  ArrayList<Member> seniorCompetitors = new ArrayList<>();
  ArrayList<Competitor> crawlSwimmers = new ArrayList<>();
  ArrayList<Competitor> breastSwimmers = new ArrayList<>();
  ArrayList<Competitor> backCrawlSwimmers = new ArrayList<>();
  ArrayList<Competitor> butterflySwimmers = new ArrayList<>();

  Competition competition = new Competition();

  public void coachInitializer(Ui ui, ArrayList<Member> activeMember, Menu menu) {
    coachController(ui, activeMember, juniorCompetitors, seniorCompetitors, menu);
  }

  public void coachController(Ui ui, ArrayList<Member> activeMember, ArrayList<Member> juniorCompetitors, ArrayList<Member> seniorCompetitors, Menu menu) {

    String choice;
    boolean isRunning = true;
    competition.sortTeamsByAge(activeMember, juniorCompetitors, seniorCompetitors);

    do {
      menu.printCoachMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      switch (choice) {
        case "1" -> top5Controller(ui);
        case "2" -> competition.printSeniors(seniorCompetitors, ui);
        case "3" -> competition.printJuniors(juniorCompetitors,ui);
        case "4" -> ui.display("hdfh");
        case "9" -> isRunning = false;
      }
    } while (isRunning);

  }

  public void top5Controller(Ui ui) {
    String choice;
    boolean isRunning = false;
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
