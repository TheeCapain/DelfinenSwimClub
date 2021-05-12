import java.io.FileNotFoundException;
import java.util.ArrayList;

//August
public class ManageMembers {
  //TODO spørg tine om ny instance ved hvert kald

  //Creates new member and adds to the ArrayList
  public void createNewMember() throws FileNotFoundException {
    ui.display("Enter name");
    member.setName(ui.scanString());

    ui.display("Enter Age");
    member.setAge(ui.scanInt());
  //Hardcoded for eksempel skyld
    member.setID(ui.scanString());
    member.setMembershipType(MembershipType.JUNIORSWIMMER);

    member.setMemberStatus(true);
    member.setMemberCash(100);
    members.add(new Member(member.getName(), member.getAge(), member.getID(), member.getMembershipType(), member.getMemberStatus(), member.getMemberCash()));

  }

  //Deletes a member from the members List
  public void deleteMember() {
    //Asks user for what member should be deleted and shows list
    ui.display("Which member would you like to delete?: ");
    //Should show index value of members starting from 1
    printMembersList();
    //Gets scanner from ui and stores the value in choice
    /*TODO skal fejlsikres*/
    int choice = ui.scanInt();

    members.remove(choice);

  }

  public void editMemberInfo() {
    //prints memberlist and show index position
    ui.display("Which member would you like to edit?");
    printMembersList();
    //gets choice to edit
    int choice = ui.scanInt();

    if (choice > members.size()) {
      ui.display("There is no member with that number");
    } else {
      members.get(choice);
    }

    /*TODO Skal laves en menu over de ting man kan ændre ved et member(Navn, alder, membershiptype og status) */
    ui.display("And what would you like to edit?");
  }

  public void printMembersList() {
    for (int i = 0; i < members.size(); i++) {
      System.out.println(members.get(i).toString());
    }
  }

}
