package com.msi;
import com.B;

public class A extends B implements I {
    String a = "Hello";
    public static void main(String[] args) {
        B b = new B() {
            public String getHello() {
                return "from B";
            }
        };
        b.sayHello();
        new A().sayHello();
    }

    public String getHello() {
        return "from A";
    }
}
