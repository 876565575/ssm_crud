//package com.wu.crud.service.serviceImp;
//
//import com.wu.crud.bean.Dept;
//import com.wu.crud.dao.DeptMapper;
//import com.wu.crud.service.DeptService;
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
// * @create 2018-09-21-12:38
// */
//public class DeptServiceImp implements DeptService
//{
//	@Autowired
//	private DeptMapper deptMapper;
//	@Override
//	public void addDept(Dept dept)
//	{
//		deptMapper.insertSelective(dept);
//	}
//
//	@Override
//	public void removeDept(Integer deptId)
//	{
//		deptMapper.deleteByPrimaryKey(deptId);
//	}
//
//	@Override
//	public void modifyDept(Dept dept)
//	{
//		deptMapper.updateByPrimaryKeySelective(dept);
//	}
//
//	@Override
//	public List<Dept> getAllDept()
//	{
//		List<Dept> depts = deptMapper.selectByExample(null);
//		return depts;
//	}
//
//	@Override
//	public Dept getDept(Integer deptId)
//	{
//		Dept dept = deptMapper.selectByPrimaryKey(deptId);
//		return dept;
//	}
//}
