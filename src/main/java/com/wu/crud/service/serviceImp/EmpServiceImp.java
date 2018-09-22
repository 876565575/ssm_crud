//package com.wu.crud.service.serviceImp;
//
//import com.wu.crud.bean.Emp;
//import com.wu.crud.dao.EmpMapper;
//import com.wu.crud.service.EmpService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
///**
// * <p>Description: </P>
// *
// * @author Wu
// * @create 2018-09-21-13:03
// */
//public class EmpServiceImp implements EmpService
//{
//	@Autowired
//	private EmpMapper empMapper;
//	@Override
//	public void modifyEmp(Emp emp)
//	{
//		empMapper.updateByPrimaryKeySelective(emp);
//	}
//
//	@Override
//	public void removeEmp(Integer empId)
//	{
//		empMapper.deleteByPrimaryKey(empId);
//	}
//
//	@Override
//	public void addEmp(Emp emp)
//	{
//		empMapper.insertSelective(emp);
//	}
//
//	@Override
//	public List<Emp> getAllEmp()
//	{
//		List<Emp> emps = empMapper.selectByExampleWithDept(null);
//		return emps;
//	}
//
//	@Override
//	public Emp getEmp(Integer empID)
//	{
//		Emp emp = empMapper.selectByPrimaryKeyWithDept(empID);
//		return emp;
//	}
//}
