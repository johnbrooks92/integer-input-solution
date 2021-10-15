package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your first integer : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        int z = sum(x,y);
        System.out.print("Your initial sum of two integers is: " + z);
        System.out.print("\n");
        System.out.print("The sum squared is: " + square(z));
        System.out.print("\n");
        System.out.print("The sum cubed is: " + cube(z));
        System.out.print("\n");
    }

    public static int sum(int a, int b) {
        return (a + b);
    }
    public static int square(int s) {
        return (s * s);
    }
    public static int cube(int c) {
        return (c * c * c);
    }
}
