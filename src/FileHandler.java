import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

//Jens og August
public class FileHandler {


  //@TODO Spørg tine hvordan man kan trigger try/catch+test

  public void createFile(Ui ui) {
    try {
      //Create an instance of the File
      File memberFile = new File("MemberList.txt");
      //createNewFile is a boolean that checks if file already exists
      if (memberFile.createNewFile()) {
        ui.display("File Created: " + memberFile.getName());
      } else {
        ui.display("File already exists");
      }
    } catch (IOException e) {
      ui.display("An error occurred createFile");
    }
  }


  public void saveFile(ArrayList<Member> members, Ui ui) {
    try {
      File memberFile = new File("MemberList.txt");
      PrintStream printStream = new PrintStream(memberFile);

      for (int i = 0; i < members.size(); i++) {
        Member member = members.get(i);
        String print = "";
        print += member.getName() + ", ";
        print += member.getAge() + ", ";
        print += member.getID() + ", ";
        print += member.getMembershipType() + ", ";
        print += member.getMemberStatus() + ", ";
        print += member.getMemberCash();

        printStream.println(print);

      }
      printStream.close();
      // @TODO spræger igen hvad Exception e?
    } catch (IOException e) {
      ui.display("An error occurred saveFile");
    }
  }

  public void readFile(Ui ui) {
    try {
      File memberFile = new File("MemberList.txt");
      Scanner scanFile = new Scanner(memberFile);

      while (scanFile.hasNextLine()) {
        String data = scanFile.nextLine();
        System.out.println(data);

      }
      scanFile.close();
    } catch (FileNotFoundException e) {
      ui.display("File not found");
      e.printStackTrace();
    }

  }
}