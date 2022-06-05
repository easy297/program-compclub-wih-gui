import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenu extends Container {

    public AdminMenu(){


        setSize(600, 400);
        setLayout(null);
    /*
        JTextArea textArea = new JTextArea();
        textArea.setBounds(70, 50, 240, 180);
        textArea.setEditable(false);
        add(textArea);

     */


        JLabel numLabel = new JLabel("NUMBER:");
        numLabel.setBounds(100, 50, 100, 30);
        add(numLabel);

        JTextField numField = new JTextField();
        numField.setBounds(200, 50, 200, 30);
        add(numField);

        JLabel nameLabel = new JLabel("NAME:");
        nameLabel.setBounds(100, 100, 100, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 100, 200, 30);
        add(nameField);


        JLabel priceLabel = new JLabel("PRICE:");
        priceLabel.setBounds(100, 150, 100, 30);
        add(priceLabel);

        JTextField loginField = new JTextField();
        loginField.setBounds(200, 150, 200, 30);
        add(loginField);


        JButton addButton = new JButton("ADD COMP");
        addButton.setBounds(100, 200, 140, 30);
        add(addButton);

        JButton backButton = new JButton("EXIT");
        backButton.setBounds(250, 200, 150, 30);
        add(backButton);



        JButton listButton = new JButton("LIST");
        listButton.setBounds(200, 275, 110, 30);
        add(listButton);



        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.list.setVisible(true);
                Main.frame.adminMenu.setVisible(false);

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menu.setVisible(true);
                Main.frame.adminMenu.setVisible(false);

            }
        });









        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(numField.getText());
                boolean check = false;
                Comp comp = new Comp(number,nameField.getText(), Double.parseDouble(loginField.getText()));


                Main.addComp(comp);
                JOptionPane.showInternalMessageDialog(null,"ADDED");
                nameField.setText(null);
                numField.setText(null);
                loginField.setText(null);



            }
        });

    }
}
