package io.csanecki.modulith.firstmodule;

import io.csanecki.modulith.firstmodule.internal.FirstInternalA;
import io.csanecki.modulith.secondmodule.SecondModuleEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FirstA {

    private final FirstInternalA firstInternalA;

    FirstA(FirstInternalA firstInternalA) {
        this.firstInternalA = firstInternalA;
    }

    @EventListener
    public void handle(SecondModuleEvent event) {
        System.out.println("i got message!");
    }
}
