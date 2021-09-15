package com.company;

public class Application {

    private final ResultPrinter resultPrinter;

    public Application(ResultPrinter resultPrinter) {
        this.resultPrinter = resultPrinter;
    }

    public void calculateAndPrint(int number){
        resultPrinter.print(String.valueOf(number/2));//ctrl+alt+b
    }
}
