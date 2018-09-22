package com.wu.crud.contorller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wu.crud.bean.Emp;
import com.wu.crud.bean.Msg;
import com.wu.crud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </P>
 *
 * @author Wu
 * @create 2018-09-21-11:27
 */
@RestController
@RequestMapping("/emp")
public class EmpController
{
	@Autowired
	private EmpService empService;

	//添加员工
	@PostMapping(value = "/addEmp")
	public Msg addEmp(@RequestBody Emp emp)
	{
		empService.addEmp(emp);
		return Msg.succes();
	}

	/*
	 * 查询员工数据（分页）
	 * */
	@GetMapping(value = "/getAll/{pn}")
	public Msg getAll(@PathVariable("pn") Integer pn)
	{
		if (pn == null)
		{
			pn = 1;
		}
		PageHelper.startPage(pn, 5);
		List<Emp> list = empService.getAllEmp();
		PageInfo pageInfo = new PageInfo(list, 5);
		return Msg.succes().add("pageInfo", pageInfo);
	}

	/*
	* 根据id查询员工信息
	* */
	@GetMapping(value = "/getEmp/{empId}")
	public Msg getEmp(@PathVariable(value = "empId")Integer empId)
	{
		Emp emp = empService.getEmp(empId);
		return Msg.succes().add("emp", emp);
	}

	/*
	* 根据id删除员工
	* */
	@DeleteMapping(value = "/removeEmp/{empId}")
	public Msg removeEmp(@PathVariable("empId") Integer empId)
	{
		empService.removeEmp(empId);
		return Msg.succes();
	}

	/*
	* 修改员工信息
	* */
	@PutMapping(value = "/modifyEmp")
	public Msg modifyEmp(@RequestBody Emp emp)
	{
		empService.modifyEmp(emp);
		return Msg.succes().add("emp", emp);
	}

	/*
	 * 检查用户名是否重复
	 * */
	@GetMapping(value = "/checkName")
	public Msg checkName(@RequestParam(value = "empName") String empName)
	{
		if(empService.checkName(empName))
		{
			return Msg.succes();
		}
		return Msg.fail();
	}

	/*
	* 批量删除
	* */
	@DeleteMapping(value = "/removeEmps/{ids}")
	public Msg removeEmps(@PathVariable(value = "ids") String ids)
	{
		if(ids.indexOf("-")>=0)
		{
			String[] str_ids = ids.split("-");
			List<Integer> list = new ArrayList<>();
			for (String	 id : str_ids)
			{
				list.add(Integer.valueOf(id));
			}
			empService.deleteBatch(list);
		}
		else {
			Integer id = Integer.valueOf(ids);
			empService.removeEmp(id);
		}
		return Msg.succes();
	}
}
