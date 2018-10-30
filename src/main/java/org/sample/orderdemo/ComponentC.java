package org.sample.orderdemo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(0)
@Component
public class ComponentC extends MyComponent{

    @Override
    String getName() {
        return "ComponentC";
    }
}
