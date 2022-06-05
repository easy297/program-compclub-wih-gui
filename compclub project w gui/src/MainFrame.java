import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public static Menu menu;
    public static Signup signup;

    public static ListComp listComp;

    public static UserMenu userMenu;

    public static List list;

    public static AdminMenu adminMenu;
    public MainFrame(){
        setSize(500, 400);
        setTitle("COMPUTER CLUB");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        menu = new Menu();
        menu.setLocation(0,0);
        add(menu);

        signup = new Signup();
        signup.setVisible(false);
        signup.setLocation(0,0);
        add(signup);

        list = new List();
        list.setVisible(false);
        list.setLocation(0,0);
        add(list);


        listComp = new ListComp();
        listComp.setVisible(false);
        listComp.setLocation(0,0);
        add(listComp);



        userMenu = new UserMenu();
        userMenu.setVisible(false);
        userMenu.setLocation(0,0);
        add(userMenu);


        adminMenu = new AdminMenu();
        adminMenu.setVisible(false);
        adminMenu.setLocation(0,0);
        add(adminMenu);









    }
}
