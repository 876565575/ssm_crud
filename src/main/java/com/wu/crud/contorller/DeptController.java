package com.wu.crud.contorller;

import com.wu.crud.bean.Dept;
import com.wu.crud.bean.Msg;
import com.wu.crud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>Description: </P>
 *
 * @author Wu
 * @create 2018-09-21-11:27
 */
@RestController
public class DeptController
{
	@Autowired
	private DeptService deptService;
	//添加部门
	@PostMapping(value = "/dept")
	public Msg addDept(@RequestBody Dept dept)
	{
		System.out.println(dept.toString());
		deptService.addDept(dept);
		return Msg.succes();
	}

	//删除部门
	@DeleteMapping(value = "/dept")
	public Msg removeDept(Integer deptId)
	{
		System.out.println(deptId);
		deptService.removeDept(deptId);
		return Msg.succes();
	}

	//修改部门信息
	@PutMapping(value = "/dept")
	public Msg modifyDept(@RequestBody Dept dept)
	{
		System.out.println(dept.toString());
		deptService.modifyDept(dept);
		return Msg.succes();
	}

	//遍历部门
	@GetMapping(value = "/depts")
	public Msg getAllDept()
	{
		List<Dept> depts = deptService.getAllDept();
		return Msg.succes().add("depts", depts);
	}

	//按id查找部门
	@GetMapping(value = "/dept")
	public Msg getDept(Integer deptId)
	{
		Dept dept = deptService.getDept(deptId);
		return Msg.succes().add("dept", dept);
	}

}
