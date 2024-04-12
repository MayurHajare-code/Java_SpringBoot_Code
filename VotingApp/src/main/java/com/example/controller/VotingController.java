package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.pojo.User;
import com.example.pojo.Voting;
import com.example.service.UserService;
import com.example.service.VotingService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class VotingController {
	@Autowired
	private VotingService voteSer;
	
	@Autowired
	private UserService userSer;
	
	 ModelAndView m = new ModelAndView();
	
	 @PostMapping("/add_vot")
	 @ResponseBody
	 public ModelAndView registerData(HttpServletRequest req) {
		 String name = req.getParameter("candidate");
		 HttpSession session = req.getSession();
		 User userSess = (User) session.getAttribute("username");
	        if (userSess != null) {
		 
				 if(userSess.getVoteStatus() == null) {
					 
					 Voting selectedName = voteSer.getByName(name);
					 System.out.println("your vote is : "+name);
					 System.out.println("count is : "+ selectedName);
					 selectedName.setCount(selectedName.getCount() + 1);
					 
					 voteSer.addVot(selectedName); 
						
						userSess.setVoteStatus("done");
						userSer.addUser(userSess); 
					 
					System.out.println("vote Status : "+ userSess.getVoteStatus());
					System.out.println("your vote is : "+name);
					System.out.println("count is : "+ selectedName);
					System.out.println("user count is : "+ userSess.getVoteStatus());
					
					session.setAttribute("success", "Successfully Voted...");
					
			    	m.setViewName("home");
				 }else {
					 session.setAttribute("alredy", "you are alredy voting...");
					 System.out.println("you are alredy voting");
					 m.setViewName("home");
				 }
				 
	        }else {
	        	m.setViewName("login");
	        }
	        
		return m;
	 }
}
