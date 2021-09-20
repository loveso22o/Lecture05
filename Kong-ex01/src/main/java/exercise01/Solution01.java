/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Seoyoung Kong
 */

package exercise01;

import java.util.Scanner;

public class Solution01 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
