import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

//Jens og August
public class FileHandler {


  public void createFile(Ui ui) {
    try {
      //Create an instance of the File
      File memberFile = new File("MemberList.txt");
      //createNewFile is a boolean that checks if file already exists
      if (memberFile.createNewFile()) {
        ui.display("File Created: " + memberFile.getName());
      } else {
        ui.display("File Loaded");
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
        print += member.getName() + " ";
        print += member.getAge() + " ";
        print += member.getID() + " ";
        print += member.getMemberShipType() + " ";
        print += member.getMemberStatus() + " ";
        print += member.getMemberCash() + " ";
        print += member.getYearlyPayment();

        printStream.println(print);

      }
      printStream.close();
    } catch (IOException e) {
      ui.display("An error occurred saveFile");
    }
  }

  public void readFile(Ui ui, ArrayList<Member> members, Member member) {
    try {
      File memberFile = new File("MemberList.txt");
      Scanner scanFile = new Scanner(memberFile);
      /* String name, int age, String ID, MembershipType membershipType, boolean memberStatus, int memberCash*/

      while (scanFile.hasNext()) {

        member.setName(scanFile.next());
        member.setAge(scanFile.nextInt());
        member.setID(scanFile.nextInt());
        member.setMemberShipType(scanFile.next());
        member.setMemberStatus(scanFile.next());
        member.setMemberCash(scanFile.nextInt());
        member.setYearlyPayment(scanFile.nextInt());


        members.add(new Member(member.getName(), member.getAge(), member.getID(),
            member.getMemberShipType(), member.getMemberStatus(), member.getMemberCash(),member.getYearlyPayment()));

      }
      scanFile.close();

    } catch (FileNotFoundException e) {
      ui.display("File not found");
      e.printStackTrace();

    }
  }
}