import java.util.ArrayList;

public class CashHanlder {
  private ArrayList<Member> over60WhitDiscounts = new ArrayList<>();
  private ArrayList<Member> passiveMembers = new ArrayList<>();
  int under18;

  //For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år) 1000 kr. årligt,
  //For seniorsvømmere (18 år og over) 1600 kr. årligt.
  //For medlemmer over 60 år gives der 25 % rabat af seniortaksten.
  //For passivt medlemskab er taksten 500 kr. årligt.

  public void setMembershipPayment(ArrayList<Member> members,ArrayList<Member> member) {
    for (int i = 0; i < members.size() ; i++) {
      if (members.get(i).getAge() < 60){
        under18 = 1000;

      }

    }

  }
  public void addPassiveMember(ArrayList<Member> activeMembers) {
    for (int i = 0; i < activeMembers.size(); i++) {
      if (activeMembers.get(i).getMemberStatus().equals("Passive")) {
        passiveMembers.add(activeMembers.get(i));

      }
    }
  }
public void addDiscuntOver60(ArrayList<Member> seniorCompetitors){
  for (int i = 0; i < seniorCompetitors.size(); i++) {
    if (seniorCompetitors.get(i).getAge() > 60){
      over60WhitDiscounts.add(seniorCompetitors.get(i));
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
  }

  public void printActiveMember(ArrayList<Member> activeMember) {
    for (int i = 0; i < activeMember.size(); i++) {
      System.out.println(activeMember.get(i).toString());
    }
  }



}


