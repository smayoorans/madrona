package org.madrona.effective.java.chapter2.item1;

public class Test {

    public static void main(String[] args) {

        // Providers would execute these lines
        Services.register("dialog", "Hello From Dialog");


        String s = Services.newInstance("dialog");

        System.out.println("Service " + s);


    }
}
