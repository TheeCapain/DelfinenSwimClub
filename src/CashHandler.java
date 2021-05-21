import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CashHandler {
  private ArrayList<Member> ConfirmedPayments = new ArrayList<>();
  private ArrayList<Member> notConfirmedPayments = new ArrayList<>();
  private int sumTotalPayment;
  private int sumTotalConfirmPayment;
  private int sumTotalDebt;

  //For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år) 1000 kr. årligt,
  //For seniorsvømmere (18 år og over) 1600 kr. årligt.
  //For medlemmer over 60 år gives der 25 % rabat af seniortaksten.
  //For passivt medlemskab er taksten 500 kr. årligt.

  private void addPayOrNotPay(ArrayList<Member> members) {
    //null stil mit arrry
    ConfirmedPayments.removeAll(members);
    notConfirmedPayments.removeAll(members);

    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getMemberCash() >= members.get(i).getYearlyPayment()) {
        ConfirmedPayments.add(members.get(i));
      } else if (members.get(i).getMemberCash() < members.get(i).getYearlyPayment()) {
        notConfirmedPayments.add(members.get(i));
      }
    }
  }

  public void displayYearlyTotal(ArrayList<Member> members, Ui ui) {
    addPayOrNotPay(members);
    sumTotalPayment = 0;
    for (int i = 0; i < members.size(); i++) {
      int totalsum = members.get(i).getYearlyPayment();
      sumTotalPayment += totalsum;
    }
    ui.display(sumTotalPayment + " kr.");
  }

  public void displayTotalPaymentConfirm(Ui ui, ArrayList<Member> members) {
    addPayOrNotPay(members);
    sumTotalConfirmPayment = 0;
    for (int i = 0; i < ConfirmedPayments.size(); i++) {
      int totalsum = ConfirmedPayments.get(i).getYearlyPayment();
      sumTotalConfirmPayment += totalsum;
    }
    ui.display(sumTotalConfirmPayment + " kr.");
  }

  public void displayTotalDebt(Ui ui, ArrayList<Member> members) {
    addPayOrNotPay(members);
    this.sumTotalDebt = 0;
    for (int i = 0; i < notConfirmedPayments.size(); i++) {
      int totalsum = notConfirmedPayments.get(i).getYearlyPayment();
      sumTotalDebt += totalsum;
    }
    ui.display(sumTotalDebt + " kr.");
  }

  public void differenceTotal(Ui ui, ArrayList<Member> members) {
    addPayOrNotPay(members);
    int differnece = sumTotalPayment - sumTotalDebt;
    ui.display("Total Membership Payment in kr.: " + sumTotalPayment + "\nTotal Membership Debt in kr.: " + sumTotalDebt);
    ui.display("The Total difference: " + differnece);
  }

  public void dispalyDebtMembersInfo(Ui ui, ArrayList<Member> members) {
    addPayOrNotPay(members);
    //YearlyPayment sort
    sort(notConfirmedPayments);
    //Print out
    for (int i = 0; i < notConfirmedPayments.size(); i++) {
      ui.display(notConfirmedPayments.get(i).toString());
    }
  }

  //Todo Agus skal flytte det give mining
  public void sortActiveMember(Ui ui, ArrayList<Member> members, ArrayList<Member> activeMember, FileHandler fileHandler) {
    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getMemberStatus().equals("Active")) {
        activeMember.add(members.get(i));
      }
    }
    fileHandler.saveFile(members, ui);
  }

  public void sort(ArrayList<Member> notPaid) {
    Collections.sort(notPaid, new Comparator<Member>() {
      @Override
      public int compare(Member m1, Member m2) {
        return Integer.valueOf(m2.getYearlyPayment()).compareTo(m1.getYearlyPayment());
      }
    });
  }
}


