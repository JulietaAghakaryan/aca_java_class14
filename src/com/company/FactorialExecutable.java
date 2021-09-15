package com.company;

public class FactorialExecutable implements  Executable{

    ///constructori nersum inchi override eghogh method chi kareli kanchel?

    private int number;

    public FactorialExecutable(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void execute() {
        final int number=NumbersHolder.getNumber();//private chi, kara ini package private
    }
}
