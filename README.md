# order-demo
Demo project for showing the usage of `@Order` annotation in Spring Boot

Run the app and you'll see on the console the following:

```
// ... previous content omitted
---@Bean---

BeanY
BeanX

---@Component---

ComponentC
ComponentB
// ... later content omitted
```

This indicates that the `BeanY` has higher precedence and is provided by Spring before `BeanX` because of its higher order precedence (lowest value).
The same principle is applied according to the values printed regarding to `ComponentC` and `ComponentB`.
