package io.renren.modules.industrial.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.industrial.entity.IndustrialHouseLeaseEntity;

import java.util.Map;

/**
 * 房屋信息
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:22
 */
public interface IndustrialHouseLeaseService extends IService<IndustrialHouseLeaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

