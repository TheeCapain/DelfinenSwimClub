import java.util.ArrayList;

//August
public class ManageMembers {

  //Creates new member and adds to the ArrayList
  public void createNewMember(Ui ui, Member member, ArrayList<Member> members) {
    ui.display("Enter name");
    member.setName(ui.scanString());
    ui.display("Enter ID");
    member.setID(ui.scanString());

    ui.display("Enter Age");
    member.setAge(ui.scanInt());
    member.setMemberStatus(true);
    member.setMemberCash(100);
    member.setMemberShipType(member.validateMemberShip());
    addMemberToList(member, members);
  }

  public void addMemberToList(Member member, ArrayList<Member> members) {
    int i = 0;

    if (members.get(i) == null) {
      members.add(i, new Member(member.getName(), member.getAge(), member.getID(), member.getMemberShipType(), member.getMemberStatus(), member.getMemberCash()));
    }


  }

  //Deletes a member from the members List
  public void deleteMember(Ui ui, ArrayList<Member> members) {
    //Asks user for what member should be deleted and shows list

    //Should show index value of members starting from 1

    boolean run = true;

do {

  if (members.size() == 0) {
    ui.display("There are no members on the list");
    run =false;
  }
  ui.display("Which member do you want to delete");
  int choice = ui.scanInt();
  if (members.get(choice) == null) {
    ui.display("This nr is empty");
  } else {
    members.remove(choice);
  }
} while (run);


  }


  public void printMembersList(ArrayList<Member> members, Ui ui) {

    if (members.size() == 0) {
      ui.display("List is empty");
    } else

      for (int i = 1; i < members.size(); i++) {
        ui.printFormatLines();
        ui.display("MemberNR: " + i + " " + members.get(i).toString());
        ui.printFormatLines();
      }

  }

}
