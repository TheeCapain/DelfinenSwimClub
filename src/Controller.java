public class Controller {

  UI ui = new UI();
  Menu menu = new Menu();
//Agust & Jens
  public void menuController() {
    String choice;
    boolean keepRunning;

    do{
      menu.printMenu();
      ui.display("Enter number");
      choice = ui.scanString();
      keepRunning = true;

      switch (choice) {
        case "1":
          ui.display("Print Foreman");
          break;
        case "2":
          ui.display("Print Cashier");
          break;
        case "3":
          ui.display("Print Coach");
          break;
        case "9":
          ui.display("Bye");
          keepRunning = false;
        break;
        default:
          ui.display("Not valid number");
      }

    }while (keepRunning);
  }
}
