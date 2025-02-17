package com.example.annotation.builtinannotation.customannotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskInfo {
    int priority() default 1;
    String assignedTo() default "Sweta";
}