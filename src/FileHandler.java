import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

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


  public void saveFile(ArrayList members,Ui ui)  {
    try {
      File memberFile = new File("MemberList.txt");
      PrintStream printStream = new PrintStream(memberFile);

      for (int i = 0; i < members.size(); i++) {
        Member member = (Member) members.get(i);
        String print = "";
        print+=member.getName();
        print+=member.getAge();
        print+=member.getID();
        print+=member.getMembershipType();
        print+=member.getMemberStatus();
        print+=member.getMemberCash();

        printStream.println(print);

      }
      printStream.close();
   // @TODO spræger igen hvad Exception e?
    }catch (IOException e) {
      ui.display("An error occurred saveFile");
    }

  }


}