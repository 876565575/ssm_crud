package com.wu.crud.service;

import com.wu.crud.bean.Dept;
import com.wu.crud.dao.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptService
{
	@Autowired
	private DeptMapper deptMapper;

	public void addDept(Dept dept)
	{
		deptMapper.insertSelective(dept);
	}

	public void removeDept(Integer deptId)
	{
		deptMapper.deleteByPrimaryKey(deptId);
	}

	@Transactional
	public void modifyDept(Dept dept)
	{
		deptMapper.updateByPrimaryKeySelective(dept);
	}

	public List<Dept> getAllDept()
	{
		List<Dept> depts = deptMapper.selectByExample(null);
		return depts;
	}

	public Dept getDept(Integer deptId)
	{
		Dept dept = deptMapper.selectByPrimaryKey(deptId);
		return dept;
	}
}
