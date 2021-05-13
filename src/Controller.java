import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
  ArrayList<Member> members = new ArrayList<>();
  Ui ui = new Ui();
  ManageMembers manageMembers = new ManageMembers();
  Menu menu = new Menu();
  FileHandler fileHandler = new FileHandler();
  Member member = new Member();



  //August & Jens Cobtroller and menu
  public void menuController()  {
    String choice;
    boolean keepRunning;

    do {
      menu.printMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      keepRunning = true;

      switch (choice) {
        case "1":
          ui.display("Print Foreman");
          foremanController();
          break;
        case "2":
          ui.display("Print Cashier");
          break;
        case "3":
          ui.display("Print Coach");
          break;
        case "9":
          ui.display("Bye");
          keepRunning = false;
          break;
        default:
          ui.display("Not valid number");
      }
    } while (keepRunning);
  }

  //August & Jens Controller and menu
  public void foremanController() {
    String choice;
    boolean keepRunning;

    do {
      menu.printForemanMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      keepRunning = true;

      switch (choice) {
        case "1":
          fileHandler.createFile(ui);
          manageMembers.createNewMember(ui,member,members);
          fileHandler.saveFile(members,ui);
          break;
        case "2":
          fileHandler.readFile(ui);
          manageMembers.printMembersList(members);

          break;
        case "3":
          manageMembers.deleteMember(ui,members);
          break;
        case "9":
          ui.display("Closing foreman menu");
          keepRunning = false;
          break;
        default:
          ui.display("Not valid number");
      }
    } while (keepRunning);
  }
}
