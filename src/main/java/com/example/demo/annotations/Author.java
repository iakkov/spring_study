package com.example.demo.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name() default "Iakov";
    int dateOfCreation() default 2025;
}
