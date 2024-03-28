package com.modernjava.lambda;

public class HelloWorldTraditionalWay implements HelloWorldInterface {

    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorldTraditionalWay helloWorldOldWay = new HelloWorldTraditionalWay();
        System.out.println(helloWorldOldWay.sayHelloWorld());
    }
}