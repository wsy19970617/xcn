package cn.edu.xcu.service.impl;

import cn.edu.xcu.entity.Basic;
import cn.edu.xcu.mapper.BasicMapper;
import cn.edu.xcu.service.IBasicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xcn
 * @since 2019-11-15
 */
@Service
public class BasicServiceImpl extends ServiceImpl<BasicMapper, Basic> implements IBasicService {
@Autowired
private BasicMapper basicMapper;
	@Override
	public boolean addBasic(Basic basic) {
		int ret=basicMapper.insert(basic);
		if(ret>0) {
			return true;
		}else {
			return false;
		}
	}

}
