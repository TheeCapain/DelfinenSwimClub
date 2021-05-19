import java.util.ArrayList;

public class Controller {
  Ui ui = new Ui();
  ArrayList<Member> juniorCompetitors = new ArrayList<>();
  ArrayList<Member> seniorCompetitors = new ArrayList<>();
  ArrayList<Member> members = new ArrayList<>();
  ArrayList<Member> activeMembers = new ArrayList<>();
  FileHandler fileHandler = new FileHandler();
  Member member = new Member();
  ForemanController foreman = new ForemanController();
  CashierController cashier = new CashierController();
  CoachController coach = new CoachController();
  Menu menu = new Menu();


  //August & Jens Controller and menu
  public void menuController() {
    fileHandler.readFile(ui, members, member);
    String choice;
    boolean keepRunning;

    do {
      menu.printMainMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      keepRunning = true;

      switch (choice) {
        case "1" -> foreman.initializeForeman(ui, members, menu, fileHandler);
        //case "2" -> cashier.cashierController();
        case "3" -> coach.coachInitializer(ui,activeMembers,menu,juniorCompetitors,seniorCompetitors);
        case "9" -> {
          ui.display("Bye");
          keepRunning = false;
        }
        default -> ui.display("Not a valid option");
      }
    } while (keepRunning);
  }
}


