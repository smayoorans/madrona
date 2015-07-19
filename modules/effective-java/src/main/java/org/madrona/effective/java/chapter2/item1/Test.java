package org.madrona.effective.java.chapter2.item1;

public class Test {

    public static void main(String[] args) {

        // Providers would execute these lines
        Services.register("dialog", DIALOG_PROVIDER);
        Services.register("mobitel", MOBITEL_PROVIDER);


        //Clients would executes there lines
        String client1 = Services.newInstance("dialog");
        String client2 = Services.newInstance("mobitel");

        System.out.println("Client 1 : " + client1 + " ,  " + "Client 2 : " + client2);

    }

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
}
