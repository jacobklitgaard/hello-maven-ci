package com.example;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Maven!");
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("a change");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

}
// Updated
