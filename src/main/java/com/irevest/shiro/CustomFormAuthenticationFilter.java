package com.irevest.shiro;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {
	/**
	 * 重写登录地址
	 */
	@Override
	protected void redirectToLogin(ServletRequest request,
			ServletResponse response) throws IOException {
		HttpServletRequest req = (HttpServletRequest) request;
		String loginUrl = getLoginUrl();
		String url = req.getRequestURI();
		if (!url.contains("/login")) {
			loginUrl = "/home";
		}
		WebUtils.issueRedirect(request, response, loginUrl);
	}

}
