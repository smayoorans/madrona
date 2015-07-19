package org.madrona.effective.java.chapter2.item1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

    private static Map<String, Provider> serviceProviders = new ConcurrentHashMap<>();

    public static void register(String name, Provider providerService) {
        serviceProviders.put(name, providerService);
    }

    public static String newInstance(String name) {
        Provider providerService = serviceProviders.get(name);
        return providerService.newService();
    }
}
