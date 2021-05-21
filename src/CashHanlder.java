import java.util.ArrayList;
import java.util.Collections;


public class CashHanlder {
  private ArrayList<Member> paid = new ArrayList<>();
  private ArrayList<Member> notPaid = new ArrayList<>();
  private int sumPayment;
  private int sumConfirmPayment;
  private int sumDebt;

  //For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år) 1000 kr. årligt,
  //For seniorsvømmere (18 år og over) 1600 kr. årligt.
  //For medlemmer over 60 år gives der 25 % rabat af seniortaksten.
  //For passivt medlemskab er taksten 500 kr. årligt.

  public void addPayOrNotPay(ArrayList<Member> members) {

    paid.removeAll(members);
    notPaid.removeAll(members);
    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getMemberCash() >= members.get(i).getYearlyPayment()) {
        paid.add(members.get(i));
      } else if (members.get(i).getMemberCash() < members.get(i).getYearlyPayment()){
        notPaid.add(members.get(i));
      }
    }
  }

  public void displayYearlyTotal(ArrayList<Member> members, Ui ui) {
    sumPayment = 0;
    for (int i = 0; i < members.size(); i++) {
      int totalsum = members.get(i).getYearlyPayment();
      sumPayment += totalsum;
    }
    ui.display(sumPayment + " kr.");
  }

  public void displayTotalPaymentConfirm(Ui ui) {
    sumConfirmPayment = 0;
    for (int i = 0; i < paid.size(); i++) {
      int totalsum = paid.get(i).getYearlyPayment();
      sumConfirmPayment += totalsum;
    }
    ui.display(sumConfirmPayment + " kr.");
  }

  public void displayTotalDebt(Ui ui) {
    //addPayOrNotPay(members);
    sumDebt = 0;
    for (int i = 0; i < notPaid.size(); i++) {
      int totalsum = notPaid.get(i).getYearlyPayment();
      sumDebt += totalsum;
    }
    ui.display(sumDebt + " kr.");
  }

  public void differenceTotal(Ui ui) {
    int differnece = sumPayment - sumDebt;
    ui.display("TotalMembership Payment in kr.: " + sumPayment + "\nTotal Membership Debt in kr.: " + sumDebt);
    ui.display("The Total difference: " + differnece);
  }

  public void dispalyDebtMembersInfo(Ui ui) {
    //YearlyPayment sort
    Collections.sort(notPaid);
    //Print out
    for (int i = 0; i < notPaid.size(); i++) {
      ui.display(notPaid.get(i).toString());
    }
  }

  public void sortActiveMember(Ui ui, ArrayList<Member> members, ArrayList<Member> activeMember, Member
      member, FileHandler fileHandler) {
    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getMemberStatus().equals("Active")) {
        activeMember.add(members.get(i));
      }
    }
    fileHandler.saveFile(members, ui);
  }
}


