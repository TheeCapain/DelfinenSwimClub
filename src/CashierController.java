import java.util.ArrayList;

public class CashierController {
CashHanlder cashHanlder = new CashHanlder();
  public void cashierController(Ui ui, Menu menu,ArrayList<Member> members,Member member) {

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
          ui.display("Active Members total");
          cashHanlder.displayTotalMembershipPayment(members);

          break;
        case "2":
          ui.display("Passive Members total");
          cashHanlder.displayTotalPaymentConfirm(members);
          break;
        case "3":
          ui.display("Debt Members total");
          cashHanlder.displayTotalDebt(members);
          break;
        case "4":
          ui.display("Difference Total");
          cashHanlder.differenceTotal();
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
