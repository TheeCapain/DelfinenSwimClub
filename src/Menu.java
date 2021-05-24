public class Menu {
  //August & Jens
  private final String[]manageMemberMenu = {"1. Add new member", "2. View member list ", "3. Delete a member",
      "4. Edit a members info", "9. Back to main menu"};
  private final String[]mainMenu = {"1. Foreman", "2. Cashier","3. Coach", "9. Quit"};
  private final String[]editMemberMenu = {"1. Change name", "2. Change Age", "3. Change memberStatus","9. Back to menu"};
  private final String[]CoachMenu = {"1. View top 5","2. Start a competition","3. Back to main menu","9. Back to menu"};
  private final String[]top5Menu = {"1. Top 5 Breast Swim - Junior","2. Top 5 Crawl - Junior",
      "3. Top 5 Back crawl - Junior","4. Top 5 Butterfly - Senior","5. top 5 Breast Stroke - Senior",
      "6. top 5 crawl Stroke - Senior","7. top 5 back crawl Stroke - Senior","8. top 5 Butterfly - Senior",
      "9. Back to Coach Menu"};
  private final String[]cashierMenu = {"1. Display MembershipPayment total","2. Display Total Payment",
      "3. Display Debt Members total",
      "4. Display Difference Total","5. Display Debt Members info","9. Back to Cashier Menu"};

  //August & Jens
  public void printMainMenu(Ui ui) {
    ui.printFormatLines();
    for (int i = 0; i < mainMenu.length; i++) {
      ui.display(mainMenu[i]);
    }
    ui.printFormatLines();
  }
  public void printForemanMenu(Ui ui) {
    ui.printFormatLines();
    for (int i = 0; i < manageMemberMenu.length; i++) {
      ui.display(manageMemberMenu[i]);
    }
    ui.printFormatLines();
  }

  public void printEditMemberMenu(Ui ui){
    ui.printFormatLines();
    for(int i = 0; i<editMemberMenu.length;i++){
      ui.display(editMemberMenu[i]);
    }
    ui.printFormatLines();
  }

  public void printCoachMenu(Ui ui){
    ui.printFormatLines();
    for (int i = 0; i<CoachMenu.length;i++){
      ui.display(CoachMenu[i]);
    }
    ui.printFormatLines();
  }

  public void printTop5Menu(Ui ui){
    ui.printFormatLines();
    for (int i = 0; i < top5Menu.length; i++) {
      ui.display(top5Menu[i]);
    }
    ui.printFormatLines();
  }
  public void cashierMenu(Ui ui) {
    ui.printFormatLines();
    for (int i = 0; i < cashierMenu.length; i++) {
      ui.display(cashierMenu[i]);
    }
    ui.printFormatLines();
  }

}

