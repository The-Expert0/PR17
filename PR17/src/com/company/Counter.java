package com.company;
import java.lang.*;

public class Counter {
    private String [] args;
    public Counter(String [] args) {
        this.args = args;
    }
    void printArgs() {
        for (int i=0;i<args.length; i++)
            System.out.println(args[i]);
    }
}
