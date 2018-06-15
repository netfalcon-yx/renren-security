package io.renren.modules.industrial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.industrial.dao.IndustrialHouseLeaselogDao;
import io.renren.modules.industrial.entity.IndustrialHouseLeaselogEntity;
import io.renren.modules.industrial.service.IndustrialHouseLeaselogService;


@Service("industrialHouseLeaselogService")
public class IndustrialHouseLeaselogServiceImpl extends ServiceImpl<IndustrialHouseLeaselogDao, IndustrialHouseLeaselogEntity> implements IndustrialHouseLeaselogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<IndustrialHouseLeaselogEntity> page = this.selectPage(
                new Query<IndustrialHouseLeaselogEntity>(params).getPage(),
                new EntityWrapper<IndustrialHouseLeaselogEntity>()
        );

        return new PageUtils(page);
    }

}
