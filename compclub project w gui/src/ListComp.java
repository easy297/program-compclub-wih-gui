import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.SystemColor.info;

public class ListComp extends Container {
    String[] time = {"1 hour", "2 hour", "3 hour", "night"};
    public ListComp(){
        setSize(500, 500);
        setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(100, 10, 250, 120);
        textArea.setEditable(false);
        add(textArea);
        JLabel timeLabel = new JLabel("Time:");
        timeLabel.setBounds(70, 300, 100, 30);
        add(timeLabel);

        JComboBox timeBox = new JComboBox(time);
        timeBox.setBounds(200, 300, 150, 30);
        add(timeBox);




        JButton listButton = new JButton("LIST");
        listButton.setBounds(100, 150, 110, 30);
        add(listButton);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(250, 150, 110, 30);
        add(backButton);

        JButton ChooseButton = new JButton("CHOOSE");
        ChooseButton.setBounds(175, 200, 110, 30);
        add(ChooseButton);

        JLabel numLabel = new JLabel("NUMBER:");
        numLabel.setBounds(70, 250, 100, 30);
        add(numLabel);

        JTextField numField = new JTextField();
        numField.setBounds(200, 250, 200, 30);
        add(numField);



        ChooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time = (String)timeBox.getSelectedItem();
                double price = 1;
                if(time.equals("2 hour")){
                    price=2;
                }
                else if(time.equals("3 hour")){
                    price=3;
                }
                else if(time.equals("night")){
                    price=2.5;
                }

                for(Comp comp : Main.comps){
                    if(comp.getId()==Integer.parseInt(numField.getText())){
                        UserMenu.info.setText("Number: " + comp.getId() + " Time: " + time + " Price: " + comp.getPrice()*price);


                    }
                }

            }
        });



        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                for(int i=0;i<Main.comps.size();i++){
                    result+=Main.comps.get(i) +"\n";
                }
                textArea.setText(result);

            }
        });


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.listComp.setVisible(false);
                Main.frame.userMenu.setVisible(true);


            }
        });



    }
}
