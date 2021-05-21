import java.util.ArrayList;

public class CashierController {
  CashHandler cashHandler = new CashHandler();


  public void cashierController(Ui ui, Menu menu, ArrayList<Member> members, Member member) {
    String choice;
    boolean keepRunning;
    // "1. Active Members","2. Passive Members"," Debt Members"};

    do {
      menu.cashierMenu(ui);
      ui.display("Enter a number: ");
      choice = ui.scanString();
      keepRunning = true;
      switch (choice) {
        case "1":
          ui.display("MembershipPayment total in kr.");
          cashHandler.displayYearlyTotal(members, ui);
          break;
        case "2":
          ui.display("Total Payment in kr. ");
          cashHandler.displayTotalPaymentConfirm(ui,members);
          break;
        case "3":
          ui.display("Debt total in kr.");
          cashHandler.displayTotalDebt(ui,members);
          break;
        case "4":
          ui.display("Difference between Pay and debt:,");
          cashHandler.differenceTotal(ui,members);
          break;
        case "5":
          ui.display("See Debt Members info");
          cashHandler.dispalyDebtMembersInfo(ui,members);
          break;
        case "9":
          ui.display("Closing foreman menu");
          keepRunning = false;
          break;
        default:
          ui.display("Enter valid number: ");
          break;
      }
    } while (keepRunning);
  }
}
