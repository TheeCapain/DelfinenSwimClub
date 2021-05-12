import java.util.ArrayList;

public class ManageMembers {
    //Skal ændres til at modtage en member når den er lavet
    private ArrayList<Member> members = new ArrayList<>();
    Member member;

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

    }

    public void editMemberInfo(){

    }

    public void printMembersList() {
        System.out.println(members.get(0));

    }
}
