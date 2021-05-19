import java.util.ArrayList;
import java.util.Scanner;

//August
public class ManageMembers {
  Scanner scan = new Scanner(System.in);

  //Creates new member and adds to the ArrayList
  public void createNewMember(Ui ui, Member member, ArrayList<Member> members) {

    ui.display("Enter name");
    member.setName(ui.scanString());
    ui.display("Enter Age");
    member.setAge(ui.scannerBugFixer());
    member.setID(member.generateRandomId());
    member.setMemberShipType(member.validateMemberShip());
    member.setMemberStatus(member.memberStatusFinal());
    member.setMemberCash(member.generateRandomCash());
    member.setYearlyPayment(member.addMembershipPayment());
    addMemberToList(member, members);


  }

  public void addMemberToList(Member member, ArrayList<Member> members) {
    members.add(new Member(member.getName(), member.getAge(), member.getID(), member.getMemberShipType(), member.getMemberStatus(), member.getMemberCash(),member.getYearlyPayment()));

  }

  //Deletes a member from the members List
  public void deleteMember(Ui ui, ArrayList<Member> members) {
    //Asks user for what member should be deleted and shows list
    //Should show index value of members starting from 1
    printMembersList(members, ui);

    ui.display("Which member do you want to delete");
    int choice = ui.scannerBugFixer();
    //Index 0 correction 1 = 0
    choice = choice - 1;
    try {
      members.remove(choice);
      ui.display("Member Removed...");

    } catch (IndexOutOfBoundsException e) {
      ui.display("There is no member on nr: " + (choice + 1));
    }


  }

  public void printMembersList(ArrayList<Member> members, Ui ui) {

    if (members.size() == 0) {
      ui.display("List is empty");
    } else
      for (int i = 0; i < members.size(); i++) {
        ui.printFormatLines();
        //To Fix indentation: i+1
        ui.display("MemberNR: " + (i + 1) + " " + members.get(i).toString());
        ui.printFormatLines();
      }
  }

  public void editMemberName(Member member, Ui ui) {
    ui.display("What should the new Name be?: ");
    ui.display("Cancel by pressing 0");
    String newName = ui.scanString();

    if (newName.equals("0")) {
      ui.display("Returning to menu");
    } else {
      member.setName(newName);
      ui.display("Name changed...");
    }
  }

  public void editMemberStatus(Member member, Ui ui) {
    boolean keepRunning = true;
    do {
      ui.display("What is the new status on the member?");
      ui.display("Enter 0 for Active and 1 for Passive");
      int newStatus = ui.scannerBugFixer();
      if (newStatus == 0) {
        member.setMemberStatus("Active");
        keepRunning = false;
      } else if (newStatus == 1) {
        member.setMemberStatus("Passive");
        keepRunning = false;
      } else if (newStatus != 0 && newStatus != 1) {
        ui.display("Please enter valid number");
      }
    } while (keepRunning);
  }

  public void editMemberAge(Member member, Ui ui) {
    ui.display("Enter new Age:");
    ui.display("Enter 0 to cancel");
    int newAge;

    while (!scan.hasNextInt()) {

      ui.display("Enter a nr");
      scan.nextLine();
    }
    //Scannerbug fixed
    newAge = scan.nextInt();
    scan.nextLine();
    member.setAge(newAge);
    ui.display("Age changed");
  }
}


