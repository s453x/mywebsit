package com.website.common.controller;

import org.springframework.stereotype.Controller;
import com.website.common.utils.ShiroUtils;
import com.website.system.domain.UserDO;

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