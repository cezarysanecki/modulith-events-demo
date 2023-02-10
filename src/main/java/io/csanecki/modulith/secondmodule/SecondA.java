package io.csanecki.modulith.secondmodule;

import org.springframework.context.ApplicationEventPublisher;

public class SecondA {

    private final ApplicationEventPublisher publisher;

    SecondA(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

}
