package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gui {
    public JPanel pan1;
    private JTextField input;
    private JButton btn1;
    public JList list;

        ArrayList<String> nameList = new ArrayList<String>();


        public Gui() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nameList.add(input.getText());


                DefaultListModel<String> model = new DefaultListModel<String>();
                JList<String> list = new JList<String>(model);

                for (int i = 0; i < nameList.size(); i++) {
                    model.addElement(nameList.get(i));
                }
            }
        });
    }
}
