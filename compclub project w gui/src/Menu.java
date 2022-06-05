import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Container {
    public static String username;

    public Menu(){
        setSize(600, 400);
        setLayout(null);

        JLabel loginLabel = new JLabel("LOGIN:");
        loginLabel.setBounds(100, 100, 100, 30);
        add(loginLabel);

        JTextField loginField = new JTextField();
        loginField.setBounds(200, 100, 200, 30);
        add(loginField);

        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setBounds(100, 150, 100, 30);
        add(passwordLabel);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(200, 150, 200, 30);
        add(passwordField);

        JButton logInButton = new JButton("Log in");
        logInButton.setBounds(100, 200, 140, 40);
        add(logInButton);

        JButton signButton = new JButton("Sign in");
        signButton.setBounds(250, 200, 150, 40);
        add(signButton);

        JButton exitButton = new JButton("exit");
        exitButton.setBounds(175, 250, 150, 40);
        add(exitButton);


        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Main.checkUser(loginField.getText(),passwordField.getText(), Main.users)) {
                    Main.frame.menu.setVisible(false);
                    Main.frame.userMenu.setVisible(true);
                    JOptionPane.showInternalMessageDialog(null, "SUCCESS");
                    username = loginField.getText();
                }

                else if (loginField.getText().equals("admin") && passwordField.getText().equals("password")){
                    Main.frame.menu.setVisible(false);
                    Main.frame.adminMenu.setVisible(true);
                    JOptionPane.showInternalMessageDialog(null, "WELCOME ADMIN");
                }



                else
                    JOptionPane.showInternalMessageDialog(null, "ERROR");
            }
        });


        signButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.signup.setVisible(true);
                Main.frame.menu.setVisible(false);
            }
        });



        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
