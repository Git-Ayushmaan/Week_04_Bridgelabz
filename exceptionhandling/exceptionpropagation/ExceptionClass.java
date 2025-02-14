package com.example.exceptionhandling.exceptionpropagation;

class ExceptionClass {
    void method1() {
        int result = 10 / 0;
    }

    void method2() {
        method1();
    }
}