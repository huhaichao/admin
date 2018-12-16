package com.irevest.common.controller;

import com.irevest.system.domain.UserToken;
import org.springframework.stereotype.Controller;
import com.irevest.common.utils.ShiroUtils;
import com.irevest.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}