package com.company;

import java.util.Scanner;

public class SnakeGame {
    public static void main(String[] args) {
        System.out.println("Choose Snake color:");
        System.out.println("1. GREEN");
        System.out.println("2. BLUE");
        System.out.println("3. WHITE");
        System.out.println("4. YELLOW");

        Scanner sc = new Scanner(System.in);
        int snake_color = sc.nextInt();

        System.out.println("Choose Food color:");
        System.out.println("1. GREEN");
        System.out.println("2. BLUE");
        System.out.println("3. WHITE");
        System.out.println("4. YELLOW");

        int food_color = sc.nextInt();

        new GameFrame(snake_color, food_color );
    }
}
