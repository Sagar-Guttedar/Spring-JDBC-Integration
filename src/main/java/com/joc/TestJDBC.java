package com.joc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestJDBC {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");


        /*// save method
        SaveEmployeeDAO s = (SaveEmployeeDAO) ctx.getBean("se");
        Employee emp=new Employee();
       emp.setEid(112);
        emp.setEname("abc");
        emp.setSalary(50000.45f);

        s.save(emp);*/


        /*// update method
        UpdateEmployeeDAO u= (UpdateEmployeeDAO) ctx.getBean("ue");
        Employee e = new Employee();
        e.setEid(111);
        e.setSalary(100000);

        u.updateEmployee(e);*/

        /*// Delete method
        DeleteEmployeeDAO u=(DeleteEmployeeDAO) ctx.getBean("uee");
        Employee e = new Employee();
        e.setEname("null");
        u.deleteEmployee(e);*/

        //Fetch method
        FetchEmployeeDAO f =(FetchEmployeeDAO) ctx.getBean("fe");
        List<Employee> li =f.getAllEmployees();

        li.forEach(
                (x)->{
                    System.out.println("Employee Id : "+x.getEid()+" Name : "+x.getEname()+" Salary : "+x.getSalary());
                    System.out.println("------------------------------------------------------------------------------");
                }
        );


    }
}
