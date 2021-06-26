package StackURL;

public class Main {
    public static void main(String args[]){
        Stack stack = new Stack();

        URL url1 = new URL("www.google.com");
        URL url2 = new URL("www.facebook.com");
        URL url3 = new URL("www.twitter.com");
        URL url4 = new URL("www.espn.com");

        stack.push(url1);
        stack.push(url2);
        stack.push(url3);
        stack.push(url4);

        stack.iterate();

        stack.pop();

        System.out.println("__________");

        System.out.println(stack.peek().getUrl());

        System.out.println("__________");

        stack.iterate();

        System.out.println("__________");

        System.out.println(stack.size());

        System.out.println("__________");

    }
}
