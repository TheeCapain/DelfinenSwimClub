public class Menu {
  //Agust & Jens
  private final String[]manageMemberMenu = {"1. Add new member", "2. Delete a member", "3. Print members list","9. Back to main menu"};
  private final String[]mainMenu = {"1. Foreman", "2. Cashier","3. Coach", "9. Quit"};

  //Agust & Jens
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

