package com.snake;
import java.awt.EventQueue;

import javax.swing.JFrame;
public class App {
    public static void main(String[] args) throws Exception {
      EventQueue.invokeLater(()->{
        JFrame ex = new Snake();
        ex.setVisible(true);
      });
    }
}
