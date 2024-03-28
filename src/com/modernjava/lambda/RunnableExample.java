package com.modernjava.lambda;

import java.util.stream.IntStream;

public class RunnableExample {
    public static void main(String[] args) {
        // Runnable traditional example
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Traditional: " + sum);
            }
        };
        new Thread(runnable).start();

        // Implement using Lambda
        Runnable runnable1 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++){
                sum += i;
            }
            System.out.println("Runnable Lambda: " + sum);
        };
        new Thread(runnable1).start();

        // Implement using Tread with Lambda
        new Thread( () -> {
            int sum = IntStream.range(0, 10).sum();
            System.out.println("Thread Lambda: " + sum);
        } ).start();
    }
}
