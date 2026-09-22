package com.studentportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

//Data Access Object --> TO DO CRUD OPERATIONS
//Create     --> Insert  --> jdbcTemplate.update(sql, studentinfo..);
//Retrieve   --> Select  --> jdbcTemplate.query(sql);
//Update     --> Update  --> jdbcTemplate.update
//Delete     --> Delete  --> jdbcTemplate.delete

@Controller
public class StudentDAO {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int save(Student student) {

		String sql = "INSERT INTO students70 "
				   + "(fname, lname, email, age, city, state) "
		           + "VALUES (?, ?, ?, ?, ?, ?)";

		    return jdbcTemplate.update(
		    		sql,
		            student.getFname(),
		            student.getLname(),
		            student.getEmail(),
		            student.getAge(),
		            student.getCity(),
		            student.getState()
		     );
		}

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
}
