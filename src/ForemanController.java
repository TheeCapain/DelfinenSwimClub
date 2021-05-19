import java.util.ArrayList;
import java.util.InputMismatchException;

public class ForemanController {

    ManageMembers manageMembers = new ManageMembers();

    Member member = new Member();

    //August & Jens Controller and menu
    public void initializeForeman(Ui ui, ArrayList<Member> members, Menu menu,FileHandler fileHandler) {
        fileHandler.createFile(ui);
        foremanController(ui,menu,members,fileHandler);
    }

    public void foremanController(Ui ui, Menu menu,ArrayList<Member>members,FileHandler fileHandler) {
        String choice;
        boolean keepRunning;

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

                case "3" -> {
                    manageMembers.deleteMember(ui, members);
                    fileHandler.saveFile(members, ui);
                }
                case "4" -> editMemberController(ui, menu,members,fileHandler);
                case "9" -> {
                    ui.display("Closing foreman menu");
                    keepRunning = false;
                }
            }
        } while (keepRunning);
    }

    //August
    public void editMemberController(Ui ui, Menu menu,ArrayList<Member>members,FileHandler fileHandler) {
        String choice;
        int memberChoice = 0;
        boolean keepRunning = true;

        do {
            manageMembers.printMembersList(members, ui);
            try {
                ui.display("Which member would you like to edit? Enter memberNR: ");
                memberChoice = ui.scannerBugFixer();
            } catch (InputMismatchException e) {
                ui.display("Must be a memberNr");
            }


            ui.display("What would you like to change?");
            menu.printEditMemberMenu(ui);
            choice = ui.scanString();


            switch (choice) {
                case "1" -> {
                    manageMembers.editMemberName(members.get(memberChoice - 1), ui);
                    fileHandler.saveFile(members, ui);
                }

                case "2" -> {
                    manageMembers.editMemberAge(members.get(memberChoice - 1), ui);
                    fileHandler.saveFile(members, ui);
                }

                case "3" -> {
                    manageMembers.editMemberStatus(members.get(memberChoice - 1), ui);
                    fileHandler.saveFile(members, ui);
                }

                case "9" -> keepRunning = false;

            }
        } while (keepRunning);
    }

}
