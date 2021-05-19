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
  CashHanlder cashandler = new CashHanlder();
  Menu menu = new Menu();

public void runController(){
  fileHandler.readFile(ui, members, member);
  cashandler.sortActiveMember(ui,members,activeMembers,member,fileHandler);
  menuController();
}
  //August & Jens Controller and menu
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
<<<<<<< HEAD
        //case "2" -> cashier.cashierController();
        case "3" -> coach.coachInitializer(ui,activeMembers,menu,juniorCompetitors,seniorCompetitors);
=======
        case "2" -> cashier.cashierController(ui, menu,activeMembers);
        case "3" -> {
          coach.coachInitializer(activeMembers,menu);
        }
>>>>>>> 4ca738f9237054e8cdc10f70538f79e02447b9e6
        case "9" -> {
          ui.display("Bye");
          keepRunning = false;
        }
        default -> ui.display("Not a valid option");
      }
    } while (keepRunning);
  }
}


