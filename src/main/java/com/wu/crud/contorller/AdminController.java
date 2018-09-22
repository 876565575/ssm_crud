package com.wu.crud.contorller;

import com.wu.crud.bean.Admin;
import com.wu.crud.bean.Msg;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * <p>Description: </P>
 *
 * @author Wu
 * @create 2018-09-21-11:27
 */

@RestController
public class AdminController
{
	@RequestMapping(value = "/adminLogin")
	public Msg adminLgoin(@RequestBody Admin admin, HttpSession httpSession)
	{
		System.out.println("admin = " + admin);
		if((admin.getUsername().equals("root"))&& admin.getPassword().equals("root"))
		{
			admin.setPassword(null);
			httpSession.setAttribute("admin", admin);
			return Msg.succes().add("admin", admin);
		}
		return Msg.fail();
	}
}
