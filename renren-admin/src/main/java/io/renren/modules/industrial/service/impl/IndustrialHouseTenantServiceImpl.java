package io.renren.modules.industrial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.industrial.dao.IndustrialHouseTenantDao;
import io.renren.modules.industrial.entity.IndustrialHouseTenantEntity;
import io.renren.modules.industrial.service.IndustrialHouseTenantService;


@Service("industrialHouseTenantService")
public class IndustrialHouseTenantServiceImpl extends ServiceImpl<IndustrialHouseTenantDao, IndustrialHouseTenantEntity> implements IndustrialHouseTenantService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<IndustrialHouseTenantEntity> page = this.selectPage(
                new Query<IndustrialHouseTenantEntity>(params).getPage(),
                new EntityWrapper<IndustrialHouseTenantEntity>()
        );

        return new PageUtils(page);
    }

}
