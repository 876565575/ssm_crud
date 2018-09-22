package com.wu.crud.service;

import com.wu.crud.bean.Emp;
import com.wu.crud.bean.EmpExample;
import com.wu.crud.dao.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>Description: </P>
 *
 * @author Wu
 * @create 2018-09-21-12:59
 */
@Service
@Transactional
public class EmpService
{
	@Autowired
	private EmpMapper empMapper;

	public void modifyEmp(Emp emp)
	{
		empMapper.updateByPrimaryKeySelective(emp);
	}

	public void removeEmp(Integer empId)
	{
		empMapper.deleteByPrimaryKey(empId);
	}

	public void addEmp(Emp emp)
	{
		empMapper.insertSelective(emp);
	}

	public Boolean checkName(String empName)
	{
		EmpExample empExample = new EmpExample();
		EmpExample.Criteria criteria = empExample.createCriteria();
		criteria.andEmpNameEqualTo(empName);
		List<Emp> emps = empMapper.selectByExample(empExample);
		if(emps.size() > 0)
		{
			return false;
		}
		return true;
	}

	public List<Emp> getAllEmp()
	{
		List<Emp> emps = empMapper.selectByExampleWithDept(null);
		return emps;
	}

	public Emp getEmp(Integer empID)
	{
		Emp emp = empMapper.selectByPrimaryKeyWithDept(empID);
		return emp;
	}

	public void deleteBatch(List<Integer> ids)
	{
		EmpExample empExample = new EmpExample();
		EmpExample.Criteria criteria = empExample.createCriteria();
		criteria.andEmpIdIn(ids);
		empMapper.deleteByExample(empExample);
	}
}
