package com.company;

public class SystemErrorrResultPrinter implements ResultPrinter{
    @Override
    public void print(String result) {
        System.err.println(result);
        //System.setOut  file-i mej tpelu hamar
    }
}
