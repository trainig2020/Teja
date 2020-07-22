package org.main;

import org.dao.JdbcDaoImpl;
import org.model.Circle;

public class JdbcDemo {

	public static void main(String[] args) {
		Circle circle=new JdbcDaoImpl().getCircle(1);
		System.out.println(circle.getName());

	}

}
