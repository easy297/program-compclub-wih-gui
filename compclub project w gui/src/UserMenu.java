import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserMenu extends Container {
    public static JTextArea info;


    public UserMenu(){
        setSize(500, 500);
        setLayout(null);

        JLabel label = new JLabel("WELCOME TO THE COMP CLUB!" );
        label.setBounds(125, -70, 300, 200);
        add(label);
        info = new JTextArea();
        info.setEditable(false);
        info.setBounds(75, 200, 300, 150);
        add(info);
        JLabel comp = new JLabel("YOUR COMPUTER:" );
        comp.setBounds(175, 70, 300, 200);
        add(comp);




        JButton compButton = new JButton("COMP LIST");
        compButton.setBounds(150, 50, 150, 40);
        add(compButton);

        JButton backButton = new JButton("EXIT");
        backButton.setBounds(150, 100, 150, 40);
        add(backButton);

        compButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.userMenu.setVisible(false);
                Main.frame.listComp.setVisible(true);

            }
        });


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Main.frame.userMenu.setVisible(false);
                Main.frame.menu.setVisible(true);

            }
        });



    }
}
