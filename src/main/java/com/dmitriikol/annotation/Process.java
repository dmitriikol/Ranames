package com.dmitriikol.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//аннотация для пометки методов находящихся в разработке
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Process {
}
