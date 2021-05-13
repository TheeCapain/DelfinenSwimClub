public class Member {
  // Jens
  private String name;
  private int age;
  private String ID;
  private final String[] MEMBER_SHIP_TYPE = {"Juniorswimmer","Seniorswimmer","Senior60"};
  private String memberShipType;
  private boolean memberStatus;
  private int memberCash;


  // Jens
  public Member(String name, int age, String ID,String memberShipType, boolean memberStatus, int memberCash) {
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

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getID() {
    return ID;
  }

  public void setMemberShipType(String memberShipType) {
    this.memberShipType = validateMemberShip();
  }

  public String getMemberShipType() {
    return memberShipType;
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

  public void setMemberStatus(boolean memberStatus) {
    this.memberStatus = memberStatus;
  }

  public boolean getMemberStatus() {
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
    return "Member " +
        "\nName: " + name +
        "\nAge: " + age +
        "\nID: " + ID +
        "\nMembershipType: " + MEMBER_SHIP_TYPE +
        "\nMemberStatus: " + memberStatus +
        "\nMemberCash: " + memberCash;
  }
}

