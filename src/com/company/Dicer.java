package com.company;

import java.util.Random;

public class Dicer {
    int number;

    Dicer(int number) {
        this.number = number;
    }

    void throwDicers() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder("{");

        for (int i = 0; i < number; i++){
            stringBuilder.append(random.nextInt(6)+1).append(",");
        }
        stringBuilder.delete(stringBuilder.lastIndexOf(","),stringBuilder.length());
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }

    void Game() {
        int[] result = new int[number];
        for (int i=0; i<number; i++) {
            result[i] = (int) Math.ceil(Math.random()*6);
            System.out.println(result[i]);
        }


}
}
