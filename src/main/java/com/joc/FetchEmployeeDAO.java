package com.joc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FetchEmployeeDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public List<Employee>getAllEmployees(){
        String query = "select * from employee";
        return template.query(query, new ResultSetExtractor<List<Employee>>() {
            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Employee> elist = new ArrayList<>();
                while(rs.next()){
                    Employee emp =new Employee();
                    emp.setEid(rs.getInt(1));
                    emp.setEname(rs.getString(2));
                    emp.setSalary(rs.getFloat(3));
                    elist.add(emp);
                }
                return elist;
            }
        });
    }
}
