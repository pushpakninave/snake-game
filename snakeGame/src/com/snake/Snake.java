package com.snake;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame{
    public Snake(){
        intiUI();
    }

    private void intiUI() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
