package io.renren.modules.industrial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.industrial.dao.IndustrialAccEmpDao;
import io.renren.modules.industrial.entity.IndustrialAccEmpEntity;
import io.renren.modules.industrial.service.IndustrialAccEmpService;


@Service("industrialAccEmpService")
public class IndustrialAccEmpServiceImpl extends ServiceImpl<IndustrialAccEmpDao, IndustrialAccEmpEntity> implements IndustrialAccEmpService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<IndustrialAccEmpEntity> page = this.selectPage(
                new Query<IndustrialAccEmpEntity>(params).getPage(),
                new EntityWrapper<IndustrialAccEmpEntity>()
        );

        return new PageUtils(page);
    }

}
