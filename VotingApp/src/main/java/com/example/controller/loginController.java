package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.pojo.User;
import com.example.pojo.Voting;
import com.example.service.UserService;
import com.example.service.VotingService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class loginController {

	ModelAndView m = new ModelAndView();

	@Autowired
	private UserService userSer;
	@Autowired
	private VotingService voterSer;

	// all pages link

	@RequestMapping("/login")
	@ResponseBody
	public ModelAndView loginPage() {

		m.setViewName("login");
		return m;
	}

	@RequestMapping("/register")
	@ResponseBody
	public ModelAndView registerPage() {
		
		m.setViewName("register");
		return m;
	}

	@RequestMapping("/home")
	@ResponseBody
	public ModelAndView homePage(HttpServletRequest req) {
		HttpSession session = req.getSession();
		User userSess = (User) session.getAttribute("username");
		if (userSess != null) {
			m.setViewName("home");
			return m;
		} else {
			ModelAndView m = new ModelAndView();
			m.setViewName("register");
			return m;
		}
	}

	@RequestMapping("/adminReport")
	@ResponseBody
	public ModelAndView adminReportPage(HttpServletRequest req) {
		HttpSession session = req.getSession();
		User userSess = (User) session.getAttribute("username");
		if (userSess != null) {	
			m.setViewName("adminReport");
			return m;
		} else {
			ModelAndView m = new ModelAndView();
			m.setViewName("register");
			return m;
		}
	}

	@PostMapping("/registration_data")
	@ResponseBody
	public ModelAndView registerData(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String userRole = req.getParameter("userRole");

		User userData = new User();
		userData.setUsername(username);
		userData.setPassword(password);
		userData.setEmail(email);
		userData.setPhone(phone);
		userData.setRole(userRole);
		userSer.addUser(userData);
		System.out.println("Username : " + username + " password : " + password + " userRole : " + userRole);
		
		
		m.setViewName("login");
		return m;
	}

	@GetMapping("/login_data")
	@ResponseBody
	public ModelAndView loginData(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		HttpSession session = req.getSession();
		User userLogData = null;

		List<User> userRegisterData = userSer.getAllUser();
		for (User registeredUser : userRegisterData) {
			if (registeredUser.getUsername().equals(username) && registeredUser.getPassword().equals(password)) {

				if (registeredUser.getRole().equals("admin")) {
					System.out.println("welcome admin");

					userLogData = registeredUser;
					session.setAttribute("username", userLogData);
					System.out.println("session is : " + session.getAttribute("username"));

					Voting selectedName1 = voterSer.getByName("Candidate-1");
					m.addObject("c1Count", selectedName1.getCount());
					System.out.println("count is : " + selectedName1.getCount());

					Voting selectedName2 = voterSer.getByName("Candidate-2");
					m.addObject("c2Count", selectedName2.getCount());
					System.out.println("count is : " + selectedName2.getCount());

					Voting selectedName3 = voterSer.getByName("Candidate-3");
					m.addObject("c3Count", selectedName3.getCount());
					System.out.println("count is : " + selectedName3.getCount());
					
					  Voting selectedName4 = voterSer.getByName("Candidate-4");
				      m.addObject("c4Count", selectedName4.getCount());
				      System.out.println("count is : "+ selectedName4.getCount());
						
					m.setViewName("adminReport");
				}
				if (registeredUser.getRole().equals("user")) {
					System.out.println("welcome user");

					userLogData = registeredUser;
					session.setAttribute("username", userLogData);
					System.out.println("session is : " + session.getAttribute("username"));
					
					m.setViewName("home");
				}
			}else {
				session.setAttribute("wrong", "wrong user detail...");
				System.out.println("wrong user detail...");
			}
		}
		return m;
	}

	@RequestMapping("/logout")
	@ResponseBody
	public ModelAndView logout(HttpServletRequest req) {

		HttpSession session = req.getSession();
		User userSess = (User) session.getAttribute("username");
		if (userSess != null) {
			session.invalidate();
			m.setViewName("login");
			return m;
		} else {
			ModelAndView m = new ModelAndView();
			m.setViewName("register");
			return m;
		}

	}

}
