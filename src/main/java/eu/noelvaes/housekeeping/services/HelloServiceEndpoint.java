package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceEndpoint {
    @Autowired
    private Hello helloService;

    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
