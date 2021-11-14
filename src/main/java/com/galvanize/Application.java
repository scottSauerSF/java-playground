package com.galvanize;

public class Application {

    public static void main(String[] args) {
        boolean firstIsActive = false;
        boolean secondIsActive = firstIsActive;

        firstIsActive = !false;

        System.out.println(firstIsActive);
    }
}
