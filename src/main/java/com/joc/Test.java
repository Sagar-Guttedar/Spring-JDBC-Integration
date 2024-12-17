package com.joc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        SaveEmployeeDAO s = (SaveEmployeeDAO) ctx.getBean("se");

        Employee emp=new Employee();
        emp.setEid(111);
        emp.setEname("Sagar");
        emp.setSalary(40000.45f);

        s.save(emp);
    }
}
