package com.modernjava.lambda;

public class HelloWorldLambdav1 {
    public static void main(String[] args) {
        // Implementing sayHelloWorld from interface using Lambda
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World";
        };
        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
