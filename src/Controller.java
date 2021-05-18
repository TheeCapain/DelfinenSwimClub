import java.util.ArrayList;

public class Controller {
    Ui ui = new Ui();
    ArrayList<Member> members = new ArrayList<>();
    ArrayList<Member> activeMember = new ArrayList<>();
    FileHandler fileHandler = new FileHandler();
    Member member = new Member();
    ForemanController foreman = new ForemanController();
    Cashier cashier = new Cashier();
    CoachController coach = new CoachController();
    Menu menu = new Menu();



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
                case "1" -> foreman.initializeForeman(ui, members, menu,fileHandler);
                case "2" -> cashier.sortActiveMember(ui,members,activeMember,member,fileHandler);
                case "3" -> coach.coachController();
                case "9" -> {
                    ui.display("Bye");
                    keepRunning = false;
                }
                default -> ui.display("Not a valid option");
            }
        } while (keepRunning);
    }


}

