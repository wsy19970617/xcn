package cn.edu.xcu.service;

import cn.edu.xcu.entity.Basic;

import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xcn
 * @since 2019-11-15
 */
@Transactional
public interface IBasicService extends IService<Basic> {
	boolean addBasic(Basic basic);
}
