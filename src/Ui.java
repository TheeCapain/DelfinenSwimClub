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

  public int scannerBugFixer(){
    int test = scanInt();
    scanString();
    return test;
  }

  public String scanString() {
    return scan.nextLine();
  }

  public void printFormatLines(){
    System.out.println("----------------------------------------");
  }
}
