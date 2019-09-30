package com.example.overload;

public class Overload {

    public static void main(String[] args) {

        Overload s = new Overload();
        System.out.println(s.sum(10,5));
        System.out.println(s.sum(10, 5, 5));

    }

    public int sum(int a, int b) {
        int totalSum = a + b;
        return totalSum;
    }

    public int sum( int a, int b, int c) {
        int totalSum = a + b + c;
        return totalSum;
    }

}

