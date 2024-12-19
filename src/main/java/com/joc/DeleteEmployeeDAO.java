package com.joc;

import org.springframework.jdbc.core.JdbcTemplate;

public class DeleteEmployeeDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }


    public void deleteEmployee(Employee e){
        String query="delete  from employee where ename='"+e.getEname()+"'";
        template.execute(query);
        System.out.println("Record deleted successfully");
    }

}
