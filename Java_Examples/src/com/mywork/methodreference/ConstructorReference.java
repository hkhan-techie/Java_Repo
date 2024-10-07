package com.mywork.methodreference;

interface Informable {
    Information getInfo(String msg);
}

class Information {
    Information(String msg) {
        System.out.print(msg);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Informable hello = Information::new;
        hello.getInfo("Hello Constructor Reference.");
    }
}
