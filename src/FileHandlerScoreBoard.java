import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class FileHandlerScoreBoard {

  public void createScoreBoard(Ui ui) {
    try {
      //Create an instance of the File
      File memberFile = new File("Scoreboard.txt");
      //createNewFile is a boolean that checks if file already exists
      if (memberFile.createNewFile()) {
        ui.display("File Created: " + memberFile.getName());
      } else {
        ui.display("File Loaded");
      }
    } catch (IOException e) {
      ui.display("An error occurred createFile");
    }
  }
/*
  public void saveScoreBoard(ArrayList<Competitor> competitors, Ui ui) {
    try {
      File memberFile = new File("ScoreBoard.txt");
      PrintStream printStream = new PrintStream(memberFile);

      for (int i = 0; i < competitors.size(); i++) {
        Competitor competitor = competitors.get(i);
        String print = "";
        print += competitor.getName() + " ";
        print += competitor.getID() + " ";
        print += competitor.


        printStream.println(print);

      }
      printStream.close();
    } catch (IOException e) {
      ui.display("An error occurred saveFile");
    }
  }
*/
}
