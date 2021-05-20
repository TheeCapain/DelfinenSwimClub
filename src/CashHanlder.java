import java.util.ArrayList;

public class CashHanlder {
  private ArrayList<Member> membersPayYeralyPaymentTotal = new ArrayList<>();
  private ArrayList<Member> membersDebtTotal = new ArrayList<>();
  private ArrayList<Member> passiveMembers = new ArrayList<>();
  private int sumPayment;
  private int sumConfirmPayment;
  private int sumDebt;

  //For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år) 1000 kr. årligt,
  //For seniorsvømmere (18 år og over) 1600 kr. årligt.
  //For medlemmer over 60 år gives der 25 % rabat af seniortaksten.
  //For passivt medlemskab er taksten 500 kr. årligt.

  public void addToListPayOrNotPay(ArrayList<Member> members) {
    for (int i = 0; i < members.size(); i++) {
      if(members.get(i).getMemberCash() > members.get(i).getYearlyPayment() ){
        membersPayYeralyPaymentTotal.add(members.get(i));
      } else {
        membersDebtTotal.add(members.get(i));
      }
    }
  }
  public void displayTotalMembershipPayment(ArrayList<Member> members) {
    sumPayment = 0;
    for (int i = 0; i < members.size(); i++) {
      int totalsum = members.get(i).getYearlyPayment();
      sumPayment += totalsum;
    }
    System.out.println(sumPayment + " kr.");
  }
  public void displayTotalPaymentConfirm(ArrayList<Member> members) {
    addToListPayOrNotPay(members);
    sumConfirmPayment = 0;
    for (int i = 0; i < membersPayYeralyPaymentTotal.size(); i++) {
      int totalsum = membersPayYeralyPaymentTotal.get(i).getYearlyPayment();
      sumConfirmPayment += totalsum;
    }
    System.out.println(sumConfirmPayment + " kr.");
  }
  public void displayTotalDebt(ArrayList<Member> members) {
    addToListPayOrNotPay(members);
    sumDebt = 0;
    for (int i = 0; i < membersDebtTotal.size(); i++) {
      int totalsum = membersDebtTotal.get(i).getYearlyPayment();
      sumDebt += totalsum;
    }
    System.out.println(sumDebt + " kr.");
  }
  public void differenceTotal() {
     int differnece = sumPayment - sumDebt;
    System.out.println("TotalMembership Payment in kr.: " + sumPayment + "\nTotal Membership Debt in kr.: " + sumDebt);
    System.out.println("The Total difference: " + differnece);
  }



  public void addPassiveMember(ArrayList<Member> activeMembers) {
    for (int i = 0; i < activeMembers.size(); i++) {
      if (activeMembers.get(i).getMemberStatus().equals("Passive")) {
        passiveMembers.add(activeMembers.get(i));

      }
    }
  }



  public void sortActiveMember(Ui ui, ArrayList<Member> members, ArrayList<Member> activeMember, Member member, FileHandler fileHandler) {
    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getMemberStatus().equals("Active")) {
        activeMember.add(members.get(i));
      }
    }
    fileHandler.saveFile(members, ui);
  }

  public void printActiveMember(ArrayList<Member> activeMember) {
    for (int i = 0; i < activeMember.size(); i++) {
      System.out.println(activeMember.get(i).toString());
    }
  }
}


