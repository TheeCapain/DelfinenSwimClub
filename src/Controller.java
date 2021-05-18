import java.util.ArrayList;

public class Controller {
    Ui ui = new Ui();
    ArrayList<Member> members = new ArrayList<>();
    ForemanController foreman = new ForemanController();
    CashierController cashier = new CashierController();
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
                case "1" -> foreman.initializeForeman(ui, members, menu);
                case "2" -> cashier.cashierController();
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

