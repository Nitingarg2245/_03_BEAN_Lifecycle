package org.example.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*first way to use init and destroy method using XML configuration
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Motor motor=ac.getBean(Motor.class);
        motor.doWork();
        ac.registerShutdownHook();//closing the application context that will remove all the beans from it
        */

        //implementing the interfaces
        ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Motor motor=ac.getBean(Motor.class);
        motor.doWork();
        ac.registerShutdownHook();

        //annotation approach we will learn in future



    }
}