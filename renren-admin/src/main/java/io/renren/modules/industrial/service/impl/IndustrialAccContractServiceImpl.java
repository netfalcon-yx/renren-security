package io.renren.modules.industrial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.industrial.dao.IndustrialAccContractDao;
import io.renren.modules.industrial.entity.IndustrialAccContractEntity;
import io.renren.modules.industrial.service.IndustrialAccContractService;


@Service("industrialAccContractService")
public class IndustrialAccContractServiceImpl extends ServiceImpl<IndustrialAccContractDao, IndustrialAccContractEntity> implements IndustrialAccContractService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<IndustrialAccContractEntity> page = this.selectPage(
                new Query<IndustrialAccContractEntity>(params).getPage(),
                new EntityWrapper<IndustrialAccContractEntity>()
        );

        return new PageUtils(page);
    }

}
