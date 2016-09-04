package com.hrishikeshmishra.springpractice.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by hrishikesh.mishra
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("ch2-beans.xml");
        SequenceGenerator sequenceGenerator = (SequenceGenerator) context.getBean("sequenceGenerator");
        System.out.println(sequenceGenerator.getSequence());
        System.out.println(sequenceGenerator.getSequence());
    }
}
