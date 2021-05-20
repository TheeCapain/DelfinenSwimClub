import java.util.ArrayList;

public class Controller {
  Ui ui = new Ui();
  ArrayList<Member> members = new ArrayList<>();
  ArrayList<Member> activeMembers = new ArrayList<>();
  FileHandler fileHandler = new FileHandler();
  Member member = new Member();
  ForemanController foreman = new ForemanController();
  CashierController cashier = new CashierController();
  CoachController coach = new CoachController();
  CashHanlder cashHandler = new CashHanlder();
  Menu menu = new Menu();

public void runController(){
  fileHandler.readFile(ui, members, member);
  cashHandler.sortActiveMember(ui,members,activeMembers,member,fileHandler);
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
          ui.display("Bye");
          keepRunning = false;
        }
        default -> ui.display("Not a valid option");
      }
    } while (keepRunning);
  }
}


