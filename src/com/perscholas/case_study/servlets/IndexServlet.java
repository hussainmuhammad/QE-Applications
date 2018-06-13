package com.perscholas.case_study.servlets;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.perscholas.case_study.DAO.UserDAO;
import com.perscholas.case_study.models.User;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //This says start my server at index.html
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
        RequestDispatcher dispatcher = null;
        User user = null;
        UserDAO userDao = new UserDAO();
        String redirPage = "";
        HttpSession session = request.getSession();
       
        
        if(action.equals("login")) {
    		String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            try {
    			user = userDao.getUserByEmail(email);
    			//user remains null after I try to create a user
        		System.out.println("user is "+ user);
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            
            if(user != null) {
            	if(user.getPassword().equals(password) && user.getUser_role().equals(0))  {
            		redirPage = "welcome_route?action=userLogin";
            		session.setAttribute("userkey", user.getEmail());
            	}else if(user.getPassword().equals(password) && user.getUser_role().equals(1)) {
        			redirPage = "admin/adminindex";
        		} else {
        			request.setAttribute("error", "Invalid Credentials");
        			doGet(request, response);
        		}         	
        }else {
        	request.setAttribute("error", "Invalid Credentials");
			doGet(request, response);
        }      

        }
    	else if(action.equals("Registration")) {
    		String email = request.getParameter("email");
    		String password = request.getParameter("password");
    		String confPassword = request.getParameter("confPassword");
    		
    		user = new User(email, password, 0);
    		Integer id = -1;
    		//this is probably the issue
    		try {
				id = userDao.registerUser(user);
				System.out.println(id);
				System.out.println(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	 
    		if(id != null && id != -1) {
    			redirPage = "welcome_route?action=userLogin";
    			session.setAttribute("userkey", user.getEmail());
    		} else {
    			request.setAttribute("error", "Unable to resgister");
    			dispatcher = request.getRequestDispatcher("register.jsp");
    			dispatcher.forward(request, response);
    		}
    	}
	}

	//String confirm_password = request.getParameter("confPassword");
    
//  if(user != null) { //If user is in DB do the following:
//      	if(user.getPassword().equals(password)) {
//      	redirPage = "IndexServlet?action=loggedIn";
//      	}
//      	
//      	else{ //password is incorrect but user exists, do the following
//      		request.setAttribute("error", "Invalid Credentials");
//      		doGet(request, response);
//      	}	
//  }     
//
//doGet(request, response);
//response.sendRedirect("/index");
}
