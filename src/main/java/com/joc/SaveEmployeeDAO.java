package com.joc;

import org.springframework.jdbc.core.JdbcTemplate;

public class SaveEmployeeDAO {
         JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Employee e) {
        String query = "insert into employee values ('" + e.getEid() + "', '" + e.getEname() + "', '" + e.getSalary() + "')";
        template.execute(query);
        System.out.println("Record saved successfully");
    }


}
