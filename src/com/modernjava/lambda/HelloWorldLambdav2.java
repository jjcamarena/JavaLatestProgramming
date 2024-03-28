package com.modernjava.lambda;

public class HelloWorldLambdav2 {
    public static void main(String[] args) {
        // Implementing helloWorldInterface using Lambda
        HelloWorldInterface helloWorldInterface = () -> "Hello World";
        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}