package org.sample.orderdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class RandomComponent {

    @Autowired
    private List<IBean> beans;

    @Autowired
    private List<MyComponent> comp;

    @PostConstruct
    public void getBeanValues() {
        System.out.println("\n---@Bean---\n");
        for (IBean b : beans) {
            System.out.println(b.getName());
        }
        System.out.println("\n---@Component---\n");
        for (MyComponent c : comp) {
            System.out.println(c.getName());
        }
    }

    @Bean
    @Order(1)
    public IBean getBeanX() {
        return new BeanX();
    }

    @Bean
    @Order(0)
    public IBean getBeanY() {
        return new BeanY();
    }
}
