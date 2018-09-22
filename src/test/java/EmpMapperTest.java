import com.wu.crud.bean.Dept;
import com.wu.crud.bean.Emp;
import com.wu.crud.dao.DeptMapper;
import com.wu.crud.dao.EmpMapper;
import com.wu.crud.service.DeptService;
import com.wu.crud.service.EmpService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
		import org.junit.runner.RunWith;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.test.context.ContextConfiguration;
		import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>Description: </P>
 *
 * @author Wu
 * @create 2018-09-21-15:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmpMapperTest
{
	@Autowired
	private DeptMapper deptMapper;
	@Autowired
	private EmpMapper empMapper;
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private DeptService deptService;
	@Autowired
			private EmpService empService;
	int i = 0;
	@Test
	@Transactional
	public void test()
	{

	/*	String ids = "1-2-3-4;";
		int i = ids.indexOf("-4");
		System.out.println("i = " + i);*/
		/*deptService.modifyDept(new Dept(1, "开发部1"));
		int i = 5/0;
		deptService.modifyDept(new Dept(2, "测试部1"));

		System.out.println("deptMapper = " + deptMapper);
		List<Dept> depts = deptMapper.selectByExample(null);
		for(Dept dept : depts)
		{
			System.out.println("dept = " + dept);
		}*/
		/*System.out.println("empMapper = " + empMapper);
		List<Emp> emps = empService.getAllEmp();
		for(Emp emp	: emps)
		{
			System.out.println("emp = " + emp);
		}*/
//		EmpMapper empMapper2 = sqlSession.getMapper(EmpMapper.class);
//		long date1 = System.currentTimeMillis();
//		for(i=0; i<10; i++)
//		{
//			empMapper.insertSelective(new Emp(null, "xx", "男", "xx@qq.com", 1, null));
//		}
//		System.out.println("for循环插入的时间为" + (date1 - System.currentTimeMillis()));
/*		long date2 = System.currentTimeMillis();
		for(i=0; i<1000; i++)
		{
			empMapper2.insertSelective(new Emp(null, "xx", "男", "xx@qq.com", 1, null));
		}
		System.out.println("批量插入的时间为" + (date2 - System.currentTimeMillis()));
		List<Dept> depts = deptService.getAllDept();
		for(Dept dept : depts)
		{
			System.out.println("dept = 00" + dept);
		}*/


	}

}
