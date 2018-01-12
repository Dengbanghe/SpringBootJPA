package com.data.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.data.dao.BaseDao;
import com.data.entity.User;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author DengBangHe
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	BaseDao bd;
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getUsers")
	public String getUsers(Model model){
		List<User> list = bd.selectAllByType("from User where 1=1", User.class);
		model.addAttribute("userList", list);
		return "index";
	}

	@RequestMapping(value = "/getUser")
	@ResponseBody
	public Object getUser(){
		List<User> list = bd.selectAllByType("from User where 1=1", User.class);
		return  list;
	}


}
