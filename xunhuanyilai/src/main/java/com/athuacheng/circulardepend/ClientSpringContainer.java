package com.athuacheng.circulardepend;

import com.athuacheng.circulardepend.pojo.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientSpringContainer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = context.getBean("a",A.class);
        a.aa();
    }
}
