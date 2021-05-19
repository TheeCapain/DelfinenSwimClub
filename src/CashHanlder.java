import java.util.ArrayList;

public class CashHanlder {
  private ArrayList<Member> over60DiscountTotal = new ArrayList<>();
  private ArrayList<Member> passiveTotal = new ArrayList<>();

  //For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år) 1000 kr. årligt,
  //For seniorsvømmere (18 år og over) 1600 kr. årligt.
  //For medlemmer over 60 år gives der 25 % rabat af seniortaksten.
  //For passivt medlemskab er taksten 500 kr. årligt.
  public void ActiveMemberTotal(ArrayList<Member> activeMembers) {
    for (int i = 0; i < activeMembers.size(); i++) {
      if (activeMembers.get(i).getAge() < 18){

      }

    }
  }


  public void sortActiveMember(Ui ui, ArrayList<Member> members, ArrayList<Member> activeMember, Member member, FileHandler fileHandler) {
    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getMemberStatus().equals("Active")) {
        activeMember.add(members.get(i));
      }
    }
    fileHandler.saveFile(members,ui);
    //printActiveMember(activeMember);
  }

  public void printActiveMember(ArrayList<Member> activeMember) {
    for (int i = 0; i < activeMember.size(); i++) {
      System.out.println(activeMember.get(i).toString());
    }
  }


  public void setMembershipPayment(ArrayList<Member> activeMembers) {


  }
}


