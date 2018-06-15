package io.renren.modules.industrial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.industrial.dao.IndustrialAccDepDao;
import io.renren.modules.industrial.entity.IndustrialAccDepEntity;
import io.renren.modules.industrial.service.IndustrialAccDepService;


@Service("industrialAccDepService")
public class IndustrialAccDepServiceImpl extends ServiceImpl<IndustrialAccDepDao, IndustrialAccDepEntity> implements IndustrialAccDepService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<IndustrialAccDepEntity> page = this.selectPage(
                new Query<IndustrialAccDepEntity>(params).getPage(),
                new EntityWrapper<IndustrialAccDepEntity>()
        );

        return new PageUtils(page);
    }

}
