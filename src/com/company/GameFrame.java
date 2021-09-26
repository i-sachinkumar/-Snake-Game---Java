package com.company;

import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(int snake_color, int food_color){

        this.add(new GamePanel(snake_color,food_color));
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
