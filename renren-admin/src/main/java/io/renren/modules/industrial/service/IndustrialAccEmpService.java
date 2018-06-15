package io.renren.modules.industrial.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.industrial.entity.IndustrialAccEmpEntity;

import java.util.Map;

/**
 * 员工信息
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
public interface IndustrialAccEmpService extends IService<IndustrialAccEmpEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

