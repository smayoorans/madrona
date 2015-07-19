package org.madrona.effective.java.chapter2.item1;

public class Test {

    /**
     * Providers Implementations go here
     */

    private static Provider DEFAULT_PROVIDER = () -> () -> "Hello From Default";

    private static Provider DIALOG_PROVIDER = () -> () -> "Hello From Dialog";

    private static Provider MOBITEL_PROVIDER = () -> () -> "Hello From Mobitel";


    public static void main(String[] args) {

        // Providers would execute these lines
        Services.register(DEFAULT_PROVIDER);
        Services.register("dialog", DIALOG_PROVIDER);
        Services.register("mobitel", MOBITEL_PROVIDER);


        //Clients would executes there lines
        Service client1 = Services.newInstance("dialog");
        Service client2 = Services.newInstance("mobitel");
        Service client3 = Services.newInstance();

        System.out.println("Client 1 : " + client1.greeting() + " ,  "
                + "Client 2 : " + client2.greeting() + " ,  "
                + "Client 3 : " + client3.greeting());

    }
}
