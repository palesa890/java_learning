package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, "Hello "+name);

    int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null,"Your are "+age+" years old");

    double height =Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
    JOptionPane.showMessageDialog(null,"Your are "+height+" cm tall");
    }
}