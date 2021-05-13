public class Menu {
  //August & Jens
  private final String[]manageMemberMenu = {"1. Add new member", "2. Print members list ", "3. Delete a member","4. Edit a members info", "9. Back to main menu"};
  private final String[]mainMenu = {"1. Foreman", "2. Cashier","3. Coach", "9. Quit"};
  private final String[]editMemberMenu = {"1. Change name", "2. Change Age", "3. Change memberStatus"};

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

  public void editMemberMenu(Ui ui){
    for(int i = 0; i<editMemberMenu.length;i++){
      ui.display(manageMemberMenu[i]);
    }
  }
}

