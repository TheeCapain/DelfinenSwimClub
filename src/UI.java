import java.util.Scanner;

//August
public class UI {


  public void display(String message) {
    System.out.println(message);
  }

  public void display(int number) {
    System.out.println(number);
  }

  public int scanInt(Scanner scan) {
    return scan.nextInt();
  }

  public String scanString(Scanner scan) {
    return scan.nextLine();
  }
}
