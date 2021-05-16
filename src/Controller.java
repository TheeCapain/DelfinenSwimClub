import java.util.ArrayList;
import java.util.InputMismatchException;

public class Controller {
  ArrayList<Member> members = new ArrayList<>();
  Ui ui = new Ui();
  ManageMembers manageMembers = new ManageMembers();
  Menu menu = new Menu();
  FileHandler fileHandler = new FileHandler();
  Member member = new Member();


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
      //Scannerbug
      choice = ui.scanString();
      keepRunning = true;

      switch (choice) {
        case "1" -> {
          manageMembers.createNewMember(ui, member, members);
          fileHandler.saveFile(members, ui);


        }
        case "2" -> manageMembers.printMembersList(members, ui);

        case "3" -> {
          manageMembers.deleteMember(ui, members);
          fileHandler.saveFile(members, ui);
        }
        case "4" ->{
          editMemberMenu();
        }
        case "9" -> {
          ui.display("Closing foreman menu");
          keepRunning = false;
        }
      }
    } while (keepRunning);
  }

  //August
  public void editMemberMenu() {
    String choice;
    int memberChoice = 0;
    boolean keepRunning = true;

    do {
      manageMembers.printMembersList(members, ui);
      try {
        ui.display("Which member would you like to edit? Enter memberNR: ");
        memberChoice = ui.scannerBugFixer();
      } catch (InputMismatchException e){
        ui.display("Must be a memberNr");
      }


      ui.display("What would you like to change?");
      menu.printEditMemberMenu(ui);
      choice = ui.scanString();


      switch (choice) {
        case "1" -> {
          manageMembers.editMemberName(members.get(memberChoice - 1), ui);
          fileHandler.saveFile(members, ui);
          keepRunning = false;
        }

        case "2" -> {
          manageMembers.editMemberAge(members.get(memberChoice - 1), ui);
          fileHandler.saveFile(members, ui);
          keepRunning = false;
        }

        case "3" -> {
          manageMembers.editMemberStatus();
          ui.display("This path has not been made yet");
        }

        case "9" -> {
          keepRunning = false;
          menuController();
        }
      }
    } while (keepRunning);
  }
}

