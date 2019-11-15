package cn.edu.xcu.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.xcu.entity.Basic;
import cn.edu.xcu.service.IBasicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xcn
 * @since 2019-11-15
 */
@Controller

public class BasicController {
	@Autowired
	private IBasicService iBasicService;
	@RequestMapping("/toBasicAdd")
	public String toBasicAdd(Basic basic) {
		boolean ret=iBasicService.addBasic(basic);
		if(ret) {
			return "/main";
		}else {
		return "redirect:/toBasicAdd";
		}
	}
}

