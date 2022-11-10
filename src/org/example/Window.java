package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window
{
       public static void main(String[] args) {
        run();
    }

    public static void run()
    {
        final JFrame window = new JFrame("Window");

        ImageIcon img = new ImageIcon("resources/java.png");
        window.setIconImage(img.getImage());

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setColumns(14);

        JPanel panel = new JPanel();

        JButton minButton = new JButton("Свернуть");
        JButton maxButton = new JButton("Растянуть");
        JButton normalButton = new JButton("Вернуть");
        JButton exitButton = new JButton("Выход");
        JButton helloButton = new JButton("Hello");

        helloButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                textField.setText("Hello World!");
            }
        });

        maxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                window.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });

        normalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                window.setExtendedState(JFrame.NORMAL);
            }
        });

        minButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                window.setState(JFrame.ICONIFIED);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                window.setVisible(false);
                System.exit(0);
            }
        });

        panel.add(textField);
        panel.add(helloButton);
        panel.add(minButton);
        panel.add(maxButton);
        panel.add(normalButton);
        panel.add(exitButton);

        window.getContentPane().add(panel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
