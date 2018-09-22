package com.wu.crud.filter;

import com.wu.crud.bean.Admin;
import org.springframework.web.servlet.tags.EscapeBodyTag;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * <p>Description: </P>
 *
 * @author Wu
 * @create 2018-09-21-12:27
 */
@WebFilter(value = "/**")
public class AdminFilter implements Filter
{
	public void destroy()
	{
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException
	{
		String url = ((HttpServletRequest)req).getServletPath();
		if(url.indexOf("ogin") >= 0)
		{
			chain.doFilter(req, resp);
		}
		else {
			HttpSession httpSession = ((HttpServletRequest)req).getSession();
			Admin admin = (Admin) httpSession.getAttribute("admin");
			if(admin!= null)
			{
				chain.doFilter(req, resp);
			}
			((HttpServletResponse) resp).sendRedirect("login.html");
		}
	}

	public void init(FilterConfig config) throws ServletException
	{

	}

}
