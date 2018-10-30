package org.sample.orderdemo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class ComponentB extends MyComponent{
    @Override
    String getName() {
        return "ComponentB";
    }
}
