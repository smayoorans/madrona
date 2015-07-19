package org.madrona.effective.java.chapter2.item1;

public class Test {

    /**
     * Providers Implementations go here
     */

    private static Provider DEFAULT_PROVIDER = new Provider() {
        @Override
        public String newService() {
            return "Hello From Default Provider";
        }
    };

    private static Provider DIALOG_PROVIDER = new Provider() {
        @Override
        public String newService() {
            return "Hello From Dialog";
        }
    };

    private static Provider MOBITEL_PROVIDER = new Provider() {
        @Override
        public String newService() {
            return "Hello From Mobitel";
        }
    };


    public static void main(String[] args) {

        // Providers would execute these lines
        Services.register(DEFAULT_PROVIDER);
        Services.register("dialog", DIALOG_PROVIDER);
        Services.register("mobitel", MOBITEL_PROVIDER);


        //Clients would executes there lines
        String client1 = Services.newInstance("dialog");
        String client2 = Services.newInstance("mobitel");
        String client3 = Services.newInstance();

        System.out.println("Client 1 : " + client1 + " ,  " + "Client 2 : " + client2 + " ,  " + "Client 3 : " + client3);

    }
}
