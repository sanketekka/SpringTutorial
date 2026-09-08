## Notes for what has been done in this section

### Spring Qualifiers

In this section, I learned about `@Qualifier` in Spring Boot.

- `@Qualifier` is used when multiple beans of the same type exist in the Spring container.
- It helps Spring decide which specific component should be injected.
- This is especially useful when there are several implementations of the same interface or contract.

### How it is used in the controller

A controller can specify which component to use by adding a qualifier on the dependency injection point.

Example:

```java
@Autowired
@Qualifier("tennisCoach")
private Coach myCoach;
```

This tells Spring: "Use the bean named `tennisCoach` for this controller implementation specifically."

### Key takeaway

`@Qualifier` is used to define on the controller level which component we are implementing specifically, when there are multiple matching beans available.

This makes dependency injection precise and avoids ambiguity in the application context.

