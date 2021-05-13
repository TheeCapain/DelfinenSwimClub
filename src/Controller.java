import java.util.ArrayList;

public class Controller {
  ArrayList<Member> members = new ArrayList<>();
  Ui ui = new Ui();
  ManageMembers manageMembers = new ManageMembers();
  Menu menu = new Menu();
  FileHandler fileHandler = new FileHandler();
  Member member = new Member();


  //August & Jens Cobtroller and menu
  public void menuController() {
    String choice;
    boolean keepRunning;

    do {
      menu.printMainMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      keepRunning = true;

      switch (choice) {
        case "1" -> {
          keepRunning = false;
          foremanController();
        }
        case "2" -> ui.display("Print Cashier");
        case "3" -> ui.display("Print Coach");
        case "9" -> {
          ui.display("Bye");
          keepRunning = false;
        }
        default -> ui.display("Not a valid option");
      }
    } while (keepRunning);
  }

  //August & Jens Controller and menu
  public void foremanController() {
    String choice;
    boolean keepRunning;
    fileHandler.createFile(ui);
    fileHandler.readFile(ui, members, member);

    do {
      menu.printForemanMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      keepRunning = true;

      switch (choice) {
        case "1" -> {
          manageMembers.createNewMember(ui, member, members);
          fileHandler.saveFile(members, ui);
        }
        case "2" -> manageMembers.printMembersList(members, ui);

        case "3" -> manageMembers.deleteMember(ui, members);

        case "9" -> {
          ui.display("Closing foreman menu");
          keepRunning = false;
          menuController();
        }
        default -> ui.display("Not a valid option");
      }
    } while (keepRunning);
  }

  public void editMemberController() {
    String choice;
    boolean keepRunning;

    do {
    menu.editMemberMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      keepRunning = true;
      switch (choice) {
        case "1" -> {

          keepRunning = false;

        }
        case "2" -> ui.display("Print Cashier");
        case "3" -> ui.display("Print Coach");
        case "9" -> {
          ui.display("Bye");
          keepRunning = false;
        }
        default -> ui.display("Not a valid option");
      }
    } while (keepRunning);
  }
}
