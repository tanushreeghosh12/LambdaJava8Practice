package com.lambda.practice1;

public class Greeter {

    public void greet(Greeting greeting){

        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();

        helloWorldGreeting.perform();
        Greeting myLambdaGreeting = () -> System.out.println("!!Hello World!!");
        myLambdaGreeting.perform();
        greeter.greet(myLambdaGreeting);
    }

}
