package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        JFrame frame = new JFrame("NameList");

        frame.setContentPane(new Gui().pan1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setVisible(true);
    }
}
