import java.util.ArrayList;

//August
public class ManageMembers {
  //Skal ændres til at modtage en member når den er lavet
  private ArrayList<Member> members = new ArrayList<>();
  Member member;
  UI ui = new UI();

  //Creates new member and adds to the ArrayList
  public void createNewMember() {
    String name = member.getName();
    int age = member.getAge();
    String ID = member.getID();
    MembershipType membershipType = member.getMembershipType();
    boolean memberStatus = member.getMemberStatus();
    int memberCash = member.getMemberCash();
    members.add(new Member(name, age, ID, membershipType, memberStatus, memberCash));
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

  }

  public void printMembersList() {
    System.out.println(members.get(0));

  }
}
