package com.perscholas.case_study.utilities;

public class OracleQueries {
	public static final String GETUSERBYEMAIL = "SELECT * FROM USERS "
			+ "WHERE EMAIL = ?";
	public static final String REGISTERUSER = "INSERT INTO USERS "
			+ "(EMAIL, PASSWORD, USER_ROLE) "
			+ " VALUES(?, ?, ?)";
			
}
