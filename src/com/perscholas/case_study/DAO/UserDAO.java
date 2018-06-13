package com.perscholas.case_study.DAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.perscholas.case_study.models.User;
import com.perscholas.case_study.utilities.OracleQueries;

public class UserDAO {
	
	
	//*************Register User***********************************
		public int registerUser(User user) throws SQLException {
			// user = null;
			System.out.println(user);
			Connection conn = null;
		    PreparedStatement stmt = null;
		    ResultSet result = null;
		    Integer ID = -1;
		    String[] COL = {"user_id"};

//		    String SAVE = "INSERT INTO USERS"
//		            + "(ID, NAME, EMAIL, PASSWORD) "
//		            + "VALUES(?, ?, ?, ?)";
		    		    
		    //OracleConnection oracle = new OracleConnection();
		    try
		    {
		        conn = OracleConnection.getConnection();
		        stmt = conn.prepareStatement(OracleQueries.REGISTERUSER, COL);
		        stmt.setString(1, user.getEmail());
		        stmt.setString(2, user.getPassword());
		        stmt.setInt(3, 0);

		        
		        stmt.executeUpdate();
		        result = stmt.getGeneratedKeys();
		        
		        if(result != null && result.next()) {
		            ID = result.getInt(1);
		        }
		        System.out.println(ID);
		    }
		    catch (ClassNotFoundException | IOException | SQLException e)
		    {
		        e.printStackTrace();
		    }
		    finally {
		    	if (result != null) {
		    		result.close();
		    	}
		    	if (stmt != null) {
		    		stmt.close();
		    	}
		    	if (conn != null) {
		    		conn.close();
		    	}
		    }        
		    
		    return ID; 
		}

	//*************Login User***********************************
		public User loginUser(String email) {
		    Connection conn = null;
		    PreparedStatement stmt = null;
		    ResultSet result = null;
		    User currentUser = new User();
		    
		    String SAVE = "SELECT * FROM USERS WHERE EMAIL = ?";
		    OracleConnection oracle = new OracleConnection();
		    
		    try
		    {
		        conn = OracleConnection.getConnection();
		        stmt = conn.prepareStatement(SAVE);
		        stmt.setString(1, email);
		        
		        result = stmt.executeQuery();
		        if (result.next()) {
		        	currentUser.setUser_id(result.getInt(1));
		        	currentUser.setEmail(result.getString(2));
		        	currentUser.setPassword(result.getString(3));
		        }
		    }
		    catch (ClassNotFoundException | IOException | SQLException e)
		    {
		        e.printStackTrace();
		    }
		    return currentUser;
		}
		
	//*************Get All Users***********************************
		public List<User> getAllUsers() throws SQLException {
		    Connection conn = null;
		    PreparedStatement stmt = null;
		    ResultSet result = null;
		    User thisUser = null;
		    List<User> allUsers = null;
		    
		    String SAVE = "SELECT * FROM CUSTOMERS";
		    OracleConnection oracle = new OracleConnection();
			
		    allUsers = new ArrayList<User>();
		    
		    try
		    {
		        conn = oracle.getConnection();
		        stmt = conn.prepareStatement(SAVE);
		        
		        result = stmt.executeQuery();
		        
		        while (result.next()) {
		        	thisUser = new User();
		        	thisUser.setUser_id(result.getInt(1));
		        	thisUser.setEmail(result.getString(2));
		        	thisUser.setPassword((result.getString(3)));
		        	thisUser.setUser_role(result.getInt(4));
		        	allUsers.add(thisUser);
		        }
		    }
		    catch (ClassNotFoundException | IOException | SQLException e)
		    {
		        e.printStackTrace();
		    }
	        finally {
	        	if (result != null) {
	        		result.close();
	        	}
	        	if (stmt != null) {
	        		stmt.close();
	        	}
	        	if (conn != null) {
	        		conn.close();
	        	}
	        }
		    
			return allUsers;
		}
		
		//*************Get User email***********************************

		
		public User getUserByEmail(String email) throws SQLException {
			Connection conn = null;
		    PreparedStatement stmt = null;
		    ResultSet result = null;
		    User user = null;
		    
		    try {
				conn = OracleConnection.getConnection();
				stmt = conn.prepareStatement(OracleQueries.GETUSERBYEMAIL);
				stmt.setString(1, email);
				
				result = stmt.executeQuery();
				
				if(result.next()) {
					user = new User(result.getInt(1), result.getString(2),
							result.getString(3), result.getInt(4));
				}
			} catch (ClassNotFoundException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    finally {
		    	if(result != null) {
		    		result.close();
		    	}
		    	if(stmt != null) {
		    		stmt.close();
		    	}
		    	if(conn != null) {
		    		conn.close();
		    	}
		    }
		 	   return user;
	    }
	
}
