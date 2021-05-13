import java.util.ArrayList;

//August
public class ManageMembers {
  //TODO spørg tine om ny instance ved hvert kald

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
    members.add(new Member(member.getName(), member.getAge(), member.getID(), member.getMemberShipType(), member.getMemberStatus(), member.getMemberCash()));
  }

  //Deletes a member from the members List
  public void deleteMember(Ui ui, ArrayList<Member> members) {
    //Asks user for what member should be deleted and shows list
    ui.display("Which member would you like to delete?: ");
    //Should show index value of members starting from 1
    int choice = ui.scanInt();
    try {
      if (members.get(choice) == null) {
        ui.display("There is no member on this index");
      } else {
        members.remove(choice);
        ui.display("Member Deleted from system");
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println("test if that works");
    }


  }


  public void printMembersList(ArrayList<Member> members, Ui ui) {

    if (members.size()==0){
      ui.display("List is empty");
    } else

      for (int i = 0; i < members.size(); i++) {
        ui.printFormatLines();
        ui.display( "MemberNR: "+ i +" "+ members.get(i).toString());
        ui.printFormatLines();
      }

  }

}
