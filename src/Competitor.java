import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class Competitor implements Comparable<Competitor>{
  private String name;
  private int ID;
  private LocalDateTime localDateTime;
  private LocalTime timer;
  private final String[] swimTypes = {"Crawl", "BackCrawl", "Breast", "Butterfly"};
  private String discipline;
  Random rand = new Random();

  public Competitor(String name, int ID, String discipline, LocalDateTime localDateTime, LocalTime timer) {
    this.name = name;
    this.ID = ID;
    this.discipline = discipline;
    this.localDateTime = localDateTime;
    this.timer = timer;
  }

  public Competitor() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }


  public void setLocalDateTime() {
    this.localDateTime = LocalDateTime.now();
  }

  public LocalDateTime getLocalDateTime() {
    return localDateTime;
  }

  public LocalTime getRandomTime() {
    int time = rand.nextInt(400 - 200);
    return LocalTime.ofSecondOfDay(time);
  }

  public void setTimer(LocalTime timer) {
    this.timer = timer;
  }

  public LocalTime getTimer() {
    return timer;
  }

  public void setDiscipline(String discipline) {
    this.discipline = discipline;
  }

  public String randomizeDiscipline() {
    int surprise = rand.nextInt(4);
    return discipline = swimTypes[surprise];

  }

  public String getDiscipline() {
    return discipline;
  }



  @Override
  public String toString() {
    return
        "\nname: " + name +
            "\nID: " + ID +
            "\nDate and time: " + localDateTime +
            "\nSwimTime: " + timer +
            "\nDiscipline: " + discipline;
  }

  @Override
  public int compareTo(Competitor o) {
    return getTimer().compareTo(o.getTimer());
  }


}

