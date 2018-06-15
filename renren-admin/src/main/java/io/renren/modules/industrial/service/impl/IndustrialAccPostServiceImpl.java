package io.renren.modules.industrial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.industrial.dao.IndustrialAccPostDao;
import io.renren.modules.industrial.entity.IndustrialAccPostEntity;
import io.renren.modules.industrial.service.IndustrialAccPostService;


@Service("industrialAccPostService")
public class IndustrialAccPostServiceImpl extends ServiceImpl<IndustrialAccPostDao, IndustrialAccPostEntity> implements IndustrialAccPostService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<IndustrialAccPostEntity> page = this.selectPage(
                new Query<IndustrialAccPostEntity>(params).getPage(),
                new EntityWrapper<IndustrialAccPostEntity>()
        );

        return new PageUtils(page);
    }

}
