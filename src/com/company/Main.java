package com.company;

import java.util.Random;

import static java.lang.String.format;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            ResultPrinter resultPrinter = getResultPrinter(RANDOM.nextInt(3));

            new Application(resultPrinter).calculateAndPrint(RANDOM.nextInt());

        }
    }

    public static ResultPrinter getResultPrinter(int f) {
        if (Math.abs(f) == 0) {
            return new SystemResultPrinter();
        } else if (Math.abs(f) == 1) {
            return new SystemErrorrResultPrinter();
        } else if (Math.abs(f) == 2) {
            System.out.println("in anonymous");
            return new ResultPrinter() {
                @Override
                public void print(String result) {
                    System.out.println("Print via anonymous class instance");
                    System.out.println(result);
                }
            };
        }
        throw new IllegalArgumentException(
                format("couldn't resolve %d", f));
    }
}
