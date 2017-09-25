package com.cn.hnust.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.UserService;  
  
@Controller
@RequestMapping("user")
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping(value ="main",method = RequestMethod.GET) 
    public String toMain(Model model){  
    
      
        return "main";  
    }  
    
  
    @RequestMapping(value ="showUser",method = RequestMethod.GET) 
    public String getUserInfo(Model model){  
    
    	
    	List<User> userInfos= userService.getUserInfo();
    	System.out.println("list:"+userInfos);
    	model.addAttribute("list",userInfos);
        return "showUser";  
    }  
    
    
}  