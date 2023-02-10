package io.csanecki.modulith.firstmodule;

import io.csanecki.modulith.firstmodule.internal.FirstInternalA;
import io.csanecki.modulith.secondmodule.SecondModuleEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class FirstA {

    private final FirstInternalA firstInternalA;

    FirstA(FirstInternalA firstInternalA) {
        this.firstInternalA = firstInternalA;
    }

    @Async
    @Transactional
    @TransactionalEventListener
    public void handle(SecondModuleEvent event) {
        System.out.println("i've got message!");
    }
}
