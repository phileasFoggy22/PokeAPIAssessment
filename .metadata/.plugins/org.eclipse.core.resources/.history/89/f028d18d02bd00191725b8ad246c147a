package com.qa.poke;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@Autowired
	MemberRepo repo;
	
	@RequestMapping("home")
	public ModelAndView home(User member) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("member", member);
		mv.setViewName("Home");
		return mv;
	}
	@RequestMapping("addUser")
	public String addUser(Member member1)
	{
		repo.save(member1);
		return "Home";
	}
	@RequestMapping("getUser")
	public ModelAndView getUser(@RequestParam int memberNumber)
	{
		ModelAndView mv = new ModelAndView("Members");
		ModelAndView mv404 = new ModelAndView("Members404");
		Member mem1 = repo.findById(memberNumber).orElse(null);
		if(mem1 == null) {
			return mv404;
		}
		mv.addObject(mem1);
		return mv;
	}
	@RequestMapping("getUsers")
	public ModelAndView getUsers()
	{
		ModelAndView mvall = new ModelAndView("MemberList");
		List<Member> mem1 = (List<Member>) repo.findAll();
		mvall.addObject(mem1);
		return mvall;
	}
}
