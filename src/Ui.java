import java.util.Scanner;

//August
public class Ui {
  public static final String BLACK = "\u001B[30m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";
  public static final String BLUE = "\u001B[34m";
  public static final String MAGENTA = "\u001B[35m";
  public static final String CYAN = "\u001B[36m";
  public static final String WHITE = "\u001B[37m";
  Scanner scan = new Scanner(System.in);

  public void displayRED(String message) {
    System.out.println(RED + message + WHITE);
  }

  public void displayBLUE(String message) {
    System.out.println(BLUE + message + WHITE);
  }

  public void display(String message) {
    System.out.println(message);
  }

  public void display(int number) {
    System.out.println(number);
  }

  public int scanInt() {
    return scan.nextInt();
  }

  public int scannerBugFixer() {
    int test = scanInt();
    scanString();
    return test;
  }

  public String scanString() {
    return scan.nextLine();
  }

  public void printFormatLines() {
    System.out.println("----------------------------------------");
  }
}
