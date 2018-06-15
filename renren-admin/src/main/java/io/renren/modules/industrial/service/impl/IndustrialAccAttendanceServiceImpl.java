package io.renren.modules.industrial.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.industrial.dao.IndustrialAccAttendanceDao;
import io.renren.modules.industrial.entity.IndustrialAccAttendanceEntity;
import io.renren.modules.industrial.service.IndustrialAccAttendanceService;


@Service("industrialAccAttendanceService")
public class IndustrialAccAttendanceServiceImpl extends ServiceImpl<IndustrialAccAttendanceDao, IndustrialAccAttendanceEntity> implements IndustrialAccAttendanceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<IndustrialAccAttendanceEntity> page = this.selectPage(
                new Query<IndustrialAccAttendanceEntity>(params).getPage(),
                new EntityWrapper<IndustrialAccAttendanceEntity>()
        );

        return new PageUtils(page);
    }

}
