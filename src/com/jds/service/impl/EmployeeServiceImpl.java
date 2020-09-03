package com.jds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jds.dto.Employee;
import com.jds.mapper.EmployeeMapper;
import com.jds.service.EmployeeService;

/**
* @author whj
* @date 2020-9-3 17:00:51
* @Description   
*/
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeMapper EmployeeMapper;
	@Override
	public List<Employee> listall() {
		// TODO Auto-generated method stub
		return EmployeeMapper.selectByExample(null);
	}

	@Override
	public int addemp(Employee emp) {
		// TODO Auto-generated method stub
		return EmployeeMapper.insertSelective(emp);
	}

	@Override
	public int deleteemp(int id) {
		// TODO Auto-generated method stub
		return EmployeeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Employee findbyemp(int id) {
		// TODO Auto-generated method stub
		return EmployeeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateemp(Employee emp) {
		// TODO Auto-generated method stub
		return EmployeeMapper.updateByPrimaryKey(emp);
	}

}
