package com.codegym;

public class Main {

    public static void main(String[] args) {
        System.out.println("Vẽ hình chữ nhật");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%3s", "*");
            }
            System.out.println("");
        }
        System.out.println("Vẽ tam giác vuông ở botton-left ");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%2s", "*");
            }
            System.out.println("");
        }
        System.out.println("Vẽ tam giác vuông ở top-left ");
        for (int i = 5; i > 0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2s", "*");
            }
            System.out.println("");
        }
        System.out.println("Vẽ tam giác cân ");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <= 5-i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4s", "* ");
            }
            System.out.println();
        }
    }
}
