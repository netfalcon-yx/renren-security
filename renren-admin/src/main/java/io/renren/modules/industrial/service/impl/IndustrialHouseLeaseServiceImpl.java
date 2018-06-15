package io.renren.modules.industrial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.industrial.dao.IndustrialHouseLeaseDao;
import io.renren.modules.industrial.entity.IndustrialHouseLeaseEntity;
import io.renren.modules.industrial.service.IndustrialHouseLeaseService;


@Service("industrialHouseLeaseService")
public class IndustrialHouseLeaseServiceImpl extends ServiceImpl<IndustrialHouseLeaseDao, IndustrialHouseLeaseEntity> implements IndustrialHouseLeaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<IndustrialHouseLeaseEntity> page = this.selectPage(
                new Query<IndustrialHouseLeaseEntity>(params).getPage(),
                new EntityWrapper<IndustrialHouseLeaseEntity>()
        );

        return new PageUtils(page);
    }

}
