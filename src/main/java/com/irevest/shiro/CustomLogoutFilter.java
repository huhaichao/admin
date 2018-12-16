package com.irevest.shiro;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;

/**
 * 扩展LogoutFilter实现动态改变redirectUrl
 */

public class CustomLogoutFilter extends LogoutFilter {

	@Override
	protected boolean preHandle(ServletRequest request, ServletResponse response)
			throws Exception {
		Subject subject = this.getSubject(request, response);

		subject.logout();
		String redirectUrl = "/logout";
		this.issueRedirect(request, response, redirectUrl);
		return false;
	}

}
