package com.joc;

import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateEmployeeDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template){
        this.template=template;
    }

    public void updateEmployee(Employee e){

        String query="update employee set salary='"+e.getSalary()+"' where eid='"+e.getEid()+"'";
        template.execute(query);
        System.out.println("Record updated successfully");

    }


}
