import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class List extends Container {
    public List(){
        setSize(500, 500);
        setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 50, 350, 180);
        textArea.setEditable(false);
        add(textArea);


        JButton listButton = new JButton("LIST");
        listButton.setBounds(70, 250, 110, 30);
        add(listButton);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(200, 250, 110, 30);
        add(backButton);




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
                Main.frame.list.setVisible(false);
                Main.frame.adminMenu.setVisible(true);


            }
        });



    }
}
