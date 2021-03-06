


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;



public class Signup extends Container {
    public Signup(){
        setSize(500, 500);
        setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(75, 50, 100, 100);
        add(label);

        JLabel nameLabel = new JLabel("NAME:");
        nameLabel.setBounds(125, 50, 100, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(225, 50, 200, 30);
        add(nameField);

        JLabel surnameLabel = new JLabel("EMAIL:");
        surnameLabel.setBounds(125, 100, 100, 30);
        add(surnameLabel);

        JTextField surnameField = new JTextField();
        surnameField.setBounds(225, 100, 200, 30);
        add(surnameField);


        JLabel loginLabel = new JLabel("LOGIN:");
        loginLabel.setBounds(125, 150, 100, 30);
        add(loginLabel);

        JTextField loginField = new JTextField();
        loginField.setBounds(225, 150, 200, 30);
        add(loginField);

        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setBounds(125, 200, 100, 30);
        add(passwordLabel);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(225, 200, 200, 30);
        add(passwordField);

        JButton singButton = new JButton("Sing up");
        singButton.setBounds(125, 250, 140, 40);
        add(singButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(275, 250, 150, 40);
        add(backButton);

        singButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{


                    User user = new User(loginField.getText(), passwordField.getText(), nameField.getText(), surnameField.getText());
                    Main.addUser(user);
                    JOptionPane.showInternalMessageDialog(null, "SUCCESS");









                }catch (Exception a){
                    a.printStackTrace();
                }

                nameField.setText(null);
                surnameField.setText(null);
                loginField.setText(null);
                passwordField.setText(null);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.signup.setVisible(false);
                Main.frame.menu.setVisible(true);
            }
        });

    }}
