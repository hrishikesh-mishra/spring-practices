package com.hrishikeshmishra.springpractice.ch2.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by hrishikesh.mishra on 05/09/16.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context =
                new GenericXmlApplicationContext("ch2-beans-product.xml");
        Product aaa = (Product) context.getBean("aaa");
        Product cdrw = (Product) context.getBean("cdrw");
        System.out.println(aaa);
        System.out.println(cdrw);
    }
}
