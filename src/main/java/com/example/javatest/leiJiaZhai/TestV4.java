package com.example.javatest.leiJiaZhai;

public class TestV4 {

    public static void main(String[] args)
    {
        staticFunction();
    }


    static TestV4 book = new TestV4(); //注意该语句

    static
    {
        System.out.println("书的静态代码块");
    }

    {
        System.out.println("书的普通代码块");
    }

    TestV4()
    {
        System.out.println("书的构造方法");
        System.out.println("price=" + price +",amount=" + amount);
    }

    public static void staticFunction(){
        System.out.println("书的静态方法");
    }

    int price = 110;
    static int amount = 112;

}
