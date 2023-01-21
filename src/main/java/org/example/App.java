package org.example;

import java.util.Scanner;

public class App {

    private int k = 0;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        if (k < 0)
            throw new IllegalArgumentException();
        this.k = k;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        App app = (App) o;

        return k == app.k;
    }

    @Override
    public int hashCode() {
        return k;
    }

    public static void main(String[] args) {
        System.out.println("Write two numbers:");
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        System.out.println(add(a,b));

    }
    public static int add (int a, int b){
        return a + b;
    }

    public static boolean odd(int a){
        return a % 2 == 1;
    }

}
