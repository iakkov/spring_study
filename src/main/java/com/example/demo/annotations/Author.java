package com.example.demo.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface Author {
    String name() default "William";
    int dateOfBirth() default 35;
}
