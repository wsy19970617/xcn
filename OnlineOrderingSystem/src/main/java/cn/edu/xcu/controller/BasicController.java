package cn.edu.xcu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.xcu.service.IBasicService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xcn
 * @since 2019-11-15
 */
@Controller
public class BasicController {

	@Autowired
	private IBasicService iBasicService;

	/*删除功能*/
	@RequestMapping("/delete")
	@ResponseBody
	public Map<String, Object> delete(Integer id) {
		boolean result = iBasicService.removeById(id);
		Map<String, Object> ret = new HashMap<>();
		if (result) {
			ret.put("code", 1);
			ret.put("msg", "删除成功");
		} else {
			ret.put("code", -1);
			ret.put("msg", "删除失败");
		}
		return ret;
	}
	
	/*修改功能*/
	
}
