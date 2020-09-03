package com.jds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jds.dto.Employee;
import com.jds.service.EmployeeService;


/**
* @author whj
* @date 2020-9-3 17:04:01
* @Description   
*/
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
	// 查询所有数据
	@RequestMapping("findlist")
	public ModelAndView findlist() {
		ModelAndView modelAndView =new ModelAndView("list");
		List<Employee>  list = empService.listall();
		modelAndView.addObject("list",list);
		return modelAndView;
	}
	
	//添加信息
	@RequestMapping("insertemp")
	public String insertemp(Employee emp) {
		empService.addemp(emp);
		//重定向到查询
		return "redirect:findlist";
	}
	
	//删除信息
	@RequestMapping("deleteemp")
	public String deleteemp(int id) {
		empService.deleteemp(id);
		//重定向到查询
		return "redirect:findlist";
	}
	
	
	//修改之前的查询数据详情
	@RequestMapping("findemp")
	public ModelAndView findemp(int id) {
		ModelAndView  modelAndView =new ModelAndView("findemp");
		Employee emp = empService.findbyemp(id);
		modelAndView.addObject("emp",emp);
		return  modelAndView;
	}
	@RequestMapping("updateemp")
	public String  updateemp(Employee emp) {
	empService.updateemp(emp);
	return "redirect:findlist";
	}
}
