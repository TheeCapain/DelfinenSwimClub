import java.util.Random;

public class Member {
  // Jens
  private String name;
  private int age;
  private int ID;
  private final String[] MEMBER_SHIP_TYPE = {"Juniorswimmer","Seniorswimmer","Senior60"};
  private String memberShipType;
  private final String[] MEMBER_STATUS = {"Active","Passive"};
  private String memberStatus;
  private int memberCash;
  Random rand = new Random();

  // Jens
  public Member(String name, int age, int ID,String memberShipType, String memberStatus, int memberCash) {
    this.name = name;
    this.age = age;
    this.ID = ID;
    this.memberShipType = memberShipType;
    this.memberStatus = memberStatus;
    this.memberCash = memberCash;

  }

  //Overlording så den kan vike i  ManageMembers
  public Member() {

  }
  //August
  public String validateMemberShip() {
    if (getAge() < 18) {
      memberShipType = MEMBER_SHIP_TYPE[0];
    } else if (getAge() > 18 && getAge() < 60)
      memberShipType = MEMBER_SHIP_TYPE[1];
    else {
      memberShipType = MEMBER_SHIP_TYPE[2];
    }
    return memberShipType;
  }
  public String memberStatusFinal() {
    //Active","Passive
    int finalStatus = rand.nextInt(1+1);
    if (finalStatus == 0){
      memberStatus = MEMBER_STATUS[0];
    } else if (finalStatus == 1) {
      memberStatus = MEMBER_STATUS[1];
    }
   return memberStatus;
  }


  // Jens set og get

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public int generateRandomId(){
    return rand.nextInt(9999-1000)+1000;
  }

  public int getID() {
    return ID;
  }

  public void setMemberShipType(String memberShipType) {
    this.memberShipType = validateMemberShip();
  }

  public String getMemberShipType() {
    return memberShipType;
  }

  public void setMemberStatus(String memberStatus) {
    this.memberStatus = memberStatus;
  }

  public String getMemberStatus() {
    return memberStatus;
  }

  public void setMemberCash(int memberCash) {
    this.memberCash = memberCash;
  }

  public int getMemberCash() {
    return memberCash;
  }

  @Override
  public String toString() {
    return
        "\nName: " + name +
        "\nAge: " + age +
        "\nID: " + ID +
        "\nMembershipType: " + memberShipType+
        "\nMemberStatus: " + memberStatus +
        "\nMemberCash: " + memberCash + "\n";
  }
}

