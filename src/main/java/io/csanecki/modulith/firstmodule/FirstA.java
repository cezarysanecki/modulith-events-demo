package io.csanecki.modulith.firstmodule;

import org.springframework.stereotype.Component;
import io.csanecki.modulith.firstmodule.internal.FirstInternalA;

@Component
public class FirstA {

  private final FirstInternalA firstInternalA;

  FirstA(FirstInternalA firstInternalA) {
    this.firstInternalA = firstInternalA;
  }
}
