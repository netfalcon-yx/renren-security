package io.renren.modules.industrial.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.industrial.entity.IndustrialAccAttendanceEntity;
import io.renren.modules.industrial.service.IndustrialAccAttendanceService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 考勤记录
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
@RestController
@RequestMapping("industrial/industrialaccattendance")
public class IndustrialAccAttendanceController {
    @Autowired
    private IndustrialAccAttendanceService industrialAccAttendanceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("industrial:industrialaccattendance:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = industrialAccAttendanceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attendanceId}")
    @RequiresPermissions("industrial:industrialaccattendance:info")
    public R info(@PathVariable("attendanceId") Long attendanceId){
        IndustrialAccAttendanceEntity industrialAccAttendance = industrialAccAttendanceService.selectById(attendanceId);

        return R.ok().put("industrialAccAttendance", industrialAccAttendance);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("industrial:industrialaccattendance:save")
    public R save(@RequestBody IndustrialAccAttendanceEntity industrialAccAttendance){
        industrialAccAttendanceService.insert(industrialAccAttendance);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("industrial:industrialaccattendance:update")
    public R update(@RequestBody IndustrialAccAttendanceEntity industrialAccAttendance){
        ValidatorUtils.validateEntity(industrialAccAttendance);
        industrialAccAttendanceService.updateAllColumnById(industrialAccAttendance);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("industrial:industrialaccattendance:delete")
    public R delete(@RequestBody Long[] attendanceIds){
        industrialAccAttendanceService.deleteBatchIds(Arrays.asList(attendanceIds));

        return R.ok();
    }

}
