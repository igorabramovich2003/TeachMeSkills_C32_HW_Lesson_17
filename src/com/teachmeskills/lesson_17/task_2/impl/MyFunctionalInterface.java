package com.teachmeskills.lesson_17.task_2.impl;

public interface MyFunctionalInterface {
    @FunctionalInterface
    public interface GenericFunction<T> {
        T day();
    }
}
