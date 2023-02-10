package io.csanecki.modulith.firstmodule;

import io.csanecki.modulith.firstmodule.internal.FirstInternalA;
import io.csanecki.modulith.secondmodule.SecondModuleEvent;
import org.springframework.modulith.ApplicationModuleListener;
import org.springframework.stereotype.Component;

@Component
public class FirstA {

    private final FirstInternalA firstInternalA;

    FirstA(FirstInternalA firstInternalA) {
        this.firstInternalA = firstInternalA;
    }

    @ApplicationModuleListener
    public void handle(SecondModuleEvent event) {
        System.out.println("i've got message!");
    }
}
