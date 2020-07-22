package org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class JdbcDaoImpl {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate =new JdbcTemplate();

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	

	/*
	 * public int getCircleCount() { String sql="SELECT count(*)  from circle";
	 * 
	 * return jdbcTemplate.queryforInt(sql);
	 * 
	 * }
	 */
public String getCircleName(int circleId) {
	String sql="SELECT name  from circle where id=?";
	
	return jdbcTemplate.queryForObject(sql,new Object[] {circleId},String.class);
	
}
public Circle getCircleforId(int circleId) {
	String sql="select * from circle where id=?";
	return jdbcTemplate.queryForObject(sql, new Object[] {circleId},new CircleMapper());
	
}
public List<Circle> getAllCircles(){
	String sql="select * from circle";
	return jdbcTemplate.query(sql,new CircleMapper());
}
private static final class CircleMapper implements RowMapper<Circle >{

		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Circle circle=new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("NAME"));
			return circle;
			
		}			
			
	
}
}