package com.lecloud.lenews.controller;

import com.lecloud.lenews.common.util.LogUtil;
import com.lecloud.lenews.domain.UserBean;
import com.lecloud.lenews.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/user")
public class UserController {

	private final static LogUtil logger = new LogUtil(UserController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest request){
		logger.debug("wyj:12333");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		UserBean user=new UserBean();
		user.setName(name);
		user.setPsaaword(password);
		boolean result =userService.login(user);
		Map m = new HashMap();
		m.put("1",2);

		return "succ";
	}
}
