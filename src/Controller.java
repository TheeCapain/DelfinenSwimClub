import java.util.ArrayList;

public class Controller {
  Bye bye = new Bye();
  Ui ui = new Ui();
  ArrayList<Member> members = new ArrayList<>();
  ArrayList<Member> activeMembers = new ArrayList<>();
  FileHandler fileHandler = new FileHandler();
  Member member = new Member();
  FileHandlerScoreBoard scoreBoard = new FileHandlerScoreBoard();
  ForemanController foreman = new ForemanController();
  CashierController cashier = new CashierController();
  CoachController coach = new CoachController();
  CashHandler cashHandler = new CashHandler();
  Menu menu = new Menu();


public void runController(){
  fileHandler.readFile(ui, members, member);

  cashHandler.sortActiveMember(ui,members,activeMembers,fileHandler);
  menuController();
}
  //August & Je
  // ns Controller and menu
  public void menuController() {
    String choice;
    boolean keepRunning;

    do {
      menu.printMainMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      keepRunning = true;

      switch (choice) {
        case "1" -> foreman.initializeForeman(ui, members, menu, fileHandler);
        case "2" -> cashier.cashierController(ui,menu,members,member);
        case "3" -> coach.coachInitializer(activeMembers,menu);
        case "9" -> {
          bye.bye(ui);
          keepRunning = false;
        }
        default -> ui.display("Not a valid option");
      }
    } while (keepRunning);
  }
}


