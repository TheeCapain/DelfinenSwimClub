public class Member {
  // Jens
  private String name;
  private int age;
  private String ID;
  private MembershipType membershipType;
  private boolean memberStatus;
  private int memberCash;

  // Jens
  public Member(String name, int age, String ID, MembershipType membershipType, boolean memberStatus, int memberCash) {
    this.name = name;
    this.age = age;
    this.ID = ID;
    this.membershipType = membershipType;
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

  public void setMembershipType() {
    this.membershipType = validateMemberShip();
  }

  public MembershipType validateMemberShip(){
    if (getAge() < 18) {
      membershipType = MembershipType.JUNIORSWIMMER;
    } else if (getAge() > 18 && getAge() < 60)
      membershipType = MembershipType.SENIORSWIMMER;
    else {
      membershipType = MembershipType.SENIORO60;
    }
    return membershipType;
  }

  public MembershipType getMembershipType() {
    return membershipType;
  }
  // Tine eller Patrik

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
        "\nMembershipType: " + membershipType +
        "\nMemberStatus: " + memberStatus +
        "\nMemberCash: " + memberCash;
  }
}

