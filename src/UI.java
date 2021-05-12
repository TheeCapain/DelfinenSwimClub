import java.util.Scanner;

public class UI {
    Scanner scan =  new Scanner(System.in);

    public void display(String message){
        System.out.println(message);
    }
    public void display(int number){
        System.out.println(number);
    }

    public int scanInt(){
        return scan.nextInt();
    }

}
