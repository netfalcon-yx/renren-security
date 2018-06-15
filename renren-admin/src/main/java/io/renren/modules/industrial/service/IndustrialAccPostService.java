package io.renren.modules.industrial.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.industrial.entity.IndustrialAccPostEntity;

import java.util.Map;

/**
 * 岗位信息
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
public interface IndustrialAccPostService extends IService<IndustrialAccPostEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

