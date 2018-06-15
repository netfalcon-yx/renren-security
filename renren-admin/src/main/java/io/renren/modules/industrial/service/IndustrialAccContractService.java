package io.renren.modules.industrial.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.industrial.entity.IndustrialAccContractEntity;

import java.util.Map;

/**
 * 合同信息
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
public interface IndustrialAccContractService extends IService<IndustrialAccContractEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

