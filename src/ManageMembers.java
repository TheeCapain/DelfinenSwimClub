import java.util.ArrayList;

//August
public class ManageMembers {
  //Skal ændres til at modtage en member når den er lavet
  private ArrayList<Member> members = new ArrayList<>();
  Member member;
  UI ui = new UI();

  //Creates new member and adds to the ArrayList
  public void createNewMember() {
    ui.display("Enter name of new Member");
    member.setName(ui.scanString());
    ui.display("Enter Age");
    member.setAge(ui.scanInt());
    ui.display("Enter IDnr");
    member.setID(ui.scanString());
    ui.display("Enter desired membership type");
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
    /* skal fejlsikres*/
    int choice = ui.scanInt();

    members.remove(choice);


  }

  public void editMemberInfo() {
    //prints memberlist and show index position
    ui.display("Which member would you like to edit?");
    printMembersList();
    //gets choice to edit
    int choice = ui.scanInt();
    members.get(choice);
    /* Skal laves en menu over de ting man kan ændre ved et member(Navn, alder, membershiptype og status) */
    ui.display("And what would you like to edit?");



  }

  public void printMembersList() {
    System.out.println(members.get(0));

  }
}
