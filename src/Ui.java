import java.io.File;
import java.io.FileNotFoundException;
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
/*
  public Scanner scanFile(File memberFile) {
    Scanner fileReader = null;
    try {
   fileReader = new Scanner(memberFile);
    } catch (FileNotFoundException e) {
      display("No file as argument");
    }
    return fileReader;
  }

  public Scanner closeScanner(){
    Scanner closeScanner = null;
    return closeScanner;
  }
  */
}
