public class Member {
  // Jens
  private String name;
  private int age;
  private String ID;
  private EnumMembershipType enumMembershipType;
  private boolean memberStatus;
  private int memberCash;
  // Jens
  public Member(String name, int age, String ID, EnumMembershipType enumMembershipType, boolean memberStatus, int memberCash){
    this.name = name;
    this.age = age;
    this.ID = ID;
    this.enumMembershipType = enumMembershipType;
    this.memberStatus = memberStatus;
    this.memberCash = memberCash;

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

  public void setEnumMembershipType(EnumMembershipType enumMembershipType) {
    this.enumMembershipType = enumMembershipType;
  }

  public EnumMembershipType getEnumMembershipType() {
    return enumMembershipType;
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
}

