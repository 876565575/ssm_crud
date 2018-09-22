package com.wu.crud.bean;

/**
 * <p>Description: </P>
 *
 * @author Wu
 * @create 2018-09-20-21:16
 */
public class Admin
{
	private String username;

	private String password;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Override
	public String toString()
	{
		return "Admin{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
