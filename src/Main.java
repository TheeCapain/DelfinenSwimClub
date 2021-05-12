public class Main {

    public static void main(String[]args){
        new Main().run();


    }
    public void run(){
        ManageMembers manage =  new ManageMembers();
//manage.createNewMember();
//manage.printMembersList();
        Menu menu = new Menu();
        Controller controller = new Controller();
        controller.menuController();
    }
}
