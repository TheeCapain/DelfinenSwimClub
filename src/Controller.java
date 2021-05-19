import java.util.ArrayList;

public class Controller {
    Ui ui = new Ui();
    ArrayList<Member> members = new ArrayList<>();
    ArrayList<Member> activeMembers = new ArrayList<>();
    FileHandler fileHandler = new FileHandler();
    Member member = new Member();
    ForemanController foreman = new ForemanController();
    CashierController cashierController = new CashierController();
    Cashier cashier = new Cashier();
    CoachController coach = new CoachController();
    Menu menu = new Menu();



    //August & Jens Controller and menu
    public void menuController() {
        fileHandler.readFile(ui,members,member);
        cashier.sortActiveMember(ui,members,activeMember,member,fileHandler);
        String choice;
        boolean keepRunning;

        do {
            menu.printMainMenu(ui);
            ui.display("Enter number:");
            choice = ui.scanString();
            keepRunning = true;

            switch (choice) {
<<<<<<< HEAD
                case "1" -> foreman.initializeForeman(ui, members, menu, fileHandler);
                case "2" -> {cashier.sortActiveMember(ui, members, activeMembers, member, fileHandler);
                cashier.setMembershipPayment(activeMembers);
            }
                case "3" -> coach.coachController();
=======
                case "1" -> foreman.initializeForeman(ui, members, menu,fileHandler);
                case "2" -> cashier.sortActiveMember(ui,members,activeMember,member,fileHandler);
                case "3" -> coach.coachInitializer(ui, activeMember,menu);
>>>>>>> 8eb98840c2270876d608d104acb87982c463ff08
                case "9" -> {
                    ui.display("Bye");
                    keepRunning = false;
                }
                default -> ui.display("Not a valid option");
            }
        } while (keepRunning);
    }
}

