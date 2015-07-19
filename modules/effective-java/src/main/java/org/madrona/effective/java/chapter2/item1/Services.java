package org.madrona.effective.java.chapter2.item1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

    private static Map<String, Provider> serviceProviders = new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER_NAME = "default";

    public static void register(Provider provider) {
        register(DEFAULT_PROVIDER_NAME, provider);
    }

    public static void register(String name, Provider provider) {
        serviceProviders.put(name, provider);
    }

    public static Service newInstance(String name) {
        Provider provider = serviceProviders.get(name);
        if(provider == null){
            throw new IllegalArgumentException("No Provider Registered with name :" + name);
        }
        return provider.newService();
    }


    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
}
