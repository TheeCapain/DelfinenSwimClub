import java.util.ArrayList;

public class Cashier {
  //For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år) 1000 kr. årligt,
  //For seniorsvømmere (18 år og over) 1600 kr. årligt.
  //For medlemmer over 60 år gives der 25 % rabat af seniortaksten.
  //For passivt medlemskab er taksten 500 kr. årligt.
  public void setMembershipPayment(Ui ui, ArrayList<Member> members, Member member) {
    boolean keepRunning = true;
    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getMemberStatus().equals("Active")) ;

    }
  }

  public void sortActiveMember(Ui ui, ArrayList<Member> members, ArrayList<Member> activeMember, Member member, FileHandler fileHandler) {
    fileHandler.readFile(ui, members, member);
    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getMemberStatus().equals("Active")) {
        activeMember.add(members.get(i));
      }
    }
    printActiveMember(activeMember);
  }

  public void printActiveMember(ArrayList<Member> activeMember) {
    for (int i = 0; i < activeMember.size(); i++) {
      System.out.println(activeMember.get(i).toString());
    }
  }
}

