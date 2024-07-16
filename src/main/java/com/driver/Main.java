package com.driver;

public class Main
{
    public static void main(String[] args)
    {
        B a= (B) new A();
        System.out.println(a.meth());
        B b=new B();
        System.out.println(b.meth());
    }
}

