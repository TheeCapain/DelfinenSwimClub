import java.time.LocalDateTime;
import java.util.Random;
import java.util.Timer;

public class Competitor {
  private String name;
  private int ID;
  private LocalDateTime localDateTime;
  private Timer timer;
  private final String[] swimTypes = {"Crawl", "Back Crawl", "Breast", "Butterfly"};
  private String discipline;
  Random rand = new Random();

  public Competitor(String name, int ID, String discipline, LocalDateTime localDateTime, Timer timer) {
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

  public void setTimer(Timer timer) {
    this.timer = timer;
  }

  public Timer getTimer() {
    return timer;
  }

  public void setDiscipline(String discipline) {
    this.discipline = discipline;
  }

  public String randomizeDiscipline() {
    int surprise = rand.nextInt(4) + 1;
    return discipline = swimTypes[surprise];

  }

  public String getDiscipline() {
    return discipline;
  }
}
