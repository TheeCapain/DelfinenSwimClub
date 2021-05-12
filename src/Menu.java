public class Menu {
  //Agust & Jens
  private final String[]ManageMemberMenu = {"1. Add new member", "2. Delete a member", "3.Edit a member"};
  private final String[]mainMenu = {"1. Foreman", "2. Cashier","3. Coach", "9. Quit"};

  //Agust & Jens
  public void printMenu() {
    for (int i = 0; i < mainMenu.length; i++) {
      System.out.println(mainMenu[i]);
    }
  }
}

