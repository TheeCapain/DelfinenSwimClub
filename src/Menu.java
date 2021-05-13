public class Menu {
  //August & Jens
  private final String[]manageMemberMenu = {"1. Add new member", "2. Print members list ", "3. Delete a member","9. Back to main menu"};
  private final String[]mainMenu = {"1. Foreman", "2. Cashier","3. Coach", "9. Quit"};

  //August & Jens
  public void printMenu(Ui ui) {
    for (int i = 0; i < mainMenu.length; i++) {
      ui.display(mainMenu[i]);
    }
  }
  public void printForemanMenu(Ui ui) {
    for (int i = 0; i < manageMemberMenu.length; i++) {
      ui.display(manageMemberMenu[i]);
    }
  }
}

