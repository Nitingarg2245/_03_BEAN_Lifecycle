package org.example.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean , DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("end of the motor bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("birth of the motor bean ");
    }

    public Motor() {
        System.out.println("constructor is called");
    }

    public  void start(){
        System.out.println("motor is starting ");
    }
    public  void doWork(){
        System.out.println("motor is pulling water  ");
    }
    public  void stop(){
        System.out.println("motor is stopping ");
    }

}
