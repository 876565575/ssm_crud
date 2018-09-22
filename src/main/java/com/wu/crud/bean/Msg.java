package com.wu.crud.bean;

import org.aspectj.weaver.ast.Test;
import org.springframework.validation.ObjectError;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Description: </P>
 *
 * @author Wu
 * @create 2018-09-21-11:29
 */
public class Msg
{
	//状态码，100-成功，200-失败
	private int code;
	//提示信息信息
	private String msg;
	//返还给客户端的数据
	private Map<String, Object> extend = new HashMap<>();

	//请求处理成功
	public static Msg succes()
	{
		Msg result = new Msg();
		result.setCode(100);
		result.setMsg("请求处理成功！");
		return result;
	}

	//请求处理失败
	public static Msg fail()
	{
		Msg result = new Msg();
		result.setCode(200);
		result.setMsg("请求处理失败！");
		return result;
	}

	//添加需要返回的数据
	public Msg add(String key, Object value)
	{
		this.getExtend().put(key, value);
		return this;
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public Map<String, Object> getExtend()
	{
		return extend;
	}

	public void setExtend(Map<String, Object> extend)
	{
		this.extend = extend;
	}
}
