import java.util.ArrayList;

public class Main {
    public static MainFrame frame;
    public static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<Comp> comps = new ArrayList<>();

    public static void addComp(Comp comp){
        comps.add(comp);
    }


    public static void addUser(User user){
        users.add(user);
    }

    public static boolean checkUser(String login , String password, ArrayList<User> users) {
        boolean log = false;
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return log = true;
            }
        }
        return log;
    }




    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);


    }



}

