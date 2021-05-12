import java.util.Scanner;

//August
public class Ui {
Scanner scan = new Scanner(System.in);

  public void display(String message) {
    System.out.println(message);
  }

  public void display(int number) {
    System.out.println(number);
  }

  public int scanInt() {
    return scan.nextInt();
  }

  public String scanString() {
    return scan.nextLine();
  }
}
