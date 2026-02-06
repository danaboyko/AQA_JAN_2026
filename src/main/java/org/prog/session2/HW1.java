package org.prog.session2;

import java.util.Random;

public class HW1 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        Random random = new Random();
        while (true) {
            i = random.nextInt(1000);
            j = random.nextInt(1000);
            System.out.println(i);
            if (i - j % 7 == 0) {
                System.out.println("BREAK ON i-j%7 = 0");
                break;
            }
        }
    }
    }